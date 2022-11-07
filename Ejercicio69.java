
/**
 * Exercise: 69
 *
 * @version: 23/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que pinte una pirámide maya. Por los lados, se trata de una pirámide normal y corriente. Por el centro se van pintando líneas de asteriscos de forma alterna (empezando por la superior): la primera se pinta, la segunda no, la tercera sí, la cuarta no, etc. La terraza de la pirámide siempre tiene 6 asteriscos, por tanto, las líneas centrales que se añaden a la pirámide normal tienen 4 asteriscos. El programa pedirá la altura. Se supone que el usuario introducirá un número entero mayor o igual a 3; no es necesario comprobar los datos de entrada.
 */

import java.util.Scanner;

public class Ejercicio69 {
    public static void main(String[] args) {
        // Var declarations
        int height;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduzca la altura de la pirámide maya: ");
        height = sc.nextInt();

        for (int i = 0; i < height; i++) {
            // Print spaces
            for (int j = height - i - 1; j > 0; j--)
                System.out.print(" ");
            // Print pyramid
            if (i % 2 == 0) {
                for (int j = 0; j < (i * 2) + 6; j++)
                    System.out.print("*");
            } else {
                for (int j = 0; j < (i * 2) + 6; j++)
                    if (j < i + 1 || j > i + 4)
                        System.out.print("*");
                    else
                        System.out.print(" ");
            }
            // New line
            System.out.println();
        }

        // Close scanner
        sc.close();
    }
}
