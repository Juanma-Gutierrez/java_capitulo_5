
/**
 * Exercise: 67
 *
 * @version: 23/10/2022 10:52
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que pinte una escalera que va descendiendo de izquierda a derecha. El programa pedirá el número de escalones y la altura de cada escalón. La anchura de los escalones siempre es la misma: 4 asteriscos.
 */

import java.util.Scanner;

public class Ejercicio67 {
    public static void main(String[] args) {
        // Var declarations
        int step;
        int height;
        String ast;

        // Var init
        ast = "****";

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduzca el número de escalones: ");
        step = sc.nextInt();
        System.out.print("Introduzca la altura de cada escalón: ");
        height = sc.nextInt();

        // Process
        for (int i = 0; i < step; i++) {
            for (int j = 0; j < height; j++)
                System.out.println(ast);
            ast += "****";
        }

        sc.close();
    }
}
