package Tarea.ej18;
import java.util.Scanner;

//import javax.lang.model.util.ElementScanner6;
/**
 * 12 marzo 2022
 * @author crise
 */
public class Ejercicio18 {
    public static void main(String[] args) {
        //Objeto scanner
        Scanner teclado = new Scanner(System.in);
        
        //Variables a usar
        double numerador, denominador, termino, division, valorinicial, x, resultado, base, potencia, grados, radianes;
        double sen, cos, tan, cot, sec, csc;
        double suma = 0;
        double resta = 0;
        double mult = 1;
        int numterminos = 0;
        int exponente;
        int counter = 0;
        String selection, identidad;
       
       //Programa
        System.out.println("PROGRAM. Calculadora.");
        System.out.println("Este programa te permitira realizar operaciones de:");
        
        System.out.println(
            "    CODIGO              OPERACION "
        );
        System.out.println(
            "     suma                   + "
        );
        System.out.println(
            "    resta                   - "
        );
        System.out.println(
            "multiplicacion            * "
        );
        System.out.println(
            "   division                 / "
        );
        System.out.println(
            "     raiz              Raiz cuadrada "
        );
        System.out.println(
            "   potencia           Elevar potencia "
        );
        System.out.println(
            "  identidad    Identidades Trigonométricas \n"
        );
       
       //Seleccion de Operacion
        System.out.print("Ingresa tu selección (código):");
        selection = teclado.nextLine();
        System.out.print("\n");


        //Casos

        //SUMA
        if((selection).equalsIgnoreCase("suma")){
            System.out.println("Ingresa cuantos términos sumarás: ");
            numterminos = teclado.nextInt();
        
            while (counter != numterminos){
                System.out.println("Ingresa el término:");
                termino = teclado.nextInt();
                suma += termino;
                counter ++;
            }    
        System.out.println("La suma es: " + suma);
        }
        
        //RESTA
        else if((selection).equalsIgnoreCase("resta")){
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
        
        //MULTIPLICACION
        else if((selection).equalsIgnoreCase("multiplicacion")){
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
        
        //DIVISION
        else if((selection).equalsIgnoreCase("division")){
            do{
                System.out.print("Ingresa el numerador: ");
                numerador = teclado.nextDouble();
                System.out.print("Ingresa el denominador: ");
                denominador = teclado.nextDouble();
    
                division = numerador / denominador;
                if(denominador == 0){
                    System.out.println("\nIngresa un denominador distino de 0!\n");
                }
                else{
                    System.out.println("La división es: "+ division);
                }   
            }while(denominador == 0);
        }
        
        //RAIZ
        else if((selection).equalsIgnoreCase("raiz")){
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

        //POTENCIA
        else if((selection).equalsIgnoreCase("potencia")){
            System.out.print("Ingresa tu base: ");
            base = teclado.nextDouble();

            System.out.print("Ingresa el valor del exponente: ");
            exponente = teclado.nextInt();

            potencia = Math.pow(base, exponente);
            System.out.println(base + " ^ " + exponente + " = " + potencia);

        }

        //IDENTIDADES TRIGONOMETRICAS
        else if((selection).equalsIgnoreCase("identidad")){
            
            System.out.println("De las siguientes opciones.\nIngresa la identidad a calcular:\n seno\n coseno\n tangente\n cotangente \n secante\n cosecante ");

            identidad = teclado.nextLine();
            System.out.println("Ingrese el ángulo a calcular: ");
            grados = teclado.nextDouble();
            
            radianes = grados * (Math.PI/180);
            sen = Math.sin(radianes);
            cos = Math.cos(radianes);
            //tan = Math.floor(Math.tan(radianes));
            tan = Math.floor(sen)/Math.floor(cos);
            cot = Math.floor(cos) / Math.floor(sen);
            sec = 1 / Math.floor(cos);
            csc = 1 / Math.floor(sen);

            switch(identidad){
                case "seno":
                    System.out.println("sen("+grados+"°) = "+sen);    
                break;

                case "coseno":
                    System.out.println("cos("+grados+"°) = "+cos); 
                break;
                
                case "tangente":
                        System.out.println("tan("+grados+"°) = "+tan); 
                break;
                
                case "cotangente":
                    System.out.println("cot("+grados+"°) = "+cot); 
                break;

                case "secante":
                    System.out.println("sec("+grados+"°) = "+sec); 
                break;

                case "cosecante":
                    System.out.println("csc("+grados+"°) = "+csc);
                break;

                default:
                    System.out.println("Ingresa una identidad trigonométrica válida!");
            }
        }
        else{
            System.out.println("Ingresa una identidad válida!");
        }
        teclado.close();
    }
}
