
/**
 * Exercise: 33
 * 
 * @version: 19/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta dos asteriscos menos en la base para simular la curvatura de las esquinas inferiores.
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

        // Close scanner
        sc.close();
    }
}
