package com.metrics.core;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.*;

/**
 *
 * @author Sean
 */
public class DotaMatch {
    
    private String match_id;
    private String start_time;
    private String lobby_type;
    private ArrayList<DotaMatchPlayer> playerList = new ArrayList<DotaMatchPlayer>();
    
    public DotaMatch(){
        match_id = null;
        start_time = null;
        lobby_type = null;
    }
    
    public DotaMatch(String id)
    {
        match_id = id;
        start_time = null;
        lobby_type = null;
    }
    
    public void addPlayer(DotaMatchPlayer p)
    {
        this.playerList.add(p);
    }
    
    public String toString(){
        return "Match id = " + this.match_id + "\nStart Time = " + this.start_time + "\nLobby Type = " + this.lobby_type;
    }
    
    
    //Getters and setters for all class attributes

    public String getMatch_id() {
        return match_id;
    }

    public void setMatch_id(String match_id) {
        this.match_id = match_id;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getLobby_type() {
        return lobby_type;
    }

    public void setLobby_type(String lobby_type) {
        this.lobby_type = lobby_type;
    }

    public ArrayList<DotaMatchPlayer> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(ArrayList<DotaMatchPlayer> playerList) {
        this.playerList = playerList;
    }
    
}
