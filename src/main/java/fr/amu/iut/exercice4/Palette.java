package fr.amu.iut.exercice4;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Palette extends Application {

    private int nbVert = 0;
    private int nbRouge = 0;
    private int nbBleu = 0;

    private Button vert;
    private Button rouge;
    private Button bleu;

    private BorderPane root;
    private Label label;
    private Pane panneau;
    private HBox bas;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label textTop = new Label();
        Pane palette = new Pane();
        palette.setMaxSize(400,200);
        Button boutonVert = new Button("Vert");
        Button b2 = new Button("Rouge");
        Button b3 = new Button("Bleu");
        HBox boite = new HBox(10, boutonVert, b2, b3);
        boite.setAlignment(Pos.CENTER);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(textTop);
        borderPane.setBottom(boite);
        //BorderPane.setAlignment(label,Pos.CENTER);
        borderPane.setCenter(palette);

        boutonVert.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {

                nbVert = nbVert + 1;
                textTop.setText("Vert choisi "+nbVert+" fois, ");
                palette.setStyle("-fx-background-color:green");


        });
        b2.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {

                nbRouge = nbRouge + 1;
                textTop.setText("Rouge choisi "+nbRouge+" fois, ");
                palette.setStyle("-fx-background-color : red");


        });
        b3.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {

                nbBleu = nbBleu + 1;
                textTop.setText("Bleu choisi "+nbBleu+" fois, ");
                palette.setStyle("-fx-background-color : blue");


        });

        Scene laScene = new Scene(borderPane, 400, 400);
        primaryStage.setScene(laScene);
        primaryStage.show();

    }
}

