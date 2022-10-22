
/**
 * Exercise: 53
 *
 * @version: 22/10/2022 11:31
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

import java.util.Scanner;

public class Ejercicio53 {
    public static void main(String[] args) {
        // Var declarations
        int height;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduzca la altura de la figura: ");
        height = sc.nextInt();

        // Process
        for (int i = height; i > 0; i--) {
            for (int j = 0; j < i; j++)
                System.out.print("*");
            System.out.println();
        }

        sc.close();
    }
}
