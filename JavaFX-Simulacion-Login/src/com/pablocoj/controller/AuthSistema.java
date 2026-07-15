/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pablocoj.controller;

import com.pablocoj.model.Rol;
import com.pablocoj.model.Usuario;
import java.util.ArrayList;

/**
 *
 * @author informatica
 */
public class AuthSistema {

    private static ArrayList<Usuario> listaUsuario = new ArrayList<>();

    public AuthSistema() {
        Usuario usuarioAdmin = new Usuario("admin", "admin", "admin", Rol.ADMIN);
        Usuario usuarioUser = new Usuario("user", "user", "user", Rol.USER);
        Usuario userYo = new Usuario("pablo", "123456", "Pablo Coj", Rol.USER);
    }

    public Usuario login(String nombreUsuario, String clave) {
        for (Usuario usuarioBuscado : listaUsuario) {
            if (usuarioBuscado.getUsername().equals(nombreUsuario)
                    && usuarioBuscado.getPassword().equals(clave)) {

            }
        }
        return null;
    }

    public static ArrayList<Usuario> getListaUsuario() {
        return listaUsuario;
    }

    public static void setListaUsuario(ArrayList<Usuario> listaUsuario) {
        AuthSistema.listaUsuario = listaUsuario;
    }

}
