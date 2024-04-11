package fr.amu.iut.exercice1;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Box;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class FenetreLogiciel extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label textBouton = new Label("Boutons :");
        Button b1 = new Button("Button 1");
        Button b2 = new Button("Button 2");
        Button b3 = new Button("Button 3");
        VBox boite = new VBox(10, textBouton, b1, b2, b3);
        boite.setAlignment(Pos.CENTER);
        Separator separator = new Separator(Orientation.VERTICAL);
        HBox gauche = new HBox(boite, separator);

        GridPane tab = new GridPane();
        tab.add(new Label("Name:"), 0, 0);
        tab.add(new TextField(), 1, 0);
        tab.add(new Label("Email:"), 0, 1);
        tab.add(new TextField(), 1, 1);
        tab.add(new Label("Password:"), 0, 2);
        tab.add(new TextField(), 1, 2);
        tab.add(new Button("Submit"), 0, 3);
        tab.add(new Button("Cancel"), 1, 3);
        tab.setAlignment(Pos.CENTER);
        tab.setHgap(10);
        tab.setVgap(10);

        Menu menu1 = new Menu("File");
        Menu menu2 = new Menu("Edit");
        Menu menu3 = new Menu("Help");
        MenuBar leMenu = new MenuBar(menu1, menu2, menu3);

        MenuItem menu10 = new MenuItem("New");
        MenuItem menu11 = new MenuItem("Open");
        MenuItem menu12 = new MenuItem("Save");
        MenuItem menu13 = new MenuItem("Close");
        menu1.getItems().add(menu10);
        menu1.getItems().add(menu11);
        menu1.getItems().add(menu12);
        menu1.getItems().add(menu13);

        MenuItem menu20 = new MenuItem("Cut");
        MenuItem menu21 = new MenuItem("Copy");
        MenuItem menu22 = new MenuItem("Paste");
        menu2.getItems().add(menu20);
        menu2.getItems().add(menu21);
        menu2.getItems().add(menu22);
        Separator separationBas = new Separator(Orientation.HORIZONTAL);
        Label basPage = new Label("Ceci est un label de bas de page");
        basPage.setAlignment(Pos.CENTER);
        VBox leBas = new VBox(separationBas, basPage);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(leMenu);
        borderPane.setLeft(gauche);
        borderPane.setBottom(leBas);
        borderPane.setCenter(tab);

        Scene laScene = new Scene(borderPane, 800, 500);
        primaryStage.setScene(laScene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);

    }
}

