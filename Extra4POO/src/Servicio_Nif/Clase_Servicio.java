
package Servicio_Nif;

import Entidad.Nif;
import java.util.Scanner;

/*• Métodos getters y setters para el número de DNI y la letra.
• Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
resultado del calculo.
• Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en
mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un método que
funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el número
de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe buscar en
un array (vector) de caracteres la posición que corresponda al resto de la división para
obtener la letra correspondiente. La tabla de caracteres es la siguiente:*/

public class Clase_Servicio {

    Scanner leer = new Scanner(System.in);
    Nif n1 = new Nif();
    
    String vector [] = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
    

    //Método crearNif()   
    
    public Nif crearNif() {

        System.out.println("Ingrese su DNI");
        n1.setDni(leer.nextInt());
        int resto = n1.getDni()%23;
        for (int i = 0; i < 23; i++) {
            if(resto == i){
             n1.setNif(vector[i]);
            }
        }
        return n1;
       }
    //Método mostrar()
    
    public void mostrar(){
        
        System.out.println("Su Nif es: "+ n1.getDni()+ "-" + n1.getNif());
        
        
        
    }
    
    
    
    
    
    
    
    
}

