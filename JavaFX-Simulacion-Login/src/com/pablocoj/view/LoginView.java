/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pablocoj.view;

import com.pablocoj.controller.ImagenController;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

/**
 *
 * @author informatica
 */
public class LoginView extends BorderPane {

    private static LoginView instanciaLoginView;
    private HBox barraDeVentana;
    private Button btnCerrarVentana;
    private Label lblTituloVentana;

    private ImageView imgLogoLogin;
    private TextField txtNombreUsuario;
    private Label lblNombreUsuario;

    private PasswordField pwdClave;
    private Label lblClave;

    private GridPane formulario;
    private Button btnIniciarSesion;
    private VBox cajaVertical;

    private final String RUTA_ESTILOS = "/com/pablocoj/styles/";

    private LoginView() {
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
        barraDeVentana = new HBox(20);
        btnCerrarVentana = new Button("X");
        lblTituloVentana = new Label("JAVAFX - SIMULADOR LOGIN");

        barraDeVentana.getChildren().addAll(btnCerrarVentana, lblTituloVentana);

        this.setTop(barraDeVentana);

        cajaVertical = new VBox(15);
        formulario = new GridPane();

        txtNombreUsuario = new TextField();
        lblNombreUsuario = new Label("Ingrese su Nombre Usuario");

        lblClave = new Label("Ingrese su contraseña");
        pwdClave = new PasswordField();

        formulario.add(lblNombreUsuario, 0, 0);
        formulario.add(txtNombreUsuario, 1, 0);

        formulario.add(lblClave, 0, 1);
        formulario.add(pwdClave, 1, 1);

        btnIniciarSesion = new Button("Iniciar Sesion");

        imgLogoLogin = new ImageView(new ImagenController().getImage("logo"));
        imgLogoLogin.setFitHeight(200);
        imgLogoLogin.setFitWidth(200);
        imgLogoLogin.setCache(true);

        cajaVertical.setAlignment(Pos.TOP_CENTER);

        cajaVertical.getChildren().addAll(
                imgLogoLogin, formulario,
                btnIniciarSesion
        );

        this.setCenter(cajaVertical);
    }

    public static LoginView getInstanciaLoginView() {
        if (instanciaLoginView == null) {
            instanciaLoginView = new LoginView();
        }
        return instanciaLoginView;
    }

    public static void setInstanciaLoginView(LoginView instanciaLoginView) {
        LoginView.instanciaLoginView = instanciaLoginView;
    }

    public Button getBtnCerrarVentana() {
        return btnCerrarVentana;
    }

    public void setBtnCerrarVentana(Button btnCerrarVentana) {
        this.btnCerrarVentana = btnCerrarVentana;
    }

    public HBox getBarraDeVentana() {
        return barraDeVentana;
    }

    public void setBarraDeVentana(HBox barraDeVentana) {
        this.barraDeVentana = barraDeVentana;
    }

    public Label getLblTituloVentana() {
        return lblTituloVentana;
    }

    public void setLblTituloVentana(Label lblTituloVentana) {
        this.lblTituloVentana = lblTituloVentana;
    }

    public ImageView getImgLogoLogin() {
        return imgLogoLogin;
    }

    public void setImgLogoLogin(ImageView imgLogoLogin) {
        this.imgLogoLogin = imgLogoLogin;
    }

    public TextField getTxtNombreUsuario() {
        return txtNombreUsuario;
    }

    public void setTxtNombreUsuario(TextField txtNombreUsuario) {
        this.txtNombreUsuario = txtNombreUsuario;
    }

    public Label getLblNombreUsuario() {
        return lblNombreUsuario;
    }

    public void setLblNombreUsuario(Label lblNombreUsuario) {
        this.lblNombreUsuario = lblNombreUsuario;
    }

    public PasswordField getPwdClave() {
        return pwdClave;
    }

    public void setPwdClave(PasswordField pwdClave) {
        this.pwdClave = pwdClave;
    }

    public Label getLblClave() {
        return lblClave;
    }

    public void setLblClave(Label lblClave) {
        this.lblClave = lblClave;
    }

    public GridPane getFormulario() {
        return formulario;
    }

    public void setFormulario(GridPane formulario) {
        this.formulario = formulario;
    }

    public Button getBtnIniciarSesion() {
        return btnIniciarSesion;
    }

    public void setBtnIniciarSesion(Button btnIniciarSesion) {
        this.btnIniciarSesion = btnIniciarSesion;
    }

    public VBox getCajaVertical() {
        return cajaVertical;
    }

    public void setCajaVertical(VBox cajaVertical) {
        this.cajaVertical = cajaVertical;
    }

}
