
/**
 * Exercise: 14
 *
 * @version: 17/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que pida una base y un exponente (entero positivo) y que calcule la potencia.
 */

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        // Var declarations
        int base;
        int pow;
        int res;

        // Var init
        res = 1;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduce la base: ");
        base = sc.nextInt();
        System.out.print("Introduce la potencia (entero positivo): ");
        pow = sc.nextInt();

        // Process
        if (pow == 0)
            System.out.print(base + " elevado a " + pow + " es 1");
        else {
            if (base < 0) {
                base *= (-1);
                for (int i = 0; i < pow; i++) {
                    res *= base;
                }
                res *= (-1);
            } else {
                for (int i = 0; i < pow; i++) {
                    res *= base;
                }
            }
            System.out.print(base + " elevado a " + pow + " es " + res);
        }

        // Close scanner
        sc.close();
    }
}
