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
    
    public Scene createMainMenu(Stage primaryStage){
        Button[] buttons = new Button[4];
        
        Button fight = new Button();
        fight.setText("FIGHT");
        fight.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setTitle("Mist Fight!");
            }
        });
        buttons[0]=fight;
        
        Button shop = new Button();
        shop.setText("SHOP");
        shop.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setTitle("Buying!");
            }
        });
        buttons[1]=shop;
        
        Button stats = new Button();
        stats.setText("STATS");
        stats.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setTitle("Viewing Stats!");
                primaryStage.setScene(characterPage());
            }
        });
        buttons[2]=stats;
        
        Button exit = new Button();
        exit.setText("EXIT");
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
        return new Scene(vbox, 800, 600);
    }
    
    public Scene characterPage(){
        MyCharacter myChar = driver.getPlayer();
        
        VBox vbox = new VBox();
        vbox.getChildren().add(new Label("Level: "+myChar.getLevel()));
        vbox.getChildren().add(new Label("EXP: "+myChar.getExp()));
        vbox.getChildren().add(new Label("Gold: "+myChar.getGold()));
        
        return new Scene(vbox, 800, 600);
    }
    
}
