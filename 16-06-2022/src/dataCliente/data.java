package dataCliente;

import java.util.Scanner;


public class data {
    int edad;
    public void tipoPago(){
        Scanner data = new Scanner(System.in);
        System.out.println("-----Cuantos años tienes?-----");
        edad = data.nextInt();
        switch(edad){
            case 1 , 2 , 3:
                System.out.println("es muy menor de edad, entra gratis.");
                break;
            case 4 , 5 , 6 , 7 , 8 , 9:
                System.out.println("tiene que pagar 5 dolares.");
                break;
            case 10 , 11 , 12 , 13 , 14 , 15:
                System.out.println("tiene que pagar 7 dolares.");
                break;
            default:
                System.out.println("tiene que pagar 10 dolares");
                break;
        }
    }
}
