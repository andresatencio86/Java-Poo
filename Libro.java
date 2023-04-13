/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

//Crear una clase llamada Libro que contenga los siguientes atributos:
import java.util.Scanner;

//ISBN, Título, Autor, Número de páginas, y un constructor con todos los
////atributos pasados por parámetro y un constructor vacío. Crear un
//método para cargar un libro pidiendo los datos al usuario y luego
//informar mediante otro método el número de ISBN, el título, el autor del
//libro y el número de páginas.
public class Libro {

    int ISBN;
    String titulo;
    String autor;
    int ndepaginas;

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int ndepaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.ndepaginas = ndepaginas;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNdepaginas() {
        return ndepaginas;
    }

    public void setNdepaginas(int ndepaginas) {
        this.ndepaginas = ndepaginas;
    }

    public void cargarLibro() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el ISBN del libro deseado");
        ISBN = leer.nextInt();
        System.out.println("Ingrese el titulo del libro deseado");
        titulo = leer.next();
        System.out.println("Ingrese el autor del libro deseado");
        autor = leer.next();
        System.out.println("Ingrese el n de paginas del libro deseado");
        ndepaginas = leer.nextInt();
    }

    public void mostrarLibro() {
        System.out.println("ISBN es :  " + ISBN);
        System.out.println("titulo es :  " + titulo);
        System.out.println("el autor es " + autor);
        System.out.println("el numero de paginas es " + ndepaginas);
        
        
        
}
    }
    

