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
public class Weapon {
    private String name;
    private int cost;
    private String picture;
    private int levelReq;
    private String jobReq;
    
    //Stat bonuses
    private int damage;
    private int accuracy; //Hit% = Accuracy-Enemy's Dodge. (Physical Only)
    private int magicDamage; //Calculated in magic skills.
    private int criticalChance; //Use as percentage/10.
    private int criticalDamage; //On top of normal damage %-wise.
    
    public Weapon(String name){
        this.name=name;
    }
    
    public Weapon(String name, int cost, String picture, int levelReq, String jobReq, int damage, int accuracy, int magicDamage, int criticalChance, int criticalDamage) {
        this.name = name;
        this.cost = cost;
        this.picture = picture;
        this.levelReq = levelReq;
        this.jobReq = jobReq;
        this.damage = damage;
        this.accuracy = accuracy;
        this.magicDamage = magicDamage;
        this.criticalChance = criticalChance;
        this.criticalDamage = criticalDamage;
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

    public int getDamage() {
        return damage;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public int getMagicDamage() {
        return magicDamage;
    }

    public int getCriticalChance() {
        return criticalChance;
    }

    public int getCriticalDamage() {
        return criticalDamage;
    }
    
    
    
}
