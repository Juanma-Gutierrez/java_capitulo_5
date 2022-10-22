
/**
 * Exercise: 61
 *
 * @version: 22/10/2022 12:35
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

import java.util.Scanner;

public class Ejercicio61 {
    public static void main(String[] args) {
        // Var declarations
        String ast;
        int height;

        // Var init
        ast = "***";

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduzca la altura de la V (un número mayor o igual a 3):");
        height = sc.nextInt();

        // Process
        if (height < 3)
            System.out.print("La altura debe ser mayor o igual a 3");
        else {
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < i; j++)
                    System.out.print(" ");
                System.out.print(ast);
                for (int j = 0; j < height * 2 - (i * 2) - 2; j++)
                    System.out.print(" ");
                System.out.println(ast);
            }
        }

        sc.close();
    }
}
