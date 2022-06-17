package annos;

import java.util.Scanner;


public class cicloyears {
    Scanner data = new Scanner(System.in);
    int year1;
    int year2;
    public void ciclo(){
        System.out.println("---ingresar el primer año---");
        year1 = data.nextInt();
        System.out.println("---ingresar el segundo año---");
        year2 = data.nextInt();
        System.out.println();
        if (year1 > year2)
        {
            for (int x = year1; x < year2; x++){
                System.out.println(x++);
            }
        }
        else{
            for (int y = year2; y < year1; y++){
                System.out.println(y);
            }
        System.out.println();
        }
    }
}
