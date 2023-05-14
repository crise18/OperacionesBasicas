package Tarea.ej10;
import java.util.Scanner;
//import javax.lang.model.util.ElementScanner6;
/**
 * 3 marzo 2022
 * @author crise
 */

public class Ejercicio10 {
    public static void main(String[] args) {
        //Variables
        double pesos, conversion;
        double dolar = 18.50;
        double euro = 19.67;
        double franco = 19.88;
        double libra = 22.16;
        double yen = 0.14;
        String selection;
        

        //Objeto Scanner
        Scanner teclado = new Scanner(System.in);

        //Programa
        System.out.println("PROGRAM.Divisas\n");
        
        System.out.println("Este programa te permitirá convertir una cantidad R de pesos a distintos tipos de monedas extranjeras.\n");
        System.out.println("Las monedas disponibles son: \n");
            System.out.println(
            "Codigo          Moneda"
            );
            System.out.println(
            "  d       Dólar Estadounidense"
            );
            System.out.println(
            "  e       Euro"
            );
            System.out.println(
            "  f       Franco Suizo"
            );
            System.out.println(
            "  l       Libra Esterlina"
            );
            System.out.println(
            "  y       Yen Japónes \n"
            );
        
        System.out.print("Ingresa la cantidad en pesos a convertir: ");
        pesos = teclado.nextDouble();
        System.out.println("Ingresa el Codigo del tipo de moneda al que se realizará la conversión de los pesos: ");
        selection = teclado.next();


        if(selection.equalsIgnoreCase("d")){
        conversion = pesos/dolar;
        System.out.println(pesos + " pesos mexicanos equivalen a " + conversion + " dolares estadounidenses." );
        }

        else if(selection.equalsIgnoreCase("e")){
        conversion = pesos/euro;
        System.out.println(pesos + " pesos mexicanos equivalen a " + conversion + " euros." );
        }
        
        else if(selection.equalsIgnoreCase("f")){
        conversion = pesos/franco;
        System.out.println(pesos + " pesos mexicanos equivalen a " + conversion + " francos suizos." );
        }

        else if(selection.equalsIgnoreCase("l")){
        conversion = pesos/libra;
        System.out.println(pesos + " pesos mexicanos equivalen a " + conversion + " libras esterlinas." );
        }

        else if(selection.equalsIgnoreCase("y")){
        conversion = pesos/yen;
        System.out.println(pesos + " pesos mexicanos equivalen a " + conversion + " yenes japoneses." );
        }
        else{
            System.out.println("Ingresa un valor de codigo valido para la conversion de la moneda!!");
        }
    }
}

