package samaAtras;

import java.util.Scanner;


public class dataSuma {
    Scanner data = new Scanner(System.in);
    int n;
    public void atras(){
        System.out.println("---digite numero---");
        n = data.nextInt();
        for (int i = 0; i < n; i+=i){
            System.out.println(i);
            for (int x = n; x < n;){
                System.out.println(x);
            }
                  
        }
    }
            
    
}
