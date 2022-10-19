
/**
 * Exercise: 31
 * 
 * @version: 19/10/2022 10:38
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        // Var declaration
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

        sc.close();
    }
}
