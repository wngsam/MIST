/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

import java.util.Arrays;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import player.MyCharacter;

/**
 *
 * @author Desktop
 */
public class SceneGenerator {
    
    private final Driver driver = new Driver();
    private Stage primaryStage;
    private Scene mainScene;
    
    public void createMainMenu(Stage primaryStage){
        this.primaryStage = primaryStage;
        Button[] buttons = new Button[4];
        
        Button fight = new Button("FIGHT");
        fight.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //primaryStage.setTitle("Mist Fight!");
            }
        });
        buttons[0]=fight;
        
        Button shop = new Button("SHOP");
        shop.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //primaryStage.setTitle("Buying!");
            }
        });
        buttons[1]=shop;
        
        Button stats = new Button("STATS");
        stats.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //primaryStage.setTitle("Viewing Stats!");
                primaryStage.setScene(characterPage());
            }
        });
        buttons[2]=stats;
        
        Button exit = new Button("EXIT");
        exit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.close();
            }
        });
        buttons[3]=exit;
        
        VBox vbox = new VBox();
        HBox hbox = new HBox();
        hbox.getChildren().addAll(Arrays.asList(buttons));
        vbox.getChildren().add(new Label("Welcome to MIST!"));
        vbox.getChildren().add(hbox);
        
        primaryStage.setTitle("MIST!");
        mainScene = new Scene(vbox, 800, 600);
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }
    
    public Scene characterPage(){
        MyCharacter myChar = driver.getPlayer();
        VBox charPage = new VBox();
        
        charPage.getChildren().add(
                new Label("Level: "+myChar.getLevel()+"\n"
                        +"EXP: "+myChar.getExp()+"\n"
                        +"Gold: "+myChar.getGold()+"\n\n"
                        +"HP: "+myChar.getHealth()+", MP: "+myChar.getMana()+"\n"
                        +"Atk: "+myChar.getDamage()+", MAtk: "+myChar.getMagicDamage()+"\n"
                        +"Def: "+myChar.getDefense()+"\n"
                        +"Accuracy: "+myChar.getAccuracy()+", Dodge: "+myChar.getDodge()+"\n"
                        +"Critical Chance: "+myChar.getCriticalChance()+", Critical Dmg: "+myChar.getCriticalDamage()+"\n\n"
                        +"STR: "+myChar.getStrength()+"\n"
                        +"MAG: "+myChar.getMagic()+"\n"
                        +"DEX: "+myChar.getDexterity()+"\n"
                        +"AGI: "+myChar.getAgility()+"\n"
                        +"LUK: "+myChar.getLuck()+"\n"
                        +"Stat Points: "+myChar.getStats()+"\n"
                ));
        
        if (myChar.getStats() > 0) {
            Button str = new Button("+STR");
            str.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    myChar.addStr();
                    primaryStage.setScene(characterPage());
                }
            });
            Button mag = new Button("+MAG");
            mag.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    myChar.addMag();
                    primaryStage.setScene(characterPage());
                }
            });
            Button dex = new Button("+DEX");
            dex.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    myChar.addDex();
                    primaryStage.setScene(characterPage());
                }
            });
            Button agi = new Button("+AGI");
            agi.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    myChar.addAgi();
                    primaryStage.setScene(characterPage());
                }
            });
            Button luk = new Button("+LUK");
            luk.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    myChar.addLuk();
                    primaryStage.setScene(characterPage());
                }
            });
            HBox addStats = new HBox();
            addStats.getChildren().addAll(str, mag, dex, agi, luk);
            charPage.getChildren().add(addStats);
        }
        
        Button exit = new Button("EXIT");
        exit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(mainScene);
            }
        });
        charPage.getChildren().add(exit);
        
        return new Scene(charPage, 800, 600);
    }
    
}
