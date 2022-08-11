/* Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes:
*/

package Package_Entidad;

import java.util.Scanner;


public class Raices {   

    Scanner leer = new Scanner(System.in);
    
    // ATRIBUTOS
    
    public int a;
    public int b;
    public int c;

    
    // Constuctor vacio
    public Raices() {
    }

    // Constuctor parametrizado
    public Raices(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    //////////////////////////////////////////////////
    // Metodo de Calculo
    /////////////////////////////////////////////////
    
    // cargar valores
    public void cargarValores (){
      
        System.out.println("ingrese los valores: a,b,c "); 
        a = leer.nextInt();
        b = leer.nextInt();
        c = leer.nextInt();
        
       // • Método getDiscriminante(): devuelve el valor del discriminante (double). El
       //discriminante tiene la siguiente formula: (b^2)-4*a*c

    }
    
    // Discriminante
    public double getDiscriminante(){
        
        return (Math.pow(b, 2))-4*a*c;
        
    }    
 
  /* Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
     que esto ocurra, el discriminante debe ser mayor o igual que 0.*/
    public boolean tieneraices(){
        
        return getDiscriminante() > 0;
        
    }
    
  /*Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
      que esto ocurra, el discriminante debe ser igual que 0.*/
     public boolean tieneRaiz(){
        
        return getDiscriminante() == 0;
        
    }
     
  /* Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true, imprime las 2 
     posibles soluciones. */
     public void obtenerRaices(){
         
         if ( tieneraices() ) {
             
             System.out.println("solución_1 -> " + ( -b+Math.sqrt(getDiscriminante() ) )/(2*a) );
             System.out.println("");
             System.out.println("solución_2 -> " + ( -b-Math.sqrt(getDiscriminante() ) )/(2*a) );
             
         }else {
             System.out.println("No tiene dos Soluciones");
         }
         
     }
     
 /* Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime una única raíz. Es
      en el caso en que se tenga una única solución posible.    */
     public void ObtenerRaiz(){
         
         if (tieneRaiz()) {
             
              System.out.println("solución unica -> " + ( -b+Math.sqrt(getDiscriminante() ) )/(2*a) );
             
         }
         
     }
     
  /*  Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
      pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
      obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
      de no existir solución, se mostrará un mensaje.   */
     public void Calcular() {
        
         if (tieneRaiz()) {
             
             ObtenerRaiz();
             
         }else if (tieneraices()) {
             
             obtenerRaices();
             
         }else {
             System.out.println("No Existe Solución");
         }
         
         
     }
    
    
}
