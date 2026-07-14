/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pablocoj.controller;

import com.pablocoj.view.LoginView;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.StageStyle;
import javax.swing.JOptionPane;

/**
 *
 * @author informatica
 */
public class SceneManager {

    private static SceneManager instanciaSceneManager;
    private Stage escenarioPrincipal;
    private Stage escenarioSecundario;
    private Scene escenaPrincipal;

    private SceneManager() {

    }
    
    public static SceneManager getInstanciaSceneManager() {
        if (instanciaSceneManager == null) {
            instanciaSceneManager = new SceneManager();
        }
        return instanciaSceneManager;
    }

    public static void setInstanciaSceneManager(SceneManager instanciaSceneManager) {
        SceneManager.instanciaSceneManager = instanciaSceneManager;
    }

    public Stage getEscenarioPrincipal() {
        return escenarioPrincipal;
    }

    public void setEscenarioPrincipal(Stage escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
    }

    public Stage getEscenarioSecundario() {
        return escenarioSecundario;
    }

    public void setEscenarioSecundario(Stage escenarioSecundario) {
        this.escenarioSecundario = escenarioSecundario;
    }

    public Scene getEscenaPrincipal() {
        return escenaPrincipal;
    }

    public void setEscenaPrincipal(Scene escenaPrincipal) {
        this.escenaPrincipal = escenaPrincipal;
    }

    public void cambiarEscenaPrincipal(Pane panel, int ancho, int alto) {
        try {
            escenaPrincipal = new Scene(panel, ancho, alto);
            escenarioPrincipal.setScene(escenaPrincipal);
            escenarioPrincipal.sizeToScene();
            escenarioPrincipal.show();
        } catch (NullPointerException objetoNulo) {
            JOptionPane.showMessageDialog(null,
                    "Error de Objeto nulo: Cambiar Escena Principal");
            objetoNulo.printStackTrace(); //imprime todo el camino hacia el Error
        } catch (Exception errorPadre) {
            JOptionPane.showMessageDialog(null, "Error Padre: Cambiar Escena Principal");
            errorPadre.printStackTrace();
        }
    }

    public void ventanaLogin() {
        try {
            //Metodo que oculta la opciones de ventana por defecto
            this.escenarioPrincipal.initStyle(StageStyle.TRANSPARENT);

            LoginView loginView = LoginView.getInstanciaLoginView();
            cambiarEscenaPrincipal(loginView.getInstanciaLoginView(), 450, 500 );
            this.escenaPrincipal.setFill(Color.TRANSPARENT); //Fondo del Contenedor
            new LoginController( loginView);
            
        } catch (NullPointerException objetoNulo) {
            JOptionPane.showMessageDialog(null,
                    "Error de Objeto nulo: Cambiar Escena Principal");
            objetoNulo.printStackTrace(); //imprime todo el camino hacia el Error
        } catch (Exception errorPadre) {
            JOptionPane.showMessageDialog(null, "Error Padre: Cambiar Escena Principal");
            errorPadre.printStackTrace();
        }
    }

}
