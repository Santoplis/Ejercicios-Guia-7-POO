
package ejercicio3poo;

public class Ejercicio3poo {

   
    public static void main(String[] args) {
      Operacion op = new Operacion();
      
      op.crearOperacion();
      
        System.out.println("la suma es: " +op.suma(op.getNum1(), op.getNum2()));
        System.out.println("la resta es: " +op.resta(op.getNum1(), op.getNum2()));
                
        System.out.println("el producto es: " +op.multiplicacion(op.getNum1(), op.getNum2()));
        
        
        if (op.getNum2()==0) {
            System.out.println("error en la division por cero");
        }else{
            System.out.println("el cociente es: "+ op.division(op.getNum1(), op.getNum2()));
        }
    }
    
}
