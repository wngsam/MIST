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

    public Armor(String name){
        this.name=name;
    }
    
    public Armor(String name, int cost, String picture, int levelReq, String jobReq, int health, int mana, int defense, int dodge) {
        this.name = name;
        this.cost = cost;
        this.picture = picture;
        this.levelReq = levelReq;
        this.jobReq = jobReq;
        this.health = health;
        this.mana = mana;
        this.defense = defense;
        this.dodge = dodge;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public String getPicture() {
        return picture;
    }

    public int getLevelReq() {
        return levelReq;
    }

    public String getJobReq() {
        return jobReq;
    }

    public int getHealth() {
        return health;
    }

    public int getMana() {
        return mana;
    }

    public int getDefense() {
        return defense;
    }

    public int getDodge() {
        return dodge;
    }
    
    
    
}
