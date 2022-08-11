
package ejercicio4poo.Entidad;

import java.util.Scanner;


public class Rectangulo {
     Scanner leer = new Scanner(System.in);
    
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
     public void crearRec() {
        System.out.println("Ingrese la base del rectangulo: ");
        base = leer.nextInt();
        System.out.println("Ingrese la altura: ");
        altura = leer.nextInt();
    }
    public int calcularSup(int base, int altura){
        
      
      int superficie = base * altura;
          
       return superficie;
        
    }
     
    public int calcularPer (int base, int altura){
        
        int perimetro = (base * altura)*2;
        
        return perimetro;
        
    }
     public void dibRec (int base, int altura){
        
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i==0 || i == (altura - 1)){
                    System.out.print(" * ");
                }else if (j == 0 || j == base -1){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
                
            }
            System.out.println("");
        }
      
    }
}
