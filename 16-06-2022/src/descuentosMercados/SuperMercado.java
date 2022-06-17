package descuentosMercados;

 //* @author sebas
import java.util.Scanner;



public class SuperMercado {
    public int dinero;
    double descuento1 = 10/100;
    double descuento2 = 30/100;
    double descuento3 = 50/100;
    
    public void data(){
        Scanner data = new Scanner(System.in);
        dinero = data.nextInt();
    }
    public void descuento(){
        Scanner data = new Scanner(System.in);
        dinero = data.nextInt();
        if ((10000 <= dinero)&&(20000 >= dinero)){
            double total10 = dinero*descuento1;
            System.out.println("tienes un descuento del 10%");
            System.out.println("su total es de: "+total10);
        }
        else{
            if ((20001 <= dinero)&&(50000 >= dinero)){
                double total30 = dinero*descuento2;
                System.out.println("tienes un descuento del 30%");
                System.out.println("su total es de: "+total30);
            }
            else if (dinero <= 50001){
                double total50 = dinero*descuento3;
                System.out.println("tienes un descuento del 50%");
                System.out.println("su total es de: "+total50);
            }
        }
    }
}
