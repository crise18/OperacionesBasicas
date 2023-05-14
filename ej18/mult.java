package Tarea.ej18;
import java.util.Scanner;


public class mult {
    public static void main(String[] args) {
        int counter = 0;
        int numterminos = 0;
        double termino = 0;
        double mult = 1; 
        //Objeto Scanner
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingresa cuantos términos multiplicarás: ");
        numterminos = teclado.nextInt();
        
        while (counter != numterminos){
            System.out.println("Ingresa el término:");
            termino = teclado.nextInt();
            mult = termino * mult;
            counter ++;
        }    
        System.out.println("La multiplicación es: " + mult);
    }
}