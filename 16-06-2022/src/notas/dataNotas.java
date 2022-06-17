package notas;

import java.util.Scanner;


public class dataNotas {
    public static void main(String[] args) {
        int lineas;
        Scanner data = new Scanner(System.in);
        System.out.println("de que tamaño lo quieres?");
        lineas = data.nextInt();
        for (int i = 1; i < lineas; i++){
            System.out.println("");
            for(int x=1; x<=i;x++){
                System.out.print(x);
                
            }
            
        }
    }
}
