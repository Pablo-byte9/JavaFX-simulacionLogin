/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pablocoj.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

/**
 *
 * @author informatica
 */
public class BienvenidaView extends VBox {

    private Label lblBienvenida;
    private final String RUTA_ESTILOS = "/com/pablocoj/styles/";

    public BienvenidaView() {

        this.getStylesheets().add(RUTA_ESTILOS + "LoginStyles.css");
        this.setPadding(new Insets(15));

        this.setBorder(new Border(
                new BorderStroke(Color.MEDIUMSPRINGGREEN,//Color de Borde
                        BorderStrokeStyle.SOLID,//Estilo de Linea
                        new CornerRadii(25),//Pixeles de redondeado
                        new BorderWidths(10))//Ancho del Borde
        ));
        this.setBackground(new Background(
                new BackgroundFill(Paint.valueOf("F0F8FF"), //  Color del fondo
                        new CornerRadii(30),//Pixeles de redondeado
                        Insets.EMPTY)//Espaciado del fondo

        ));
        lblBienvenida = new Label("Bienvenido Usuario");
        this.getChildren().add(lblBienvenida);
    }

    public Label getLblBienvenida() {
        return lblBienvenida;
    }

    public void setLblBienvenida(Label lblBienvenida) {
        this.lblBienvenida = lblBienvenida;
    }

}
