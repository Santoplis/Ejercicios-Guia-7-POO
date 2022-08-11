
package ejercicio1poo.Servicios;

import ejercicio1poo.Entidad.Libro;
import java.util.Scanner;


public class ServiceLibro {
    //ojo usedelimiter sirve para evitar que se me peguen las variables cuando cargo datos
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Libro crearLibro(){
        System.out.println("ingrese el ISBN");
        int ISBN=leer.nextInt();
        
        System.out.println("ingrese el Titulo");
        String titulo=leer.next();
        
        System.out.println("ingrese el Autor");
        String autor=leer.next();
        
        System.out.println("ingrese numero de paginas");
        int nroDePaginas=leer.nextInt();
        
        return new Libro(ISBN, titulo, autor, nroDePaginas);
    }
}
