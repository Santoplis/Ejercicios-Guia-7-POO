
package package_principalex_4;

import Servicio_Nif.Clase_Servicio;


public class Principal_Ex4 {

    
    public static void main(String[] args) {
        
        Clase_Servicio s1 = new Clase_Servicio();
        Clase_Servicio s2 = new Clase_Servicio();

        s1.crearNif();

        s1.mostrar();

        s2.crearNif();
        s2.mostrar();
      }
    
}
