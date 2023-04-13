/*
 Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura.
La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.

 */
package guia7eje4;

import java.util.Scanner;

public class rectanguloEntidad {
Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void rectangulo() {
    }
    private int base;
    private int altura;
    

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
public void crearRectangulo(){

    System.out.println("ingrese la base del rectangulo");
    base= leer.nextInt();
    System.out.println("ingrese la altura del rectangulo");
    altura= leer.nextInt();
    
}
public double calculoSupRectangulo(){
    return (base*altura);
}
public double perimetro(){
    return ((base+altura)*2);
    
}
public void dibujarRectangulo(){
    for (int i = 0; i < base; i++) {
        for (int j = 0; j < altura; j++) {
            if (i==0 ||i==base-1 || j==0 || j==altura-1) {
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
  
        }
        System.out.println(" ");
    }
  
}    

   
}


