
/**
 * Exercise: 27
 *
 * @version: 18/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay entre 1 y un número leído por teclado.
 */

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        // Var declarations
        int sum;
        int count;
        int num;

        // Var init
        sum = 0;
        count = 0;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduce un número: ");
        num = sc.nextInt();

        // Process
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0) {
                count++;
                sum += i;
                System.out.print(i + ", ");
            }
        }

        // Output results
        System.out.println("\nTotal múltiplos de 3: " + count);
        System.out.println("Suma de múltiplos de 3: " + sum);

        // Close scanner
        sc.close();
    }
}
