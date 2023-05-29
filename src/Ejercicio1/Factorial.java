package Ejercicio1;

import java.util.Scanner;

public class Factorial {

    //método Java para calcular el factorial de un número n
    //el método recibe el número n al que queremos calcular su factorial                                          
    //el método calcula y devuelve el factorial de n
    public static double factorial(int n) {
    	int n1;
    	System.out.print("Introduce un numero entero >= 0: ");
        Scanner sc = null;
		n1 = sc.nextInt();
        double fact = 1;
        for (int i = 1; i <= n1; i++) {
            fact = fact * i;
        }
        return fact;
    }

}