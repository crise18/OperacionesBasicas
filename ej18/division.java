package Tarea.ej18;
import java.util.Scanner;


public class division {
    double cociente;
    /**
        public static void main(String[] args) {
        double numerador = 0;
        double denominador = 0;
        double division = 1; 
        //Objeto Scanner
        Scanner teclado = new Scanner(System.in);
        
        do{
            System.out.print("Ingresa el numerador: ");
            numerador = teclado.nextInt();
            System.out.print("Ingresa el denominador: ");
            denominador = teclado.nextInt();

            division = numerador / denominador;
            if(denominador == 0){
                System.out.println("Ingresa un denominador distino de 0!");
            }
            else{
                System.out.println("La división es: "+ division);
            }   
        }while(denominador == 0);
        
    }
    */
    public division(double numerador, double denominador){
        super (); 
        
        //do{
        cociente = numerador / denominador;
            if(denominador == 0){
                System.out.println("Ingresa un denominador distino de 0!");
            }
            //else{
                //System.out.println("La división es: "+ cociente);
            //} 
       //}while(denominador == 0);  
    }
    public String toString(){
        String salida;
        salida = "La división es: " + cociente; 
        return salida;
    }
}