package Servicios;

import Entidad.Cafetera;
import java.util.Scanner;

public class ServicioCafetera {

    Cafetera c1 = new Cafetera();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima  

    public Cafetera llenarCafetera() {

        c1.setCapMax(1000);
        c1.setCapAct(c1.getCapMax());
        return c1;
    }

    /*Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
  tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
  cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
  método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
  cuanto quedó la taza. */
    public void ServirTaza(Cafetera c1) {

        System.out.println("Ingrese el tamaño de la taza: ");
        int tamaño = leer.nextInt();

        if (tamaño > c1.getCapAct()) {
            System.out.println("Su taza no se lleno" + c1.getCapAct());

        } else {
            int aux = c1.getCapAct() - tamaño;
            c1.setCapAct(aux);

            System.out.println("Su taza se lleno");
            System.out.println("quedaron " + c1.getCapAct() + " ml de cafe");
        }

    }

    //• Método vaciarCafetera(): pone la cantidad de café actual en cero   
    public void vaciarCafetera(Cafetera c1) {

        c1.setCapAct(0);

    }

    /* Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
    recibe y se añade a la cafetera la cantidad de café indicada.*/
    public void agregarCafe(Cafetera c1) {

        System.out.println("Ingrese la cantidad de cafe a agregar");
        int cantidad = leer.nextInt();
        int aux2 = c1.getCapAct() + cantidad;
        c1.setCapAct(aux2);

    }

}
