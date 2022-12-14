
/**
 * Exercise: 20
 *
 * @version: 18/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
 */

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        // Var declarations
        int height;
        String character;

        // Scanner close
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduce la altura de la pirámide: ");
        height = sc.nextInt();
        System.out.print("Introduce el caracter a utilizar: ");
        character = sc.next();

        // Process
        for (int i = 1; i <= height; i++) {
            for (int j = height - i - 1; j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                if (j > 1 && j < i * 2 - 1 && i < height)
                    System.out.print(" ");
                else
                    System.out.print(character);
            }
            System.out.println();
        }

        // Scanner close
        sc.close();
    }
}
