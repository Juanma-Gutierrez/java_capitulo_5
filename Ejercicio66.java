
/**
 * Exercise: 66
 *
 * @version: 23/10/2022 10:44
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

import java.util.Scanner;

public class Ejercicio66 {
    public static void main(String[] args) {
        // Var declarations
        int height;
        String row;

        // Var init
        row = "*    *";

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Por favor, introduzca la altura de la figura: ");
        height = sc.nextInt();

        if (height < 3 || height % 2 == 0)
            System.out.print("La altura no es correcta, debe ser un número impar mayor o igual que 3.");
        else {
            // Process right
            for (int i = 0; i <= height / 2; i++) {
                for (int j = 0; j < i; j++)
                    System.out.print(" ");
                System.out.println(row);
            }
            // Process left
            for (int i = height / 2 - 1; i >= 0; i--) {
                for (int j = 0; j < i; j++)
                    System.out.print(" ");
                System.out.println(row);
            }
        }
        sc.close();
    }
}
