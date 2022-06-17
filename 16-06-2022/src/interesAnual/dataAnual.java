package interesAnual;

import java.util.Scanner;


public class dataAnual {
    int x;
    int t;
    int p;
    public void anual(){
        Scanner data = new Scanner(System.in);
        System.out.println("-----cuanto vas a invertir?-----");
        x = data.nextInt();
        System.out.println("-----a cuantos años?-----");
        t = data.nextInt();
        System.out.println("-----cuanto es la tasa de interes?-----");
        p = data.nextInt();
        int i = p/100;
        int anual =(int) (Math.pow(x*(1+i), t));
        System.out.println("anualmente sería: "+anual);
    }
}
