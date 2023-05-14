package Tarea.ej18;
import java.util.Scanner;


public class resta {
    public static void main(String[] args) {
        int counter = 0;
        int numterminos = 0;
        double termino = 0;
        double valorinicial;
        double resta = 0; 
        //Objeto Scanner
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingresa cuantos términos restarás: ");
        numterminos = teclado.nextInt();
        System.out.println("Ingresa tu primer término: ");
        valorinicial = teclado.nextInt();


        while (counter != numterminos-1){
            System.out.println("Ingresa el siguiente término:");
            termino = teclado.nextInt();

            resta = valorinicial - termino;
            valorinicial = resta;
            counter ++;
        }    
        System.out.println("La resta es: " + resta);
    }
}