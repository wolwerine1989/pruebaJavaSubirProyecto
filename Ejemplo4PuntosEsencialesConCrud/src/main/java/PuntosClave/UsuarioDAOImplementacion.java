/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PuntosClave;

import com.mycompany.ejemplo4puntosesencialesconcrud.Usuario;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author PC
 */
public class UsuarioDAOImplementacion implements UsuarioDAO{
    
    private Map<String, Usuario>baseDatos = new HashMap<>();
    
    
    @Override
    public void crearUsuario(Usuario usuario) {
        baseDatos.put(usuario.getNombre(),usuario);
    }

    @Override
    public Usuario leerUsuario(String nombre) {
        return baseDatos.get(nombre);
    }

    @Override
    public void actualizarUsuario(Usuario usuario) {
        baseDatos.put(usuario.getNombre(),usuario);
    }

    @Override
    public void eliminarUsuario(String nombre) {
        baseDatos.remove(nombre);
    }
    
    //System.out.println("hola mundo");
    
    
}
