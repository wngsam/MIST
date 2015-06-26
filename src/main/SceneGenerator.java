/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import data.Armor;
import data.Weapon;
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
                primaryStage.setScene(viewShop());
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
    
    public Scene viewShop(){
        VBox shop = new VBox();
        
        
        Weapon weapon = driver.getShop().displayWeapon(driver.getPlayer().getWeaponCounter());
        Armor armor = driver.getShop().displayArmor(driver.getPlayer().getArmorCounter());
        
        shop.getChildren().add(
            new Label(
                weapon.getName()+"\n"
                +"Cost: "+weapon.getCost()+"G \n"
                +"Level: "+weapon.getLevelReq()+"   Job: "+weapon.getJobReq()+"\n"
                +"Damage: "+weapon.getDamage()+"\n"
                +"Acc: "+weapon.getAccuracy()+"\n"
                +"M.Atk: "+weapon.getMagicDamage()+"\n"
                +"Crit Chance: "+weapon.getCriticalChance()+"\n"
                +"Crit Dmg: "+weapon.getCriticalDamage()+"\n"
                )
        );
        
        Button buyWeapon = new Button("Buy");
        buyWeapon.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                driver.getShop().buyWeapon(driver.getPlayer());
                primaryStage.setScene(viewShop());
            }
        });
        shop.getChildren().add(buyWeapon);
        
        shop.getChildren().add(
            new Label(
                armor.getName()+"\n"
                +"Cost: "+armor.getCost()+"G \n"
                +"Level: "+armor.getLevelReq()+"   Job: "+armor.getJobReq()+"\n"
                +"Health: "+armor.getHealth()+"\n"
                +"Mana: "+armor.getMana()+"\n"
                +"Def: "+armor.getDefense()+"\n"
                +"Dodge: "+armor.getDodge()+"\n"
                )
        );
        
        Button buyArmor = new Button("Buy");
        buyArmor.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                driver.getShop().buyArmor(driver.getPlayer());
                primaryStage.setScene(viewShop());
            }
        });
        shop.getChildren().add(buyArmor);
        
        Button exit = new Button("EXIT");
        exit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(mainScene);
            }
        });
        shop.getChildren().add(exit);
        
        return new Scene(shop, 800, 600);
    }
    
    public Scene characterPage(){
        MyCharacter myChar = driver.getPlayer();
        VBox charPage = new VBox();
        
        charPage.getChildren().add(
                new Label(
                        "Level: "+myChar.getLevel()+"\n"
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
        
        charPage.getChildren().add(
                new Label(
                    "Weapon: "+myChar.getWeapon().getName()+"\n"
                    +"Armor: "+myChar.getArmor().getName()+"\n"
                )
            );
        
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
