/*
 Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura. 
La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario. 
También incluirá un método para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo. 
Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.

 */
package guia7eje4;


public class Guia7eje4 {


    public static void main(String[] args) {
      rectanguloEntidad rectangulo1= new rectanguloEntidad();
      rectangulo1.crearRectangulo();
  
        System.out.println(" la perimetro es "+ rectangulo1.perimetro());
        System.out.println("el superficie es " + rectangulo1.calculoSupRectangulo());
         System.out.println("el dibujo es ");
         rectangulo1.dibujarRectangulo();
    }
    
}
