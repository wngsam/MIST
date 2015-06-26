/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player;

import data.Armor;
import data.Weapon;
import jobs.Job;
import jobs.Novice;

/**
 *
 * @author Desktop
 */
public class MyCharacter {
    
    private int level=1;
    private int exp=0;
    private int gold=10;
    
    private int currentHealth=175;
    private int health=175;
    private int currentMana=50;
    private int mana=50;
    private int damage=35;
    private int defense=15;
    private int dodge=30; //Dodge% = 100-(Enemy's Accuracy-Dodge). Dodge physical only.
    private int accuracy=100; //Hit% = Accuracy-Enemy's Dodge. (Physical Only)
    private int magicDamage=5; //Calculated in magic skills.
    private int criticalChance=25; //Use as percentage/10.
    private int criticalDamage=105; //On top of normal damage %-wise.
    
    private int strength=5; //+5 damage, +5 health
    private int magic=5; //+1 magic damage, +5 mana
    private int dexterity=5; //+5 accuracy, +2 defense
    private int agility=5; //+1 critical chance, +1 dodge
    private int luck=5; //+1 dodge, +1 critical damage
    
    private int stats=0; //stat points
    
    private Weapon weapon; //TODO: Novice Weapon
    private Armor armor; //TODO: Novice Armor
    private Job job = new Novice();

    public void addStr(){
        if(stats>0){
            stats--;
            damage+=5;
            health+=5;
            currentHealth=health;
            strength++;
        }
    }
    public void addMag(){
        if(stats>0){
            stats--;
            magicDamage+=1;
            mana+=5;
            magic++;
        }
    }
    public void addDex(){
        if(stats>0){
            stats--;
            accuracy+=5;
            defense+=2;
            dexterity++;
        }
    }
    public void addAgi(){
        if(stats>0){
            stats--;
            criticalChance+=1;
            dodge+=1;
            agility++;
        }
    }
    public void addLuk(){
        if(stats>0){
            stats--;
            dodge+=1;
            criticalDamage+=1;
            luck++;
        }
    }
    
    public int getLevel() {
        return level;
    }

    public int getExp() {
        return exp;
    }

    public int getGold() {
        return gold;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public int getHealth() {
        return health;
    }

    public int getMana() {
        return mana;
    }

    public int getDamage() {
        return damage;
    }

    public int getDefense() {
        return defense;
    }

    public int getDodge() {
        return dodge;
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

    public int getStrength() {
        return strength;
    }

    public int getMagic() {
        return magic;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getAgility() {
        return agility;
    }

    public int getLuck() {
        return luck;
    }

    public int getStats() {
        return stats;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public Job getJob() {
        return job;
    }
    
    
    
}
