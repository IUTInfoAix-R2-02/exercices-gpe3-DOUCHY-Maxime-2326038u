package fr.amu.iut.exercice6;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class IHMPendu extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Dico dico = new Dico();
        String mot = dico.getMot();
        Label leMot = new Label(mot);
        Button la = new Button("a");
        Button lz = new Button("z");
        Button le = new Button("e");
        Button lr = new Button("r");
        Button lt = new Button("t");
        Button ly = new Button("y");
        Button lu = new Button("u");
        Button li = new Button("i");
        Button lo = new Button("o");
        Button lp = new Button("p");
        Button lq = new Button("q");
        Button ls = new Button("s");
        Button ld = new Button("d");
        Button lf = new Button("f");
        Button lg = new Button("g");
        Button lh = new Button("h");
        Button lj = new Button("j");
        Button lk = new Button("k");
        Button ll = new Button("l");
        Button lm = new Button("m");
        Button lw = new Button("w");
        Button lx = new Button("x");
        Button lc = new Button("c");
        Button lv = new Button("v");
        Button lb = new Button("b");
        Button ln = new Button("n");
        HBox alphabet1 = new HBox(2, la,lz,le,lr,lt,ly,lu,li,lo,lp);
        HBox alphabet2 = new HBox(2, lq,ls,ld,lf,lg,lh,lj,lk,ll,lm);
        HBox alphabet3 = new HBox(2, lw,lx,lc,lv,lb,ln);
        VBox alphabet = new VBox(alphabet1,alphabet2,alphabet3);
        alphabet.setAlignment(Pos.CENTER);
        String motCache="";
        for(int i = 0; i<mot.length(); i+=1){
            motCache+="_ ";
        }
        Text motCa = new Text(motCache);
        motCa.relocate(200,250);
        Button button = new Button();
            la.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent ->{
                for(int i = 0; i<mot.length(); i+=1){
                    if (mot[i] == "a")
                }
            });

        // A completer

        VBox boite = new VBox(leMot, motCa, alphabet);
        boite.setAlignment(Pos.CENTER);
        boite.setStyle("-fx-background-color: #c1f6f4");
        Scene laScene = new Scene(boite, 400, 400);
        primaryStage.setScene(laScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
