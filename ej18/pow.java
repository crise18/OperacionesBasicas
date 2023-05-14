package Tarea.ej18;
import java.util.Scanner;

public class pow {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    double base;
    int exponente;
    double potencia;

    System.out.print("Ingresa tu base: ");
    base = teclado.nextDouble();

    System.out.print("Ingresa el valor del exponente: ");
    exponente = teclado.nextInt();

    potencia = Math.pow(base, exponente);
    System.out.println(base + " ^ " + exponente + " = " + potencia);

    }
}
