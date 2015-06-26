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
public class Shop {
    
    private GearGenerator itemGen;
    
    public Shop(GearGenerator itemGen){
        this.itemGen = itemGen;
    }
    
    public Weapon displayWeapon(int counter){
        if(counter<5){
            return itemGen.getNoviceWeapons()[counter];
        }
        return null;
    }
    
    public Armor displayArmor(int counter){
        if(counter<3){
            return itemGen.getNoviceArmors()[counter];
        }
        return null;
    }
    
}
