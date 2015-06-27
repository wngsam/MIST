/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Random;
import monsters.BoxMan;
import monsters.Lifter;
import monsters.Monster;
import monsters.TreasureMonster;

/**
 *
 * @author Desktop
 */
public class MonsterGenerator {
    
    public Monster generate(int level){
        if(new Random().nextInt(100)+1<=10){
            return new TreasureMonster(level);
        }
        if(level>=3){
            return new BoxMan(level);
        }
        return new Lifter(level);
    }
    
}
