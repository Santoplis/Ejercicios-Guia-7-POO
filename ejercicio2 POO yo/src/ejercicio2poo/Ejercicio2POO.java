
package ejercicio2poo;


public class Ejercicio2POO {

   
    public static void main(String[] args) {
      
        Circunferencia circ1 = new Circunferencia();
        
        circ1.crearCircunferencia();
        
       System.out.println("El área es igual a: " + circ1.calcularArea(circ1.getRadio()));
        System.out.println("El perimetro es: "+circ1.calcularPerimetro(circ1.getRadio()));
    }
    
}
