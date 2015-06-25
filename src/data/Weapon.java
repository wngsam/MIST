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
}
