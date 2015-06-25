/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

import data.Experience;
import java.util.Arrays;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import player.MyCharacter;

/**
 *
 * @author Desktop
 */
public class Driver extends Application {
    
    private final MyCharacter player = new MyCharacter();
    private final GearGenerator itemGen = new GearGenerator();
    private final MonsterGenerator monGen = new MonsterGenerator();
    private final Experience expChart = new Experience();
    Stage mainStage;
    Scene mainScene;
    
    @Override
    public void start(Stage primaryStage) {
        HBox root = new HBox();
        root.getChildren().addAll(Arrays.asList(createMainButtons()));
        mainScene = new Scene(root, 300, 250);
        
        mainStage=primaryStage;
        mainStage.setTitle("MIST!");
        mainStage.setScene(mainScene);
        mainStage.show();
    }

    public Button[] createMainButtons(){
        Button[] buttons = new Button[4];
        
        Button fight = new Button();
        fight.setText("FIGHT");
        fight.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mainStage.setTitle("Mist Fight!");
            }
        });
        buttons[0]=fight;
        
        Button shop = new Button();
        shop.setText("SHOP");
        shop.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mainStage.setTitle("Buying!");
            }
        });
        buttons[1]=shop;
        
        Button stats = new Button();
        stats.setText("STATS");
        stats.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mainStage.setTitle("Viewing Stats!");
            }
        });
        buttons[2]=stats;
        
        Button exit = new Button();
        exit.setText("EXIT");
        exit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Exiting!");
            }
        });
        buttons[3]=exit;
        
        return buttons;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
