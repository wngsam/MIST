/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import data.Armor;
import data.Weapon;
import player.MyCharacter;

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
            return GearGenerator.getNoviceWeapons()[counter];
        }
        return null;
    }
    
    public Armor displayArmor(int counter){
        if(counter<3){
            return GearGenerator.getNoviceArmors()[counter];
        }
        return null;
    }
    
    public void buyWeapon(MyCharacter myChar){
        if(myChar.getWeaponCounter()<5){
            Weapon weapon = GearGenerator.getNoviceWeapons()[myChar.getWeaponCounter()];
            if(myChar.getLevel()>=weapon.getLevelReq()&&myChar.getGold()>=weapon.getCost()){
                myChar.subtractGold(weapon.getCost());
                myChar.setWeapon(weapon);
                myChar.setWeaponCounter(myChar.getWeaponCounter()+1);
            }
        }
    }
    
    public void buyArmor(MyCharacter myChar){
        if(myChar.getArmorCounter()<3){
            Armor armor = GearGenerator.getNoviceArmors()[myChar.getArmorCounter()];
            if(myChar.getLevel()>=armor.getLevelReq()&&myChar.getGold()>=armor.getCost()){
                myChar.subtractGold(armor.getCost());
                myChar.setArmor(armor);
                myChar.setArmorCounter(myChar.getArmorCounter()+1);
            }
        }
    }
}
