/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

//Crear una clase llamada Libro que contenga los siguientes atributos:
//ISBN, Título, Autor, Número de páginas, y un constructor con todos los
////atributos pasados por parámetro y un constructor vacío. Crear un
//método para cargar un libro pidiendo los datos al usuario y luego
//informar mediante otro método el número de ISBN, el título, el autor del
//libro y el número de páginas.

 
 
 
public class Ppalibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Libro l1= new Libro();
        l1.cargarLibro();
        l1.mostrarLibro();
        
        
    }
    
}
