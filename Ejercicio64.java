
/**
 * Exercise: 64
 *
 * @version: 23/10/2022 09:51
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

import java.util.Scanner;

public class Ejercicio64 {
    public static void main(String[] args) {
        // Var declarations
        int height;
        int width;
        int opt;
        int temp;

        // Var init
        height = 3;
        width = 6;
        opt = 0;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Process
        do {
            // Clean console
            System.out.print("\033[H\033[2J");

            // Print rectangle
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    if (i == 0 || i == height - 1 || j == 0 || j == width - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
            System.out.println("1. Agrandarlo");
            System.out.println("2. Achicarlo");
            System.out.println("3. Cambiar la orientación");
            System.out.println("4. Salir");
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    height++;
                    width++;
                    break;
                case 2:
                    height--;
                    width--;
                    break;
                case 3:
                    temp = height;
                    height = width;
                    width = temp;
                    break;
            }
        } while (opt != 4);
        sc.close();
    }
}
