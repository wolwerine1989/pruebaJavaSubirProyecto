/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo4puntosesencialesconcrud;

/**
 *
 * @author PC
 */

//Clase base de encapsulamiento y abstraccion
public class Usuario {
    private String nombre;
    private int edad;

    
    //Metodo de actualizacion de Encapsulamiento
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //Metodos de acceso de encapsulamiento
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }    
    
    //Constructor
    public Usuario(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String toString(){
        return "Usuario [nombre=" + nombre + ", edad " + edad +"]";
    }
    
}
