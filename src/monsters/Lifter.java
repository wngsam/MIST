/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monsters;

import java.util.Random;

/**
 *
 * @author Desktop
 */
public class Lifter extends Monster{

    public Lifter(int level) {
        super("The Gymbro", level, 200, 30, 50, 20, 0, 125, 0, 0, 0, "Dumbbell Throw", "Barbell Smash", "Crossfit Toss", "SQUAT YOU", 25, 10, 10, 5);
        super.setCurrentHealth(200);
        super.setCurrentMana(30);
        super.setStats(level*3,level*0,level*2,level*0,level*0);
        super.setGoldDrop(level+5);
        super.setExpReward(level+10);
        super.setSkillCost(5,10,7,15);
    }
    
    
    
    @Override
    public int attack() {
        int rand = new Random().nextInt(super.getLevel());
        return super.getDamage()-rand;
    }

    @Override
    public int useSkillAlpha() {
        if(super.getMana()>=5){
            super.subtractCurrentMP(5);
            return super.getDamage()+1;
        }
        return 0;
    }

    @Override
    public int useSkillBeta() {
        if(super.getMana()>=10){
            super.subtractCurrentMP(10);
            return super.getDamage()+5;
        }
        return 0;
    }

    @Override
    public int useSkillDelta() {
        if(super.getMana()>=7){
            super.subtractCurrentMP(7);
            return super.getDamage()+3;
        }
        return 0;
    }

    @Override
    public int useSkillEpsilon() {
        if(super.getMana()>=15){
            super.subtractCurrentMP(15);
            return super.getDamage()*2;
        }
        return 0;
    }
    
}
