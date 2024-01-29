/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package PuntosClave;

import com.mycompany.ejemplo4puntosesencialesconcrud.Usuario;

/**
 *
 * @author PC
 */
public interface UsuarioDAO {
    void crearUsuario(Usuario usuario);
    Usuario leerUsuario(String nombre);
    void actualizarUsuario(Usuario usuario);
    void eliminarUsuario(String nombre);
    
}
