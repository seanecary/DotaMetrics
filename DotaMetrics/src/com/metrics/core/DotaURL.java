package com.metrics.core;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sean
 */
public class DotaURL {
    
    private static final String API_KEY = "53AEBD4126B0933048FECB41FC832FAC";
    
    //Builds a url string to retrieve a single users most recent 100 games, requires an api key
    public static String getPlayerGames(String accountID)
    {
        return "https://api.steampowered.com/IDOTA2Match_570/GetMatchHistory/V001/?account_id=" + accountID + "&key=" + API_KEY;
    }
    
    //Builds a url string to retrieve a single users 100 games directly before and including the match id endpoint provided, requires an api key
    public static String getPlayerGamesFromPoint(String accountID, String endpoint)
    {
        return "https://api.steampowered.com/IDOTA2Match_570/GetMatchHistory/V001/?account_id=" + accountID + "&start_at_match_id=" + endpoint + "&key=" + API_KEY;
    }
    
    
}
