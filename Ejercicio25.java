
/**
 * Exercise: 25
 *
 * @version: 18/10/2022 17:37
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {

        // Var declarations
        int num;
        int res;

        // var init
        res = 0;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduce un númerom mayor que 0: ");
        num = sc.nextInt();

        // Process
        if (num > 0) {
            System.out.print("El número: " + num);
            while (num > 0) {
                res *= 10;
                res += num % 10;
                num /= 10;
            }

            System.out.print(" al revés se escribe: " + res);
        } else
            System.out.print("Número introducido no válido.");

        sc.close();
    }
}
