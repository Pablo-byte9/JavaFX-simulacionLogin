/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pablocoj.controller;

import javafx.scene.image.Image;

/**
 *
 * @author informatica
 */
public class ImagenController {
    
    private final String RUTA_IMAGENES = "/com/pablocoj/resource/";

    /**
     * Metodo que utiliza el patron Factory, para crear diferentes imagenes y
     * retornaras
     *
     * @param nombreImagen El nombre de la imagen a crear
     * @return La imagen a mostrar
     */
    public Image getImage(String nombreImagen) {
        Image imagenAMostrar;
        switch (nombreImagen) {
            case "logo":
                imagenAMostrar = new Image(RUTA_IMAGENES + "reze-chainsaw-man - copia.gif");
                break;
            default:
                imagenAMostrar = new Image(RUTA_IMAGENES + "reze-chainsaw-man - copia.gif");
        }
        return imagenAMostrar;
    }

}
