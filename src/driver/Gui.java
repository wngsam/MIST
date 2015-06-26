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
public class Gui extends Application {
    
    
    private final SceneGenerator sceneGen = new SceneGenerator();
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("MIST!");
        
        primaryStage.setScene(sceneGen.createMainMenu(primaryStage));
        primaryStage.show();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
