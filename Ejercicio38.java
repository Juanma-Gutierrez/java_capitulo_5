
/**
 * Exercise: 38
 *
 * @version: 19/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error.
 */

import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {
        // Var declarations
        int height;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Por favor, introduzca la altura del reloj de arena: ");
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
        sc.close();
    }
}
