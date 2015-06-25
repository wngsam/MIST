/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Desktop
 */
public class Armor {
    private String name;
    private int cost;
    private String picture;
    private int levelReq;
    private String jobReq;
    
    //Stat bonuses
    private int health;
    private int mana;
    private int defense;
    private int dodge; //Dodge% = 100-(Enemy's Accuracy-Dodge). Dodge physical only.
}
