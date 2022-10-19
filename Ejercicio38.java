
/**
 * Exercise: 38
 *
 * @version: 19/10/2022 18:39
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {
        // Vars definition
        int height;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Por favor, introduzca un número entero positivo: ");
        height = sc.nextInt();

        if (height % 2 == 0 || height < 3) {
            System.out.print("Ha introducido una altura no válida.");
        } else {
            // Top
            for (int i = 0; i < height / 2; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for (int j = height - (2 * i); j > 0; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
            // Bottom
            for (int i = height / 2; i >= 0; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for (int j = height - (2 * i); j > 0; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
