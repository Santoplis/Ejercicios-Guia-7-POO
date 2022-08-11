
package ejercicio1poo;

import ejercicio1poo.Entidad.Libro;
import ejercicio1poo.Servicios.ServiceLibro;


public class Ejercicio1POO {

   
    public static void main(String[] args) {
       
        ServiceLibro sl=new ServiceLibro();
        Libro l1 = sl.crearLibro();
        
        System.out.println(l1);
    }
    
}
