package mates;

public class enteros {
		
    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }
	
}


------------------------------------------------------------------
/**
 * Programa Eclipse encapsulación y Librerías
 */
package Inicio;



import java.util.Scanner;
import mates.enteros;
/**
 * 
 */
public class Inicio {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el primer entero: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce el segundo entero: ");
        int num2 = scanner.nextInt();
        int suma = enteros.suma(num1, num2);
        int resta = enteros.resta(num1, num2);
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        scanner.close();
	}
}
