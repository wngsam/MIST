/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monsters;

/**
 *
 * @author Desktop
 */
public class TreasureMonster extends Monster{

    public TreasureMonster(int level){
        super("Treasure Monster", level, 1000, 0, 0, 0, 0, 0, 0, 0, 0, "", "", "", "", 0, 0, 0, 0);
        super.setCurrentHealth(1000);
        super.setCurrentMana(0);
        super.setStats(level*5,level*0,level*0,level*0,level*0);
        super.setGoldDrop(250);
        super.setExpReward(100);
        super.setSkillCost(0,0,0,0);
    }
    
    @Override
    public int attack() {
        return 0;
    }

    @Override
    public int useSkillAlpha() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int useSkillBeta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int useSkillDelta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int useSkillEpsilon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
