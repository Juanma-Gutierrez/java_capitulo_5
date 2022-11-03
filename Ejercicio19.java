
/**
 * Exercise: 19
 *
 * @version: 17/10/2022 19:34
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe pedir por teclado. El carácter con el que se pinta la pirámide también se debe pedir por teclado.
 */

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        // Var declarations
        int height;
        String character;

        // Scanner class
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
                System.out.print(character);
            }
            System.out.println();
        }

        sc.close();
    }
}
