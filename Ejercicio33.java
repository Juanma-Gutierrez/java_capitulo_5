
/**
 * Exercise: 33
 * 
 * @version: 19/10/2022 12:13
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        // Var declarations
        int height;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduzca la altura de la U: ");
        height = sc.nextInt();

        // Output data
        for (int i = 0; i < height - 1; i++) {
            System.out.print("*");
            for (int j = 0; j < height - 2; j++)
                System.out.print(" ");
            System.out.println("*");
        }
        System.out.print(" ");
        for (int j = 0; j < height - 2; j++)
            System.out.print("*");
        System.out.println(" ");

        sc.close();
    }
}
