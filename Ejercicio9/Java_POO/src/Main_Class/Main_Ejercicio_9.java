
package Main_Class;

import Entidad.Ejercicio9Matematica;



public class Main_Ejercicio_9 {
/*Método Static y Clase Math
9. Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos: */
    
    public static void main(String[] args) {
    
      
        //Creo el objeto    
        //Ejercicio9Matematica numeros = new Ejercicio9Matematica(Math.random()*10,Math.random()*10);
        Ejercicio9Matematica numeros = new Ejercicio9Matematica();
        numeros.setNumero1(Math.random() * 10);
        numeros.setNumero2(Math.random() * 10);
        System.out.println("Los valores son: " + numeros.getNumero1() + "\n " + numeros.getNumero2());
        System.out.println("El mayor es: " + numeros.devolverMayor());
        System.out.println("La potencia es: " + numeros.calcularPotencia());
        System.out.println("La raiz es: " + numeros.calculaRaiz());

    
    
        
        
        
        
        
        
        
        
        
        
    }
    
}
