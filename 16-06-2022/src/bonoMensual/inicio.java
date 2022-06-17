package bonoMensual;

import java.util.Scanner;


public class inicio {
    Scanner data = new Scanner(System.in);
    int annos;
    int ganancias;
    float d10 = 10/100;
    float d15 = 15/100;
    float d20 = 20/100;
    float d25 = 25/100;
    float d30 = 30/100;
    public void resultado(){
        System.out.println("cuantos años llevas en la empresa?");
        annos = data.nextInt();
        System.out.println("cuanto ganas al mes en dolares?");
        ganancias = data.nextInt();
        if ((2 <= annos) && (4 >= annos) && (ganancias < 1000))
                System.out.println("por tus años se te otorga el 20%: "+ganancias/d20+" y por tu ganancia se te otorga un 25% a parte: "+ganancias/d25);
            
        else
            if ((2 <= annos) && (4 >= annos) && (1000 <= ganancias)&&(3500 >= ganancias))
                System.out.println("por tus años se te otorga el 20%: "+ganancias/d20+" y por tu ganancia se te otorga un 15% a parte: "+ganancias/d15);
            
            else
                if ((2 <= annos) && (4 >= annos) && (1000 <= ganancias)&&(3500 < ganancias))
                    System.out.println("por tus años se te otorga el 20%: "+ganancias/d20+" y por tu ganancia se te otorga un 10% a parte: "+ganancias/d10);
                
                else
                    if ((annos >= 5) && (ganancias < 1000))
                        System.out.println("por tus años se te otorga el 30%: "+ganancias/d30+" y por tu ganancia se te otorga un 25% a parte: "+ganancias/d25);
                    
                    else
                        if ((annos >= 5) && (1000 <= ganancias)&&(3500 >= ganancias))
                            System.out.println("por tus años se te otorga el 30%: "+ganancias/d30+" y por tu ganancia se te otorga un 15% a parte: "+ganancias/d15);
                        
                        else
                            if ((annos >= 5) && (1000 <= ganancias)&&(3500 < ganancias))
                                System.out.println("por tus años se te otorga el 30%: "+ganancias/d30+" y por tu ganancia se te otorga un 10% a parte: "+ganancias/d10);
                            else
                                System.out.println("dato no reconocido");    
    }
}
