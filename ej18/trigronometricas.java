package Tarea.ej18;
import java.util.Scanner;

public class trigronometricas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double grados, radianes;
        double sen, cos, tan, cot, sec, csc;
        System.out.println("Ingresa el valor de tu ángulo en grados: ");
        grados = teclado.nextDouble();

        radianes = grados * (Math.PI/180);
        
        sen = Math.floor(Math.sin(radianes));
        cos = Math.floor(Math.cos(radianes));
        //tan = Math.floor(Math.tan(radianes));
        tan = Math.floor(sen/cos);
        cot = cos / sen;
        sec = 1 / cos;
        csc = 1 / sen;

        System.out.println("Modlo 90: = "+grados % 90);
        int cero = 0;
        System.out.println(cero == -0);

        System.out.println("sen:"+sen);
        System.out.println("cos:"+cos);
        System.out.println("tan: "+tan);
        System.out.println("cot: "+cot);
        System.out.println("sec: "+sec);
        System.out.println("csc: "+csc);
        
        if((Double.toString(sen) == "Infinity") || (Double.toString(sen) == "-Infinity") ){
            System.out.println("No esta definido en los Reales!");
        }
        else{
            System.out.println("sen()"+grados+") = "+sen);
        }
    }    
}
