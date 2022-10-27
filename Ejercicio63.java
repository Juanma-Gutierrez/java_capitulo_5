
/**
 * Exercise: 63
 *
 * @version: 22/10/2022 13:22
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que pinte dos pirámides rellenas hechas con asteriscos, una al lado de la otra y separadas por un espacio en su base.
 */

import java.util.Scanner;

public class Ejercicio63 {
    public static void main(String[] args) {
        // Var init
        int height1;
        int height2;
        int maxHeight;
        int count1;
        int count2;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduzca la altura de la primera pirámide: ");
        height1 = sc.nextInt();
        System.out.print("Introduzca la altura de la segunda pirámide: ");
        height2 = sc.nextInt();

        // Var init
        if (height1 > height2)
            maxHeight = height1;
        else
            maxHeight = height2;
        count1 = maxHeight - height1 - 1;
        count2 = 1;

        // Process
        for (int i = 1; i <= maxHeight; i++) {
            if (height1 == maxHeight) {
                // First pryramid higher
                // Pryramid1
                for (int j = 0; j < maxHeight - i; j++)
                    System.out.print(" ");
                for (int j = 0; j < (maxHeight - height1 - count1) * 2 - 1; j++)
                    System.out.print("*");
                for (int j = 0; j < maxHeight - i; j++)
                    System.out.print(" ");
                count1--;

                // Spaces pyramid2
                if (i > maxHeight - height2) {

                    System.out.print("  ");

                    // Pryramid2
                    for (int j = 0; j < maxHeight - i; j++)
                        System.out.print(" ");
                    for (int j = 0; j < count2 * 2 - 1; j++)
                        System.out.print("*");

                    count2++;
                }
            } else {
                // Second pryramid higher
                if (i <= maxHeight - height1) {
                    // Spaces pyramid1
                    for (int j = 0; j < height1 * 2 - 1; j++) {
                        System.out.print(" ");
                    }

                    System.out.print("  ");

                    // Pryramid2
                    for (int j = 0; j < height2 - i; j++)
                        System.out.print(" ");
                    for (int j = 0; j < (i * 2) - 1; j++)
                        System.out.print("*");
                    for (int j = 0; j < height2 - i; j++)
                        System.out.print(" ");
                } else {

                    // Pryramid1
                    for (int j = 0; j < maxHeight - i; j++)
                        System.out.print(" ");
                    for (int j = 0; j < (maxHeight - height1 - count1) * 2 - 1; j++)
                        System.out.print("*");
                    for (int j = 0; j < maxHeight - i; j++)
                        System.out.print(" ");
                    count1--;

                    System.out.print("  ");

                    // Pryramid2
                    for (int j = 0; j < height2 - i; j++)
                        System.out.print(" ");
                    for (int j = 0; j < (i * 2) - 1; j++)
                        System.out.print("*");
                    for (int j = 0; j < height2 - i; j++)
                        System.out.print(" ");

                }
            }

            System.out.println();
        }

        sc.close();
    }
}
