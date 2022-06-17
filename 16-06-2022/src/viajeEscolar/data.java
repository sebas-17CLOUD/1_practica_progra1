package viajeEscolar;

import java.util.Scanner;


public class data {
    int x;
    public void precio(){
        Scanner data = new Scanner(System.in);
        x = data.nextInt();
        if (x >= 100){
            int total100 = x*65;
            System.out.println("cada uno tiene que pagar 65 dolares, su total es de: "+total100+" dolares");
        }
        else{
            if ((x>=50)&&(x<=99)){
                int total99 = x*70;
                System.out.println("cada uno tiene que pagar 70 dolares, su total es de: "+total99+" dolares");  
            }
            else{
                if ((x>=30)&&(x<49)){
                    int total49 = x*95;
                    System.out.println("cada uno tiene que pagar 95 dolares, su total es de: "+total49+" dolares");  
                }
                else{
                    if (x<=29){
                        System.out.println("tiene que alquilar el bus a 4000 sin importa la cantidad de estudiantes");
                    }
                }
            }
        }
    }
}
