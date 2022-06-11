package ejercicio4;

import java.util.Scanner;


public class notas {
    int nota;
    
    public void notaData(){
        Scanner notasr = new Scanner(System.in);
        System.out.println("-----ingrese la nota del estudiante-----");
        nota =notasr.nextInt();  
    }
    public void resultado(){
        switch (nota){
            case 90 , 91 , 92 , 93 , 94 , 95 , 96 , 97 , 98 , 99 , 100:
                System.out.println("el estudiante se eximio");
                break;
            case 80 , 81 , 82 , 83 , 84 , 85 , 86 , 87 , 88 , 89:
                System.out.println("el estudiante paso en intermedio");
                break;
            case 70 , 71 , 72 , 73 , 74 , 75 , 76 , 77 , 78 ,79:
                System.out.println("el estudiante tuvo que estudiar más, esta bajo");
                break;
            default:
                System.out.println("estudiante reprobado");
                System.out.println("repetira el curso");
                break;
        }
    }
}
