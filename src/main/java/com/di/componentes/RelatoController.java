package com.di.componentes;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import model.Relato;

public class RelatoController {
    @FXML Button btnReiniciar, btnSalir;
    @FXML Button btnInfantil, btnRomantico, btnTerror;
    @FXML Relato relatoInfantil, relatoRomantico, relatoTerror;
    @FXML GridPane gridRelatos;

    @FXML
    public void initialize(){
        gridRelatos.add(relatoInfantil, 0, 0);
        gridRelatos.add(relatoRomantico, 1, 0);
        gridRelatos.add(relatoTerror, 2, 0);
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
    public void btnTerroClick(){
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