
/**
 * Exercise: 15
 *
 * @version: 17/10/2022 18:51
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base;
        int pow;
        int res;

        System.out.print("Introduce la base: ");
        base = sc.nextInt();
        System.out.print("Introduce la potencia (entero positivo): ");
        pow = sc.nextInt();

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
