/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.educastur.mariova62.biblioteca2026;

/**
 *
 * @author 1dawd07
 */
public class LibroNoDisponible extends Exception{
    public LibroNoDisponible(String cadena){
                super(cadena); //Llama al constructor de Exception y le pasa el contenido
    }
}
