
/**
 * Exercise: 28
 *
 * @version: 18/10/2022 18:05
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
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