/*
 Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
 */
package Entidad;

import java.util.Scanner;

public class Puntos {
 Scanner leer = new Scanner(System.in);

    public int x1;
    public int y1;
    public int x2;
    public int y2;
//constructor vacio

    public Puntos() {
    }
//constructor por parametros

    public Puntos(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    //Metodo 1
    public void crearPuntos() {
        System.out.println("ingrese la coordenada x del punto 1");
        x1 = leer.nextInt();
        System.out.println("ingrese la coordenada y del punto 1");
        y1 = leer.nextInt();
        System.out.println("ingrese la coordenada x del punto 2");
        x2 = leer.nextInt();
        System.out.println("ingrese la coordenada y del punto 2");
        y2 = leer.nextInt();
    }

    //Metodo 2
    public double calcularDistancia() {

        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }   
}
