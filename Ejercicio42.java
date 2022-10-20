
/**
 * Exercise: 42
 * 
 * @version: 20/10/2022 08:34
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

import java.util.Scanner;

public class Ejercicio42 {
    public static void main(String[] args) {
        // Var declarations
        int num;
        boolean prime;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Por favor, introduzca un número entero positivo: ");
        num = sc.nextInt();

        // Process
        for (int i = num; i < num + 5; i++) {
            prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    prime = false;
            }
            System.out.println(i + (prime ? " es primo" : " no es primo"));
        }

        sc.close();
    }
}
