/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author Desktop
 */
public class Gui extends Application {
    
    private final SceneGenerator sceneGen = new SceneGenerator();
    
    @Override
    public void start(Stage primaryStage) {
        sceneGen.createMainMenu(primaryStage);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
