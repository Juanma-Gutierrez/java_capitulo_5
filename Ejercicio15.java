
/**
 * Exercise: 15
 *
 * @version: 17/10/2022 18:51
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que dados dos números, uno real (base) y un entero positivo (exponente), saque por pantalla todas las potencias con base el numero dado y exponentes entre uno y el exponente introducido. No se deben utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5, se deberán mostrar 2^1, 2^2, 2^3, 2^4 y 2^5.
 */
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        // Var declarations
        int base;
        int pow;
        int res;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduce la base: ");
        base = sc.nextInt();
        System.out.print("Introduce la potencia (entero positivo): ");
        pow = sc.nextInt();

        // Process
        if (pow <= 0)
            System.out.print("Has introducido una potencia no válida");
        else {
            for (int i = 1; i <= pow; i++) {
                res = 1;
                for (int j = 0; j < i; j++) {
                    res *= base;
                }
                System.out.println(base + " a la " + i + " potencia es " + res);
            }
        }

        sc.close();
    }

}
