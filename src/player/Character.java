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
public class Character {
    
    private int level=1;
    private int exp=0;
    private int gold=10;
    
    private int currentHealth=175;
    private int health=175;
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
    
}
