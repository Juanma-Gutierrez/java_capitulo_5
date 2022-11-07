
/**
 * Exercise: 39
 *
 * @version: 19/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que pida un número entero positivo por teclado y que muestre a continuación los números desde el 1 al número introducido junto con su factorial.
 */

import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[] args) {
        // Var declarations
        int num;
        int fact;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Por favor, introduzca un número entero positivo: ");
        num = sc.nextInt();

        // Process
        for (int i = 1; i <= num; i++) {
            fact = 1;
            for (int j = 1; j <= i; j++)
                fact *= j;
            System.out.println(i + "! = " + fact);
        }

        // Close scanner
        sc.close();
    }

}
