
/**
 * Exercise: 46
 *
 * @version: 21/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que pinte por pantalla un rectángulo hueco hecho con asteriscos. Se debe pedir al usuario la anchura y la altura. Hay que comprobar que tanto la anchura como la altura sean mayores o iguales que 2, en caso contrario se debe mostrar un mensaje de error.
 */

import java.util.Scanner;

public class Ejercicio46 {
    public static void main(String[] args) {
        // Var declarations
        int height;
        int width;
        boolean right;

        // Var init
        height = 0;
        width = 0;
        right = true;

        // Scanner Class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Por favor, introduzca la anchura del rectángulo (como mínimo 2):");
        width = sc.nextInt();

        if (width < 2)
            right = false;
        if (right) {
            System.out.print("Ahora introduzca la altura (como mínimo 2): ");
            height = sc.nextInt();
        }
        if (height < 2)
            right = false;

        if (!right)
            System.out.print(
                    "Lo siento, los datos introducidos no son correctos, el valor mínimo para la anchura y la altura es 2");
        else {
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++)
                    if ((i > 0 && i < height - 1) && (j > 0 && j < width - 1))
                        System.out.print(" ");
                    else
                        System.out.print("*");
                System.out.println();
            }
        }

        sc.close();
    }
}
