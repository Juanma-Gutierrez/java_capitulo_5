
/**
 * Exercise: 16
 *
 * @version: 17/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que diga si un número introducido por teclado es o no primo. Un número primo es aquel que sólo es divisible entre él mismo y la unidad.
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
        sc.close();
    }
}
