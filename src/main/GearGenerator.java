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
//        noviceWeapons[1] = new Weapon();
//        noviceWeapons[2] = new Weapon();
//        noviceWeapons[3] = new Weapon();
//        noviceWeapons[4] = new Weapon();
          
          noviceArmors[0] = new Armor("Novice Armor",0,null,1,"Novice",10,0,5,1);
//        noviceArmors[1] = new Armor();
//        noviceArmors[2] = new Armor();
        
        
        
    }
    
}
