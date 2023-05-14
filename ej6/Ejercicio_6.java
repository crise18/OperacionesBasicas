import java.util.Scanner;

/**
 *Ejercicio 6
 *
 * Programa para resolver un sistema de ecuaciones lineales 2x2 utilizando la regla de Cramer.
 */

public class Ejercicio_6 {
		public static void main(String [] args) { 
//Objeto scanner
Scanner teclado = new Scanner(System.in);

//Declarar variables
Double a = 0.0; 
Double b = 0.0; 
Double c = 0.0; 
Double d = 0.0; 
Double e = 0.0; 
Double f = 0.0;

System.out.println("Este programa te permite resolver un sistema de ecuaciones lineales 2x2 utilizando la regla de Cramer");
System.out.println("La primer ecuacion es del tipo ax + by = c");
System.out.println("La segunda ecuacion es del tipo dx + ey = f");

//Tomar los valores para a, b, c, d, e y f
System.out.println("Ingresa el valor de a");
	a = teclado.nextDouble();
System.out.println("Ingresa el valor de b");
	b = teclado.nextDouble();
System.out.println("Ingresa el valor de c");
	c = teclado.nextDouble();
System.out.println("Ingresa el valor de d");
	d = teclado.nextDouble();
System.out.println("Ingresa el valor de e");
	e = teclado.nextDouble();
System.out.println("Ingresa el valor de f");
	f = teclado.nextDouble();

//Definir el valor que tomarán x y y segun la regla de Cramer
Double x = ((c * e) - (b * f)) / ((a * e) - (b * d));
Double y = ((a * f) - (c * d)) / ((a * e) - (b * d));

//Solo tenemos los casos donde el determinante es distinto de cero o igual a cero
if((a * e) - (b * d) == 0) {
	System.out.println("El sistema de ecuaciones tiene infinitas soluciones o no tiene solucion");
} else {
	System.out.println("El sistema de ecuaciones tiene las siguientes soluciones:");
	System.out.println("x es igual a " + x);
	System.out.println("y es igual a " + y);
}
System.out.println("Fin del programa");
	}
}