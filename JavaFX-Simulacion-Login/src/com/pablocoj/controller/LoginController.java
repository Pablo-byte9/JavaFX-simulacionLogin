/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pablocoj.controller;

import com.pablocoj.model.Usuario;
import com.pablocoj.view.LoginView;
import com.sun.scenario.effect.impl.Renderer;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author informatica
 */
public class LoginController {

    private final LoginView LOGIN_VIEW;
    private double ejeX = 0;
    private double ejeY = 0;
    private Stage escenario = SceneManager
            .getInstanciaSceneManager().getEscenarioPrincipal();

    public LoginController(LoginView loginView) {
        this.LOGIN_VIEW = loginView;
        this.ConstruirAcciones();
    }

    public void ConstruirAcciones() {
        this.LOGIN_VIEW.getBtnCerrarVentana().setOnMouseClicked(
                (evento) -> {
                    System.exit(0);
                }
        );
        this.LOGIN_VIEW.setOnMouseClicked(
                (evento) -> {
                    ejeX = evento.getSceneX();
                    ejeY = evento.getSceneY();

                    System.out.println("X " + ejeX);
                    System.out.println("Y " + ejeY);
                }
        );
        this.LOGIN_VIEW.setOnMouseDragged(
                (evento) -> {
                    double ejeXVentanaDesplazada = evento.getScreenX();
                    double ejeYVentanaDesplazada = evento.getScreenY();

                    System.out.println("X " + ejeX);
                    System.out.println("Y " + ejeY);
                    System.out.println("Desplazameinto X " + (ejeXVentanaDesplazada - ejeX));
                    System.out.println("Desplazamiento Y  " + (ejeYVentanaDesplazada - ejeY));
                    escenario.setX(ejeXVentanaDesplazada - ejeX);
                    escenario.setY(ejeYVentanaDesplazada - ejeY);
                }
        );
        this.LOGIN_VIEW.getBtnIniciarSesion().setOnMouseClicked(
                (evento) -> {
                    iniciarSesion();
                }
        );
    }
    private AuthSistema authSistema = new AuthSistema();

    public void iniciarSesion() {
        String nombreUsuario = this.LOGIN_VIEW.getTxtNombreUsuario().getText().trim();
        String clave = this.LOGIN_VIEW.getPwdClave().getText().trim();

        if (nombreUsuario.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "No deje el Campo Nombre Usuario Vacio");
            this.LOGIN_VIEW.getTxtNombreUsuario().getStyleClass().add("empty");

        } else if (clave.isEmpty()) {
            this.LOGIN_VIEW.getTxtNombreUsuario().getStyleClass().remove("empty");
            this.LOGIN_VIEW.getPwdClave().getStyleClass().add("empty");
            JOptionPane.showMessageDialog(null,
                    "No deje el Campo Contraseña Vacio");

        } else {
            this.LOGIN_VIEW.getPwdClave().getStyleClass().remove("empty");
            Usuario usuario = authSistema.login(nombreUsuario, clave);
            if (usuario == null) {
                this.LOGIN_VIEW.getTxtNombreUsuario().getStyleClass().add("error");
                this.LOGIN_VIEW.getPwdClave().getStyleClass().add("error");
                JOptionPane.showMessageDialog(null, "Valide sus Credenciales");
            } else {
                SceneManager.getInstanciaSceneManager().ventanaBienvenida(usuario.getNombreCompleto());
            }
        }
    }
}
