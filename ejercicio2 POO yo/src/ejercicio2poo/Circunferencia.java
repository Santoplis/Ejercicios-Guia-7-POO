
package ejercicio2poo;

import java.util.Scanner;

public class Circunferencia {
    Scanner leer=new Scanner(System.in);
    private double radio;

    public Circunferencia() {
    }
    
    

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }
    
    public void crearCircunferencia() {
    
        System.out.println("ingrese el radio");
        radio=leer.nextDouble();
        
    }   
    
    public double calcularArea(double radio){
      
       double area=0;
       area= Math.PI*(radio*radio);
       return area;
        
    }
    
    public double calcularPerimetro(double radio){
        double perimetro=0;
        perimetro= (2*Math.PI)*radio;
        return perimetro;
    }
    
    
}
