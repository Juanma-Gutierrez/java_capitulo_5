
/**
 * Exercise: 48
 *
 * @version: 21/10/2022 18:02
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

import java.util.Scanner;

public class Ejercicio48 {
    public static void main(String[] args) {
        // Var declarations
        long num;
        long aux;
        boolean find;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduzca un número entero: ");
        num = sc.nextLong();

        // Process
        // Find numbers
        System.out.print("Dígitos que aparecen: ");
        for (int i = 0; i < 10; i++) {
            find = false;
            aux = num;
            while (aux > 0) {
                if (aux % 10 == i)
                    find = true;
                aux /= 10;
            }
            if (find)
                System.out.print(i + " ");
        }

        // Find numbers doesn't appears
        System.out.print("\nDígitos que noaparecen: ");
        for (int i = 0; i < 10; i++) {
            find = false;
            aux = num;
            while (aux > 0) {
                if (aux % 10 == i)
                    find = true;
                aux /= 10;
            }
            if (!find)
                System.out.print(i + " ");
        }

        sc.close();
    }
}
