package Tarea.ej18;
import java.util.Scanner;
public class raiz {
    public static void main(String[] args) {
        int x;
        Double resultado;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa el valor del radicando: ");
        x = teclado.nextInt();

        resultado = Math.sqrt(x);
        
        if(Double.toString(resultado).equals("NaN")){
            System.out.println("Tu determinante es menor que 0!");
        }
        else{
            System.out.println("La raíz es: " + resultado);
        }
    }
}
