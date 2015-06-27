/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import data.Experience;
import java.util.Random;
import monsters.Monster;
import player.MyCharacter;

/**
 *
 * @author Desktop
 */
public class Driver {
    
    
    private final GearGenerator itemGen = new GearGenerator();
    private final MyCharacter player = new MyCharacter();
    private final MonsterGenerator monGen = new MonsterGenerator();
    private final Shop shop = new Shop(itemGen);
    private final Experience expChart = new Experience();

    public Driver(){
        
    }

    public Shop getShop() {
        return shop;
    }
    
    public MyCharacter getPlayer() {
        return player;
    }

    public MonsterGenerator getMonGen() {
        return monGen;
    }
 
    public String battle(int playerDmg, Monster m){
        
        String you = "You dealt ";
        String enemy = m.getName()+" ";
        
        int rand = new Random().nextInt(100)+1;
        
        if(rand<=(player.getAccuracy()-m.getDodge())){
            rand = new Random().nextInt(100)+1;
            if(rand<=player.getCriticalChance()){
                playerDmg+=((playerDmg*player.getCriticalDamage())/100);
                you+="CRITICAL damage of ";
            }else{
                you+="a total of ";
            }
            playerDmg-=m.getDefense();
            you+=playerDmg+"!";
            m.subtractCurrentHP(playerDmg);
        }else{
            you+="no dmg because you missed!";
        }
        
        if(m.getCurrentHealth()>0){
            rand = new Random().nextInt(100)+1;
            
            int monDmg;
            
            if(m.getCurrentMana()>=m.getSkillCostEpsilon()&&rand<=m.getEpsilonChance()){
                monDmg=m.useSkillAlpha();
                enemy+=" used "+m.getSkillNameAlpha()+" and ";
            }else if(m.getCurrentMana()>=m.getSkillCostDelta()&&rand<=(m.getEpsilonChance()+m.getDeltaChance())){
                monDmg=m.useSkillBeta();
                enemy+=" used "+m.getSkillNameBeta()+" and ";
            }else if(m.getCurrentMana()>=m.getSkillCostBeta()&&rand<=(m.getEpsilonChance()+m.getDeltaChance()+m.getBetaChance())){
                monDmg=m.useSkillDelta();
                enemy+=" used "+m.getSkillNameDelta()+" and ";
            }else if(m.getCurrentMana()>=m.getSkillCostAlpha()&&rand<=(m.getEpsilonChance()+m.getDeltaChance()+m.getBetaChance()+m.getAlphaChance())){
                monDmg=m.useSkillEpsilon();
                enemy+=" used "+m.getSkillNameEpsilon()+" and ";
            }else{
                monDmg=m.attack();
            }
            rand = new Random().nextInt(100)+1;
            
            if(rand<=(m.getAccuracy()-player.getDodge())){
                rand = new Random().nextInt(100)+1;
                if(rand<=m.getCriticalChance()){
                    monDmg+=((monDmg*m.getCriticalDamage())/100);
                    enemy+="CRIT you for ";
                }else{
                    enemy+="did ";
                }
                monDmg-=player.getDefense();
                enemy+=monDmg+" dmg!";
                player.subtractCurrentHP(monDmg);
            }else{
                enemy+="Missed!";
            }
            
        }else{
            enemy+="is dead!\nYou get "+m.getExpReward()+"EXP and "+m.getGoldDrop()+" Gold!";
            player.addGold(m.getGoldDrop());
            player.addExp(m.getExpReward());
            if(expChart.calculateLevel(player)){
                enemy+="\n Congratulation, you leveled!";
            }
        }
        
        return you+"\n"+enemy;
    }
    
    
}
