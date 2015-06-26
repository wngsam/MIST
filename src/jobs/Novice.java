/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobs;

import java.util.Random;
import player.MyCharacter;

/**
 *
 * @author Desktop
 */
public class Novice extends Job{

    public Novice(MyCharacter myChar) {
        super(myChar,"Novice","Kick","Stomp","Slap","Gash");
    }

    @Override
    public int attack() {
        int rand = new Random().nextInt(super.getMyChar().getLevel()+1);
        return super.getMyChar().getDamage()-rand;
    }

    @Override
    public int useSkillAlpha() {
        if(super.getMyChar().getMana()>=9){
            super.getMyChar().subtractCurrentMP(9);
            return super.getMyChar().getDamage()+3;
        }
        return 0;
    }

    @Override
    public int useSkillBeta() {
        if(super.getMyChar().getMana()>=12){
            super.getMyChar().subtractCurrentMP(12);
            return super.getMyChar().getDamage()+10;
        }
        return 0;
    }

    @Override
    public int useSkillDelta() {
        if(super.getMyChar().getMana()>=3){
            super.getMyChar().subtractCurrentMP(3);
            return super.getMyChar().getDamage()+1;
        }
        return 0;
    }

    @Override
    public int useSkillEpsilon() {
        if(super.getMyChar().getMana()>=15){
            super.getMyChar().subtractCurrentMP(15);
            return super.getMyChar().getDamage()+16;
        }
        return 0;
    }
    
}
