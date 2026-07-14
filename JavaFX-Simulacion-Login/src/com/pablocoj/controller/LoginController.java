/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pablocoj.controller;

import com.pablocoj.view.LoginView;

/**
 *
 * @author informatica
 */
public class LoginController {
    private final LoginView LOGIN_VIEW;
    
    public LoginController(LoginView loginView){
        this.LOGIN_VIEW = loginView;
    }
    public void ConstruirAcciones(){
        this.LOGIN_VIEW.getBtnCerrarVentana().setOnMouseClicked(
        (evento) ->{
            System.exit(0);
        }
        );
    }
}
