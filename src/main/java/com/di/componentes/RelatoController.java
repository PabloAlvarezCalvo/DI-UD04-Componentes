package com.di.componentes;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import relato.Relato;


public class RelatoController {
    @FXML Button btnReiniciar, btnSalir;
    @FXML Button btnInfantil, btnRomantico, btnTerror;
    @FXML Relato relatoInfantil, relatoRomantico, relatoTerror;
    @FXML GridPane gridRelatos;

    @FXML
    public void initialize(){

        relatoInfantil = new Relato();
        relatoRomantico = new Relato();
        relatoTerror = new Relato();

        gridRelatos.add(relatoInfantil, 0, 0);
        gridRelatos.add(relatoRomantico, 1, 0);
        gridRelatos.add(relatoTerror, 2, 0);

        relatoInfantil.addImage(getClass().getResource("images/infantil/01.jpg").toExternalForm());
        relatoInfantil.addImage(getClass().getResource("images/infantil/02.jpg").toExternalForm());
        relatoInfantil.addImage(getClass().getResource("images/infantil/03.jpg").toExternalForm());

        relatoRomantico.addImage(getClass().getResource("images/romantico/01.jpg").toExternalForm());
        relatoRomantico.addImage(getClass().getResource("images/romantico/02.jpg").toExternalForm());
        relatoRomantico.addImage(getClass().getResource("images/romantico/03.jpg").toExternalForm());

        relatoTerror.addImage(getClass().getResource("images/terror/01.jpg").toExternalForm());
        relatoTerror.addImage(getClass().getResource("images/terror/02.jpg").toExternalForm());
        relatoTerror.addImage(getClass().getResource("images/terror/03.jpg").toExternalForm());

    }

    @FXML
    public void btnInfantilClick(){
        relatoInfantil.start();
        relatoRomantico.stop();
        relatoTerror.stop();
    }

    @FXML
    public void btnRomanticoClick(){
        relatoInfantil.stop();
        relatoRomantico.start();
        relatoTerror.stop();
    }

    @FXML
    public void btnTerrorClick(){
        relatoInfantil.stop();
        relatoRomantico.stop();
        relatoTerror.start();
    }

    @FXML
    public void btnReiniciarClick(){
        relatoInfantil.stop();
        relatoRomantico.stop();
        relatoTerror.stop();
    }

    @FXML
    public void btnSalirClick(){
        Platform.exit();
        System.exit(0);
    }
}