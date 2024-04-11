package fr.amu.iut.exercice2;

import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class TicTacToe extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.show();
    }
    ImageView image = new ImageView("exercice2/Croix.png");
    Label.setGraphic(image);

}

