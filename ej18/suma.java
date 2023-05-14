package Tarea.ej18;
import java.util.Scanner;


public class suma {
    Scanner teclado = new Scanner(System.in);
    double suma;

    public static void main(String[] args) {
        int counter = 0;
        int numterminos = 0;
        double termino = 0;
        double suma = 0; 
        //Objeto Scanner
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingresa cuantos términos sumarás: ");
        numterminos = teclado.nextInt();
        
        while (counter != numterminos){
            System.out.println("Ingresa el término:");
            termino = teclado.nextInt();
            suma += termino;
            counter ++;
        }    
        System.out.println("La suma es: " + suma);
    
    teclado.close();
    }
}