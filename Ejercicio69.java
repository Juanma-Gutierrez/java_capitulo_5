
/**
 * Exercise: 69
 *
 * @version: 23/10/2022 11:10
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

import java.util.Scanner;

public class Ejercicio69 {
    public static void main(String[] args) {
        // Var declarations
        int height;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduzca la altura de la pirámide maya: ");
        height = sc.nextInt();

        for (int i = 0; i < height; i++) {
            // Print spaces
            for (int j = height - i - 1; j > 0; j--)
                System.out.print(" ");
            // Print pyramid
            if (i % 2 == 0) {
                for (int j = 0; j < (i * 2) + 6; j++)
                    System.out.print("*");
            } else {
                for (int j = 0; j < (i * 2) + 6; j++)
                    if (j < i + 1 || j > i + 4)
                        System.out.print("*");
                    else
                        System.out.print(" ");

            }

            // New line
            System.out.println();
        }
        sc.close();
    }
}
