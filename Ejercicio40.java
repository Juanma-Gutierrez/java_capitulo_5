
/**
 * Exercise: 40
 *
 * @version: 19/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que pinte por pantalla un rombo hueco hecho con asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error.
 */

import java.util.Scanner;

public class Ejercicio40 {
    public static void main(String[] args) {
        // Var declarations
        int height;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Por favor, introduzca la altura del rombo: ");
        height = sc.nextInt();

        // Process
        if (height % 2 == 0 || height < 3)
            System.out.print("La altura introducida no es válida");
        else {
            // TOP
            for (int i = 0; i < height / 2; i++) {
                for (int j = ((height - 2) / 2) - i; j >= 0; j--) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i * 2 + 1; j++) {
                    if (j != 0 && j != i * 2)
                        System.out.print(" ");
                    else
                        System.out.print("*");
                }
                System.out.println();
            }
            // Bottom
            for (int i = height / 2 - 1; i >= 0; i--) {
                for (int j = ((height - 2) / 2) - i; j >= 0; j--) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i * 2 + 1; j++) {
                    if (j != 0 && j != i * 2)
                        System.out.print(" ");
                    else
                        System.out.print("*");
                }
                System.out.println();
            }
        }

        // Close scanner
        sc.close();
    }
}
