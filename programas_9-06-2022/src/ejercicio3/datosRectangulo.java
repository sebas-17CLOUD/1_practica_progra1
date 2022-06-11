package ejercicio3;
import java.util.Scanner;


public class datosRectangulo {
    int a;
    int b;
    int resultado;
    
    public void datos(){
        Scanner datos = new Scanner(System.in);
        System.out.println("-----ingrese la altura-----");
        a = datos.nextInt();
        System.out.println("-----ingrese la base-----");
        b = datos.nextInt();
    }
    public void rectangulo(){
        resultado = b*a;
    }
    public void show(){
        System.out.println("el area del rectangulo es de: "+resultado);
    }
}

