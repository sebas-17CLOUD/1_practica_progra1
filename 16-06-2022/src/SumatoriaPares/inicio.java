package SumatoriaPares;

import java.util.Scanner;


public class inicio {
    public static void main(String[] args) {
        int numero;
        Scanner n = new Scanner(System.in);
        numero = n.nextInt();
        for (int i=0; i < 1001; i+=2){
            int total = numero + i;
            int suma = i + 2;
            System.out.println("la suma de "+numero+" + "+suma+" es de: "+total);
        }
    }
}
