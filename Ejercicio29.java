
/**
 * Exercise: 29
 *
 * @version: 18/10/2022 18:11
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

<<<<<<< HEAD
/*
 * Escribe un programa que muestre por pantalla todos los números enteros positivos menores a uno leído por teclado que no sean divisibles entre otro también leído de igual forma.
 */

=======
>>>>>>> 4d954ae2b1fdf656202543356f96dbd830b1bbcc
import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {

        // Var declarations
        int num1;
        int num2;

        // Var init

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduzca un número entero positivo (relativamente grande): ");
        num1 = sc.nextInt();
        System.out.print("Introduzca otro número (relativamente pequeño): ");
        num2 = sc.nextInt();

        // Process
        for (int i = 1; i < num1; i++) {
            if (i % num2 != 0) {
                System.out.print(i + ", ");
            }
        }

        // Output results
        sc.close();
    }
}
