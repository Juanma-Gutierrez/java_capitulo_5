
/**
 * Exercise: 39
 *
 * @version: 19/10/2022 18:50
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[] args) {
        // Vars definition
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

        sc.close();
    }

}