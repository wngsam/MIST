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
public class BoxMan extends Monster{

    public BoxMan(int level){
        super("Box Man", level, 300, 50, 55, 10, 15, 150, 0, 25, 100, "Upper Kick", "Iron Defense", "Gatling Gun", "Fists of Mountain", 25, 10, 10, 5);
        super.setCurrentHealth(300);
        super.setCurrentMana(50);
        super.setStats(level*2,level*0,level*1,level*1,level*1);
        super.setGoldDrop(level+15);
        super.setExpReward(level*20);
        super.setSkillCost(5,10,15,25);
    }
    
    @Override
    public int attack() {
        int rand = new Random().nextInt(super.getLevel());
        return super.getDamage()-rand;
    }

    @Override
    public int useSkillAlpha() {
        return super.getDamage()+5;
    }

    @Override
    public int useSkillBeta() {
        super.setDefense(super.getDefense()+1);
        return 0;
    }

    @Override
    public int useSkillDelta() {
        return super.getDamage()+20;
    }

    @Override
    public int useSkillEpsilon() {
        return super.getDamage()*3;
    }
    
}
