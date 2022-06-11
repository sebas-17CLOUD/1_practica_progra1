package salario;

import java.util.Scanner;


public class datoSalario {
    int salario;
    int dias;
    int total;
    float rebajap;
    float rebajas;
    int rebajaPension;
    
    public void datoSalario(){
        Scanner dato = new Scanner(System.in);
        System.out.println("-----ingrese tu salario-----");
        salario = dato.nextInt();
        System.out.println("-----ingrese numero de dias trabajados-----");
        dias = dato.nextInt();
    }
    public void rebaja(){
        rebajap = 10/100;
        rebajas = 15/100;
        total = salario*dias;
        rebajaPension = (int) (total-rebajap-rebajas);
    }
    public void show(){
        System.out.println("le va a quedar un total de: "+rebajaPension);
    }
}
