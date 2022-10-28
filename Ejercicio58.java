
/**
 * Exercise: 58
 *
 * @version: 22/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que calcule la media de los dígitos que contiene un número entero introducido por teclado.
 */

import java.util.Scanner;

public class Ejercicio58 {
    public static void main(String[] args) {
        // Var declarations
        long num;
        long sum;
        int count;

        // Var init
        sum = 0;
        count = 0;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduzca un número: ");
        num = sc.nextInt();

        // Process
        do {
            sum += num % 10;
            count++;
            num /= 10;
        } while (num > 0);

        // Output data
        System.out.print("La media de sus dígitos es: " + ((float) sum / (float) count));
        sc.close();
    }
}
