
package ejercicio4poo;

import ejercicio4poo.Entidad.Rectangulo;

public class Ejercicio4poo {

  
    public static void main(String[] args) {
       Rectangulo r1 = new Rectangulo();
        
        r1.crearRec();
        
        System.out.println("La superficie del rectangulo es: " +r1.calcularSup(r1.getBase(), r1.getAltura()) );
        System.out.println("El perimetro del rectangulo es: " +r1.calcularPer(r1.getBase(), r1.getAltura()));
        
        System.out.println("El dibujo que se forma es: " );
        
        r1.dibRec(r1.getBase(), r1.getAltura());
    }
    
}
