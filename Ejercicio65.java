
/**
 * Exercise: 65
 *
 * @version: 23/10/2022 10:06
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

<<<<<<< HEAD
/*
 * Escribe un programa que pinte por pantalla la letra A. El usuario debe introducir la altura total y la fila en la que debe aparecer el palito horizontal (contando desde el vértice). La altura mínima es de 3 pisos. La fila donde va el palito horizontal debe ser mayor que 1 y menor que la altura total. Si el usuario introduce algún dato incorrecto, el programa debe mostrar un mensaje de error.
 */

=======
>>>>>>> 4d954ae2b1fdf656202543356f96dbd830b1bbcc
import java.util.Scanner;

public class Ejercicio65 {
    public static void main(String[] args) {
        // Var declarations
        int height;
        int horiz;
        boolean right;

        // Var init;
        right = true;
        horiz = 0;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduzca la altura de la A (un número mayor o igual a 3): ");
        height = sc.nextInt();
        if (height < 3) {
            System.out.print("La altura no es correcta.");
            right = false;
        }

        if (right) {
            System.out.print("Introduzca la fila del palito horizontal (entre 2 y " + (height - 1) + "): ");
            horiz = sc.nextInt();
        }
        if (horiz < 2 || horiz > height - 1) {
            System.out.print("La altura del palo horizontal no es correcta.");
            right = false;
        }

        // Process
        if (right) {
            for (int i = 0; i < height; i++) {
                // Print spaces
                for (int j = height - i - 1; j > 0; j--) {
                    System.out.print(" ");
                }
                // Print asterisk
                for (int j = 0; j < i * 2 + 1; j++) {
<<<<<<< HEAD
                    if (j == 0 || j == i * 2 || i == horiz - 1)
=======
                    if (j == 0 || j == i * 2  || i == horiz-1)
>>>>>>> 4d954ae2b1fdf656202543356f96dbd830b1bbcc
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
