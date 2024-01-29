/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplo4puntosesencialesconcrud;

import PuntosClave.UsuarioDAO;
import PuntosClave.UsuarioDAOImplementacion;

/**
 *
 * @author PC
 */
public class Ejemplo4PuntosEsencialesConCrud {

    public static void main(String[] args) {
       
        //Crear instancia del DAO
       UsuarioDAO usuarioDao = new UsuarioDAOImplementacion();
       
       //Crear un Usuario
       Usuario nuevoUsuario = new Usuario("Pedro", 25);
       usuarioDao.crearUsuario(nuevoUsuario);
       
     
       //Leer Usuario
       Usuario usuarioLeido = usuarioDao.leerUsuario("Pedro");
       System.out.println("El usuario se llama: " + usuarioLeido);
       
    }
}
