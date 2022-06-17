package membresias;

import java.util.Scanner;


public class inicio {
    Scanner dato = new Scanner(System.in);
    String membresia;
    
    public void datos(){
        System.out.println("---que tipo de membresia eres?---");
        membresia = dato.nextLine();
        switch(membresia){
            case "A":
                System.out.println("se te otorga un descuento del 10%");
                break;
            case "B":
                System.out.println("se te otorga un descuento del 20%");
                break;
            case "C":
                System.out.println("se te otorga un descuento del 40%");
                break;
            case "a":
                System.out.println("se te otorga un descuento del 10%");
                break;
            case "b":
                System.out.println("se te otorga un descuento del 20%");
                break;
            case "c":
                System.out.println("se te otorga un descuento del 40%");
                break;
        }
    }
}
