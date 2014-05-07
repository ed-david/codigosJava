package calcularcifras;

import java.util.Scanner;

public class CalcularCifras {
/*Divide un número sucesivamente hasta conseguir el número de cifras que tiene
Por ejemplo si se introduce el número 3454 el programa devolverá un 4. */
    static int calcularCifras(int x){
        int total=0;
        while(x!=0){
            x=x/10; // división entera
            total+=1; // incrementar contador
        }
        return total;
    }

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in); //Scanner para leer de consola
        int a;
        System.out.print("Introduzca un valor entero: ");
        a = sc.nextInt(); // Se lee el valor
        System.out.print("El número de cifras es: ");
        System.out.println(calcularCifras(a));
    }
}



