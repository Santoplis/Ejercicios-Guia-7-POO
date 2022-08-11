/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
 • Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.*/
package Entidad;

public class Cafetera {

    private int CapMax;
    private int CapAct;

    public Cafetera() {

    }

    public Cafetera(int CapMax, int CapAct) {
        this.CapAct = CapAct;
        this.CapMax = CapMax;

    }

    public int getCapMax() {
        return CapMax;
    }

    public void setCapMax(int CapMax) {
        this.CapMax = CapMax;
    }

    public int getCapAct() {
        return CapAct;
    }

    public void setCapAct(int CapAct) {
        this.CapAct = CapAct;
    }

}
