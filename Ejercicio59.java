
/**
 * Exercise: 59
 *
 * @version: 22/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que pinte por pantalla un árbol de navidad. El usuario debe introducir la altura. En esa altura va incluida la estrella y el tronco. Suponemos que el usuario introduce una altura mayor o igual a 4.
 */

import java.util.Scanner;

public class Ejercicio59 {
    public static void main(String[] args) {
        // Var declarations
        int height;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Por favor, introduzca la altura del árbol (mayor que 3): ");
        height = sc.nextInt();

        // Process
        if (height <= 3)
            System.out.print("Ha introducido una altura no válida");
        else {
            // Star
            for (int i = 0; i < height - 3; i++) {
                System.out.print(" ");
            }
            System.out.println("*");
            // Tree
            for (int i = 0; i < height - 2; i++) {
                for (int j = 0; j < height - i - 3; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < (i + 1) * 2 - 1; j++) {
                    if (i == 0 || i == height - 3 || j == 0 || j == (i + 1) * 2 - 2)
                        System.out.print("^");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }

            // Trunk
            for (int i = 0; i < height - 3; i++) {
                System.out.print(" ");
            }
            System.out.println("Y");
        }

        // Close scanner
        sc.close();
    }
}
