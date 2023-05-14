package Tarea.ej7;
import java.util.Random;
import java.util.Scanner;
/**
 * 3 marzo 2022
 * @author crise
 * @author mariana.g
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        //Objeto Scanner
        Scanner teclado = new Scanner(System.in);
        
        //Variables
        int num, usuario;
        int counter = 1;
        Random random = new Random();
        

        //Programa
        System.out.println("PROGRAM.Guess\n");
        
        System.out.println("Este programa consiste en adivinar un numero elegido aleatoriamente por la maquina!");
        System.out.println("El numero se encontrará entre el 1 y el 10 (numeros naturales)!\n");

        System.out.println("Tendra 3 oportunidades\n");
        num = random.nextInt(10) + 1; // Intervalo [1,10] se le suma 1, pues random comienza desde [0-9]
        

        while(counter <= 3){
            System.out.println("Oportunidad Num."+counter);
            System.out.print("Ingrese el número que piense se eligió: ");
            usuario = teclado.nextInt();

            if(usuario == num){
                System.out.println("Elegiste el número: " + usuario + ".");
                System.out.println("Adivinaste el número!");
                break; //Si adivinamos antre de 3 intentos que pare el while
            }
            else{
                System.out.println("No adivinaste el número! \nIntentalo de nuevo!\n");
            }
        counter ++;
        }
        System.out.println("El numero que eligio la máquina era: " + num + "!");
    }
}
