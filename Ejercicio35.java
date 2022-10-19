
/**
 * Exercise: 35
 *
 * @version: 19/10/2022 17:41
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        // Var declarations
        int height;
        boolean right;

        // Var init
        right = true;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Por favor, introduzca la altura de la X (impar mayor que 3): ");
        height = sc.nextInt();
        if (height % 2 == 0 || height < 3) {
            System.out.print("Ha introducido una altura no válida");
            right = false;
        }

        // Process
        if (right) {
            // Top
            for (int i = 0; i < height / 2; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int j = 0; j < height - (2 * (i + 1)); j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }

            // Center
            for (int j = 0; j < height / 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");

            // Bottom
            for (int i = height / 2 - 1; i >= 0; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int j = 0; j < height - (2 * (i + 1)); j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
        sc.close();
    }
}
