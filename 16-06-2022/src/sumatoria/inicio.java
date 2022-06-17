package sumatoria;

import java.util.Locale;
import java.util.Scanner;


public class inicio {
    int numero;
    public void suma(){
        Scanner n = new Scanner(System.in);
        numero = n.nextInt();
        for (int i=0; i < 1001; i++){
            int total = numero + i;
            System.out.println("la suma de "+numero+" + "+i+++" es de: "+total);
            //System.out.printf("la suma de d% + d% es de: d%",numero,i++,total); no pude//**
        }
    }
}
