/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import monsters.Lifter;
import monsters.Monster;

/**
 *
 * @author Desktop
 */
public class MonsterGenerator {
    
    public Monster generate(int level){
        return new Lifter(level);
    }
    
}
