
package Entidad;

/*Método Static y Clase Math

9. Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos: 
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.*/
public class Ejercicio9Matematica {

    //Creo atributos
    public double numero1;
    public double numero2;

    //Constructor por defecto
    public Ejercicio9Matematica() {
    }

    //Constructor parametrizado
    public Ejercicio9Matematica(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    //getters & setters

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    //a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
    public double devolverMayor() {

        return Math.max(numero1, numero2);
    }

    //b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
    //al menor número. Previamente se deben redondear ambos valores.
   // math.pow es la funcion potencia de un numero
    public double calcularPotencia() {
        double aux = 0;
        numero1 = Math.round(numero1);
        numero2 = Math.round(numero2);
        if (numero1 > numero2) {
            aux = Math.pow(numero1, numero2);
        } else {
            aux = Math.pow(numero2, numero1);
        }
        return aux;

    }
    //c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
    //Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
   
    public double calculaRaiz() {
//        double aux = 0;
//        numero1 = Math.abs(numero1);
//        numero2 = Math.abs(numero2);
//        if (numero1 > numero2) {
//            aux = Math.sqrt(numero2);
//        } else {
//            aux = Math.sqrt(numero1);
//        }
//        return aux;
         
          return Math.sqrt(Math.abs(Math.min(numero1, numero2)));
          
    } 
    
}
