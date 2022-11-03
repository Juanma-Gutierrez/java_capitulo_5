
/**
 * Exercise: 23
 *
 * @version: 18/10/2022 17:00
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que permita ir introduciendo una serie indeterminada de números mientras su suma no supere el valor 10000. Cuando esto último ocurra, se debe mostrar el total acumulado, el contador de los números introducidos y la media.
 */

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        // Var declarations
        int sum;
        int cont;
        int num;

        // Var init
        cont = 0;
        sum = 0;
        num = 0;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Process
        while (num + sum <= 10000) {
            System.out.print("Introduce un número: ");
            num = sc.nextInt();
            cont++;
            sum += num;
        }

        // Output results
        System.out.println("Total acumulado: " + sum);
        System.out.println("Contador de números introducidos: " + cont);
        System.out.printf("Media de números introducidos: %.2f", ((float) sum / cont));
        sc.close();
    }
}
