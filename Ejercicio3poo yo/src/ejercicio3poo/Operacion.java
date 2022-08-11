
package ejercicio3poo;

import java.util.Scanner;


public class Operacion {
    Scanner leer = new Scanner(System.in);
    
    private int num1;
    private int num2;

    public Operacion() {
    }

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "Operacion{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }
    
    public void crearOperacion(){
        System.out.println("ingrese el primer número");
        this.num1=leer.nextInt();
        
        System.out.println("ingrese el segundo numero");
        this.num2=leer.nextInt();
          
        
    }
    public int suma(int num1,int num2){
        
        return num1+num2;
    }
    public int resta(int num1,int num2){
        
        return num1-num2;
    }
    public int multiplicacion(int num1,int num2){
        if (num1!=0 && num2!=0) {
            return num1+num2;
        }else {
            return 0;
        }
    }
    public double division(int num1,int num2){
        if (num2==0) {
            return 0;
        }else {
            return num1/num2;
        }
    }
}
