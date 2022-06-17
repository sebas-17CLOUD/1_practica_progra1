package negaandposi;

import java.util.Scanner;


public class inicio {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int c;
        int n = 0;
        int p = 0;
        int ne = 0;
        System.out.println("---cuantos numeros vas a ingresar?---");
        c = data.nextInt();
        for (int i = 0; i < 6; i++){
            if (n > 0){
                p++;
                System.out.println(+n+" es positivo");
            }
            if (n < 0){
                ne++;
                System.out.println(n+"es negativo");
            }
            {
                
            }
        }
        System.out.println("hay "+p+" numeros positivos");
        System.out.println("hay "+ne+" numeros positivos");
    }
}
