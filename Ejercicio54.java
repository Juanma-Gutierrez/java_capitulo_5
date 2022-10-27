
/**
 * Exercise: 54
 *
 * @version: 22/10/2022 11:38
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que pinte un triángulo hueco tal como se muestra en los ejemplos. El usuario debe introducir la altura de la figura.
 */

import java.util.Scanner;

public class Ejercicio54 {
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
                if (i == height || i == 1 || j == i - 1 || j == 0)
                    System.out.print("*");
                else
                    System.out.print(" ");
            System.out.println();
        }

        sc.close();
    }
}