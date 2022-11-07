
/**
 * Exercise: 31
 * 
 * @version: 19/10/2022 10:38
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la mitad (división entera entre 2) de la altura más uno.
 */

import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        // Var declarations
        int height;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduce la altura: ");
        height = sc.nextInt();

        // Process
        for (int i = 0; i < height - 1; i++)
            System.out.println("*");
        for (int i = 0; i < (height / 2) + 1; i++)
            System.out.print("*");

        // Close scanner
        sc.close();
    }
}
