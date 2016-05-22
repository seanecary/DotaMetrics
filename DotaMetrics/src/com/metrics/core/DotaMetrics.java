package com.metrics.core;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import java.util.ArrayList;

/**
 *
 * @author Sean
 */
public class DotaMetrics {
    
    
    public static void mostSeenHero(int games, String account_id) throws IOException, ParseException, InterruptedException
    {
        ArrayList<DotaMatch> matchList = new ArrayList();
        
        String urlLink = DotaURL.getPlayerGames(account_id);
        URL url = new URL(urlLink);
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.setRequestMethod("GET");
        
        BufferedReader input = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        
        String line;
        String match;
        while(matchList.size()<games)
        {    
            while((line = input.readLine()) != null)
            {
                //System.out.println(line);

                if(line.contains("match_id"))
                {
                    //Create new DotaMatch object and give match_id value
                    DotaMatch newMatch = new DotaMatch(intFromLine(line));

                    //Skip a line of input
                    skipLines(1, input);

                    //add values into DotaMatch
                    skipLines(1, input);
                    newMatch.setStart_time(intFromLine(line));
                    skipLines(1, input);
                    newMatch.setLobby_type(intFromLine(line));

                    //Skip 3 lines of input
                    skipLines(3, input);

                    extractPlayerInfo(input, newMatch);

                    matchList.add(newMatch);
                    //System.out.println(newMatch.toString() + "\n");

                }
                
            }
            input.close();
            System.out.println(matchList.size());
            //sleep(1000);
            
            String lastMatch = matchList.get(matchList.size()-1).getMatch_id();
            
            urlLink = DotaURL.getPlayerGamesFromPoint(account_id, Long.toString(Long.valueOf(lastMatch)-1));
            url = new URL(urlLink);
            conn = (HttpURLConnection)url.openConnection();
            conn.setRequestMethod("GET");

            input = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            
        }
        
        
        
        int[] heroCount = new int[114];

        for(int i = 0; i<games; i++)
        {
            DotaMatch tempMatch = matchList.get(i);
            ArrayList<DotaMatchPlayer> tempPlayers = tempMatch.getPlayerList();
            for(int c=0; c<tempPlayers.size(); c++)
            {
                heroCount[Integer.valueOf(tempPlayers.get(c).getHero_id())]++;
            }
        }
        
        int maxHero = -1;
        int maxCount = -1;
        for(int c = 0; c < heroCount.length; c++)
        {
           // System.out.println(c + ": " + heroCount[c]);
            if (heroCount[c]>maxCount)
            {
                maxHero = c;
                maxCount = heroCount[c];
            }
        }
        
        
        System.out.println("Matches Counted: " + games);
        System.out.println("Most Seen Hero: " + HeroId.convert(maxHero) + "\nHero id: " + maxHero + "\nTimes Seen: " + maxCount);
        
    }

    private static void extractPlayerInfo(BufferedReader input, DotaMatch newMatch) throws IOException {
        for(int i=0; i<10; i++)
        {
            input.readLine();
            //Add first player
            DotaMatchPlayer newPlayer = new DotaMatchPlayer();
            newPlayer.setAccount_id(intFromLine(input.readLine()));
            newPlayer.setPlayer_slot(intFromLine(input.readLine()));
            newPlayer.setHero_id(intFromLine(input.readLine()));
            
            newMatch.addPlayer(newPlayer);
            //System.out.println(newPlayer.toString());
            input.readLine();
        }
    }
    
    private static String intFromLine(String line){
        StringBuilder sb = new StringBuilder();
        for(char c : line.toCharArray())
            {
                if(Character.isDigit(c))
                    sb.append(c);
            }
            //System.out.println(sb.toString());
        return sb.toString();
    }
    
    private static void skipLines(int numLines, BufferedReader read) throws IOException{
        for(int i =0; i<numLines; i++)
            read.readLine();
    }
}
