package operaciones;

import java.util.Scanner;

public class datos {
    int n1;
    int n2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    public void lector(){
        Scanner datos = new Scanner(System.in);
        System.out.println("-----ingrese el primer numero-----");
        n1 = datos.nextInt();
        System.out.println("-----ingrese el segundo numero-----");
        n2 = datos.nextInt();
    }
    
    public void sumarn(){
        suma = n1+n2;
    }
    
    public void restarn(){
        resta = n1-n2;
    }
    public void multiplicacionn(){
        multiplicacion = n1*n2;
    }
    public void divisionn(){
        division = n1/n2;
    }
    public void resultados(){
        System.out.println("la suma de sus dos numeros es "+suma);
        System.out.println("la resta de sus dos numeros es de "+resta);
        System.out.println("la multiplicacion de sus dos numeros es de "+multiplicacion);
        System.out.println("la division de sus dos numeros es de "+division);
    }
}
