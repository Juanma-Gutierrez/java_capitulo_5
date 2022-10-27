
/**
 * Exercise: 28
 *
 * @version: 18/10/2022 18:05
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

<<<<<<< HEAD
/*
 * Escribe un programa que calcule el factorial de un número entero leído por teclado.
 */

=======
>>>>>>> 4d954ae2b1fdf656202543356f96dbd830b1bbcc
import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {

        // Var declarations
        int num;
        int res;

        // Var init
        res = 1;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Por favor, introduzca un número entero: ");
        num = sc.nextInt();

        // Process
        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                res *= i;
            }
        }

        // Output results
        System.out.print(num + "! = " + res);

        sc.close();
    }
}
