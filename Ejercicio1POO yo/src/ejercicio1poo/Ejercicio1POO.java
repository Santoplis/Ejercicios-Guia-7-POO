
package ejercicio1poo;

import java.util.Scanner;


public class Ejercicio1POO {

    
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       leer.useDelimiter("\n");
       
       Libro l1 = new Libro();
       
        System.out.println("ingrese el ISBN");
       l1.setISBN(leer.nextInt());
       
        System.out.println("ingrese el Titulo");
        l1.setTitulo(leer.next());
        
        System.out.println("ingrese el Autor");
        l1.setAutor(leer.next());
        
        System.out.println("ingrese el numero de paginas");
        l1.setNumeroDePaginas(leer.nextInt());
        
        System.out.println(l1.toString());
       
    }
    
}
