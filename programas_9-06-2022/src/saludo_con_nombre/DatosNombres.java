package saludo_con_nombre;

import java.util.Scanner;


public class DatosNombres {
    String nombre;
    String apellido;
    
    public void datos(){
        Scanner datos = new Scanner(System.in);
        System.out.println("-----ingrese tu nombre-----");
        nombre = datos.next();
        System.out.println("-----ingrese tu apellido-----");
        nombre = datos.next();
    }
    public void saludo(){
        System.out.printf("hola %s1 ,%s2, bienvenid@",apellido,nombre);
        
    }
    
    
}
