package com.metrics.core;




import java.io.*;
import java.text.ParseException;

/**
 *
 * @author Sean
 */
public class SeansDotaProject {
    
    
    public static void main(String[] args) throws IOException, ParseException, InterruptedException {

        DotaMetrics.mostSeenHero(500, "76561198095830948");
        
    }
        
}
        
        
        
        
        
        
        //OLD CODE
        /*
        ArrayList<DotaMatch> matchList = new ArrayList();
        
        
        String urlLink = DotaURL.getPlayerGames("76561198095830948");
        URL url = new URL(urlLink);
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.setRequestMethod("GET");
        
        
        BufferedReader input = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        
        String line;
        String match;
        while((line = input.readLine()) != null)
        {
            //System.out.println(line);
            
            if(line.contains("match_id"))
            {
                //Create new DotaMatch object and give match_id value
                DotaMatch newMatch = new DotaMatch(intFromLine(line));
                
                //Skip a line of input
                line = input.readLine();

                //add values into DotaMatch
                line = input.readLine();
                newMatch.setStart_time(intFromLine(line));
                line = input.readLine();
                newMatch.setLobby_type(intFromLine(line));
                
                //Skip 3 lines of input
                line = input.readLine();
                line = input.readLine();
                line = input.readLine();
                
                for(int i=0; i<10; i++)
                {
                    input.readLine();              
                    //Add first player
                    DotaMatchPlayer newPlayer = new DotaMatchPlayer();
                    newPlayer.setAccount_id(intFromLine(input.readLine()));
                    newPlayer.setPlayer_slot(intFromLine(input.readLine()));
                    newPlayer.setHero_id(intFromLine(input.readLine()));
                    
                    newMatch.addPlayer(newPlayer);
                    System.out.println(newPlayer.toString());
                    input.readLine();
                }
                
                matchList.add(newMatch);
                System.out.println(newMatch.toString() + "\n");
 
            }
            
        }
        input.close();
        
        System.out.println(matchList.size());
        /*
        System.out.println("******SECOND ROUND*******");
        
        urlLink = getMatchHistory + "&start_at_match_id=2213517164&key=" + key;
        
        url = new URL(urlLink);
        conn = (HttpURLConnection)url.openConnection();
        conn.setRequestMethod("GET");
        input = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        while((line = input.readLine()) != null)
        {
            if(line.contains("match_id"))
                games_played++;
            System.out.println(line);
        }
        System.out.println(games_played);
        input.close();

        
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
}
*/
