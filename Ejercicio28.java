
/**
 * Exercise: 28
 *
 * @version: 18/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que calcule el factorial de un número entero leído por teclado.
 */

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        // Var declarations
        int num;
        int res;

        // Var init
        res = 1;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Por favor, introduzca un número entero: ");
        num = sc.nextInt();

        // Process
        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                res *= i;
            }
        }

        // Output results
        System.out.print(num + "! = " + res);

        sc.close();
    }
}
