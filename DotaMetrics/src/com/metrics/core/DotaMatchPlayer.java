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
public class DotaMatchPlayer {
    private String account_id;
    private String player_slot;
    private String hero_id;

    public DotaMatchPlayer() {
        account_id = null;
        player_slot = null;
        hero_id = null;
    }
    
    public String toString(){
        return "account_id: " + this.account_id + "\nplayer_slot: " + this.player_slot + "\nhero_id: " + this.hero_id + "\nhero name: " + HeroId.convert(this.hero_id);
    }
    
    //Getters and setters

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public String getPlayer_slot() {
        return player_slot;
    }

    public void setPlayer_slot(String player_slot) {
        this.player_slot = player_slot;
    }

    public String getHero_id() {
        return hero_id;
    }

    public void setHero_id(String hero_id) {
        this.hero_id = hero_id;
    }
    
}
