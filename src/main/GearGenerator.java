/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import data.Armor;
import data.Weapon;

/**
 *
 * @author Desktop
 */
public class GearGenerator {
    
    private final static Weapon[] noviceWeapons = new Weapon[5];
    private final static Armor[] noviceArmors = new Armor[3];
    
    public GearGenerator(){
        createNoviceItems();
    }

    public static Weapon[] getNoviceWeapons() {
        return noviceWeapons;
    }

    public static Armor[] getNoviceArmors() {
        return noviceArmors;
    }
    
    public static void createNoviceItems(){
        
        noviceWeapons[0] = new Weapon("Novice Sword",0,null,1,"Novice",10,5,0,1,1);
        noviceWeapons[1] = new Weapon("Iron Sword",25,null,3,"Novice",12,8,0,1,1);
        noviceWeapons[2] = new Weapon("Short Sword",52,null,5,"Novice",14,9,0,1,1);
        noviceWeapons[3] = new Weapon("Steel Sword",78,null,7,"Novice",16,10,0,1,1);
        noviceWeapons[4] = new Weapon("Long Sword",105,null,9,"Novice",19,11,0,1,1);
          
        noviceArmors[0] = new Armor("Novice Armor",0,null,1,"Novice",10,0,5,1);
        noviceArmors[1] = new Armor("Leather Armor",30,null,5,"Novice",12,0,7,1);
        noviceArmors[2] = new Armor("Steel Armor",65,null,8,"Novice",15,0,7,1);
        
        
        
    }
    
}
