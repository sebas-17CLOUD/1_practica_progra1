
package piramide;

import java.util.Scanner;


public class inicio {
    int size;
    public void piramide(){
        Scanner tamanno = new Scanner(System.in);
        System.out.println("-----ingresar de que tamaño lo quieres?-----");
        size = tamanno.nextInt();
        for (int horizontal = 1;horizontal<size;horizontal++){
        
            for (int space = 1; space < size; space ++){
                System.out.println(" ");
            }
            for (int signo = 1;signo <= (horizontal*2)-1; signo++){
                System.out.print("*");
                    
            } 
            System.out.println("");
        }
    }
}
