
/**
 * Exercise: 16
 *
 * @version: 17/10/2022 19:07
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int i;
        boolean prime;

        prime = true;

        System.out.print("Introduce un número entero mayor que 2: ");
        num = sc.nextInt();

        if (num < 2)
            System.out.print("No es un número válido");
        else {
            i = 2;
            while (prime && i < num / 2) {
                if (num % i == 0)
                    prime = false;
                i++;
            }

            System.out.print(prime ? num + " es un número primo" : num + " no es un número primo");
        }
    }
}
