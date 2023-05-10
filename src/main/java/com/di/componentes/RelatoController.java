package com.di.componentes;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import model.Relato;

import java.net.URISyntaxException;

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
        relatoRomantico.restart();
        relatoTerror.restart();
        relatoInfantil.start();
    }

    @FXML
    public void btnRomanticoClick(){
        relatoInfantil.restart();
        relatoTerror.restart();
        relatoRomantico.start();
    }

    @FXML
    public void btnTerrorClick(){
        relatoInfantil.restart();
        relatoRomantico.restart();
        relatoTerror.start();
    }

    @FXML
    public void btnReiniciarClick(){

    }

    @FXML
    public void btnSalirClick(){

    }
}