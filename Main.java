/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1extra;

//Desarrollar una clase Cancion con los siguientes atributos: título y autor. 
//Se deberá́ definir además dos constructores: uno vacío que inicializa el título y el autor a cadenas vacías y 
//otro que reciba como parámetros el título y el autor de la canción. 
//Se deberán además definir los métodos getters y setters correspondientes.*/

public class Main {

 
    public static void main(String[] args) {
   
        Entidad cancion1= new Entidad();
      
        cancion1.cargarDatos();
        System.out.println("el titulo es " + cancion1.getTitulo());
        
        
    }
    
    
}
