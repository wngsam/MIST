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
    
}
