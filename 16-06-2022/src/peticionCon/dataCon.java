package peticionCon;

import java.util.ArrayList;
import java.util.Scanner;


public class dataCon {
    int nota;
    int[] v = new int[nota];
    public void data(){
        
    }
    public void notas(){
        while (opcion=="si"){
            Scanner data = new Scanner(System.in);
            System.out.println("nota del estudiante");
            nota = data.nextInt();
            ArrayList Lista = new ArrayList();
            Lista.add(nota);
    
            System.out.println("deseas continuar?");
            opcion = data.nextLine(); 
        }
    }
}
