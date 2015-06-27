/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import static java.lang.Math.sqrt;
import player.MyCharacter;

/**
 *
 * @author Desktop
 */
public class Experience {
    
    public Boolean calculateLevel(MyCharacter myChar){
        Boolean leveled = false;
        int calcLevel = (int) ((sqrt(myChar.getExp())/10)+1);
        int levelDiff = calcLevel-myChar.getLevel();
        if(levelDiff>0){
            myChar.levelUp(levelDiff);
            leveled=true;
        }
        return leveled;
    }
    
}
