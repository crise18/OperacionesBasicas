import java.util.Scanner;
/**
 *Ejercicio 5
 *
 * Programa que decida si el año que ingresa el usuario es bisiesto o no.
 */

public class Ejercicio_5 {
	public static void main(String [] args) { 
		//Objeto scanner
		Scanner teclado = new Scanner(System.in);
		//Declarar variable
		int a = 0;

		System.out.println("Ingresa un año");
			a = teclado.nextInt();

		//Condiciones para que un año sea bisiesto
		if((a % 4 == 0) && (a % 100 != 0 || a % 400 == 0)) {
			System.out.println(a + " es bisiesto");
		} else {
			System.out.println(a + " no es bisiesto");
		}
		System.out.println("Fin del programa");
		teclado.close();
	}
}
