/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.pablocoj.system;

/**
 *
 * @author informatica
 */
import com.pablocoj.controller.SceneManager;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage; 
import javafx.stage.StageStyle;

public class Principal extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start (Stage escenarioRaiz) {
        SceneManager.getInstanciaSceneManager().setEscenarioPrincipal(escenarioRaiz);
        SceneManager.getInstanciaSceneManager().ventanaLogin();
    }
}
