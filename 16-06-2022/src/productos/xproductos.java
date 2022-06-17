package productos;

import java.util.Scanner;


public class xproductos {
    int x;
    int d1 = 15/100;
    int d2 = 20/100;
    public void descuento(){
        Scanner data = new Scanner(System.in);
        x = data.nextInt();
        if (x < 20){
            double des1 = x*d1;
            System.out.println("se le hace un descuento del 15%");
        }
        else{
            if (x >= 20){
                double des1 = x*d2;
                System.out.println("se le hace un descuento del 20%");
            }
        }
    }
}
