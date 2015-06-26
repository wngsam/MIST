/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

import data.Experience;
import player.MyCharacter;

/**
 *
 * @author Desktop
 */
public class Driver {
    
    private final MyCharacter player = new MyCharacter();
    private final GearGenerator itemGen = new GearGenerator();
    private final MonsterGenerator monGen = new MonsterGenerator();
    private final Experience expChart = new Experience();

    public MyCharacter getPlayer() {
        return player;
    }
 
    
    
}
