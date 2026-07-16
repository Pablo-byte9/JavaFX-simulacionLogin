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
        Usuario usuarioAdmin = new Usuario("admin", "Admin", "Administrador", Rol.ADMIN);
        Usuario usuarioUser = new Usuario("user", "User", "Usuario", Rol.USER);
        Usuario usuarioYo = new Usuario("pablo", "123456", "Pablo Coj", Rol.USER);

        listaUsuario.add(usuarioAdmin);
        listaUsuario.add(usuarioUser);
        listaUsuario.add(usuarioYo);
    }

    public Usuario login(String nombreUsuario, String clave) {
        for (Usuario usuarioBuscado : listaUsuario) {
            if (usuarioBuscado.getUsername().equals(nombreUsuario)
                    && usuarioBuscado.getPassword().equals(clave)) {

                return usuarioBuscado;
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
