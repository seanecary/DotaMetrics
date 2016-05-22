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
public class HeroId {
    
    private static String[] heroes = new String[114];
    
    public static String convert(String n)
    {
        fill();
        if(heroes[Integer.parseInt(n)]==null)
            return "Hero not found";
        else
            return heroes[Integer.parseInt(n)];
    }
    
    public static String convert(int n)
    {
        fill();
        if(heroes[n]==null)
            return "Hero not found";
        else
            return heroes[n];
    }
    
    public static void fill(){
        heroes[0] = null;
        heroes[1] = "Anti-Mage";
        heroes[2] = "Axe";
        heroes[3] = "Bane";
        heroes[4] = "Bloodseeker";
        heroes[5] = "Crystal Maiden";
        heroes[6] = "Drow Ranger";
        heroes[7] = "Earthshaker";
        heroes[8] = "Juggernaut";
        heroes[9] = "Mirana";
        heroes[10] = "Morphling";
        heroes[11] = "Shadow Fiend";
        heroes[12] = "Phantom Lancer";
        heroes[13] = "Puck";
        heroes[14] = "Pudge";
        heroes[15] = "Razor";
        heroes[16] = "Sand King";
        heroes[17] = "Storm Spirit";
        heroes[18] = "Sven";
        heroes[19] = "Tiny";
        heroes[20] = "Vengeful Spirit";
        heroes[21] = "Windranger";
        heroes[22] = "Zeus";
        heroes[23] = "Kunkka";
        heroes[24] = null;
        heroes[25] = "Lina";
        heroes[26] = "Lion";
        heroes[27] = "Shadow Shaman";
        heroes[28] = "Slardar";
        heroes[29] = "Tidehunter";
        heroes[30] = "Witch Doctor";
        heroes[31] = "Lich";
        heroes[32] = "Riki";
        heroes[33] = "Enigma";
        heroes[34] = "Tinker";
        heroes[35] = "Sniper";
        heroes[36] = "Necrophos";
        heroes[37] = "Warlock";
        heroes[38] = "Beastmaster";
        heroes[39] = "Queen of Pain";
        heroes[40] = "Venomancer";
        heroes[41] = "Faceless Void";
        heroes[42] = "Wraith King";
        heroes[43] = "Death Prophet";
        heroes[44] = "Phantom Assassin";
        heroes[45] = "Pugna";
        heroes[46] = "Templar Assassin";
        heroes[47] = "Viper";
        heroes[48] = "Luna";
        heroes[49] = "Dragon Knight";
        heroes[50] = "Dazzle";
        heroes[51] = "Clockwerk";
        heroes[52] = "Leshrac";
        heroes[53] = "Nature's Prophet";
        heroes[54] = "Lifestealer";
        heroes[55] = "Dark Seer";
        heroes[56] = "Clinkz";
        heroes[57] = "Omniknight";
        heroes[58] = "Enchantress";
        heroes[59] = "Huskar";
        heroes[60] = "Night Stalker";
        heroes[61] = "Broodmother";
        heroes[62] = "Bounty Hunter";
        heroes[63] = "Weaver";
        heroes[64] = "Jakiro";
        heroes[65] = "Batrider";
        heroes[66] = "Chen";
        heroes[67] = "Spectre";
        heroes[68] = "Ancient Apparition";
        heroes[69] = "Doom";
        heroes[70] = "Ursa";
        heroes[71] = "Spirit Breaker";
        heroes[72] = "Gyrocopter";
        heroes[73] = "Alchemist";
        heroes[74] = "Invoker";
        heroes[75] = "Silencer";
        heroes[76] = "Outworld Devourer";
        heroes[77] = "Lycanthrope";
        heroes[78] = "Brewmaster";
        heroes[79] = "Shadow Demon";
        heroes[80] = "Lone Druid";
        heroes[81] = "Chaos Knight";
        heroes[82] = "Meepo";
        heroes[83] = "Treant Protector";
        heroes[84] = "Ogre Magi";
        heroes[85] = "Undying";
        heroes[86] = "Rubick";
        heroes[87] = "Disruptor";
        heroes[88] = "Nyx Assassin";
        heroes[89] = "Naga Siren";
        heroes[90] = "Keeper of the Light";
        heroes[91] = "Wisp";
        heroes[92] = "Visage";
        heroes[93] = "Slark";
        heroes[94] = "Medusa";
        heroes[95] = "Troll Warlord";
        heroes[96] = "Centaur Warrunner";
        heroes[97] = "Magnus";
        heroes[98] = "Timbersaw";
        heroes[99] = "Bristleback";
        heroes[100] = "Tusk";
        heroes[101] = "Skywrath Mage";
        heroes[102] = "Abaddon";
        heroes[103] = "Elder Titan";
        heroes[104] = "Legion Commander";
        heroes[105] = "Techies";
        heroes[106] = "Ember Spirit";
        heroes[107] = "Earth Spirit";
        heroes[108] = "Abyssal Underlord";
        heroes[109] = "Terrorblade";
        heroes[110] = "Phoenix";
        heroes[111] = "Oracle";
        heroes[112] = "Winter Wyvern";
        heroes[113] = "Arc Warden";
    }
    
    public static void print(){
        fill();
        for(int i=0; i<heroes.length; i++)
            System.out.println(heroes[i]);
    }
    
}
