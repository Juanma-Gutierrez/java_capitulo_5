
/**
 * Exercise: 49
 *
 * @version: 21/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que calcule el máximo, el mínimo y la media de una serie de números enteros positivos introducidos por teclado. El programa terminará cuando el usuario introduzca un número primo. Este último número no se tendrá en cuenta en los cálculos. El programa debe indicar también cuántos números ha introducido el usuario (sin contar el primo que sirve para salir).
 */

import java.util.Scanner;

public class Ejercicio49 {
    public static void main(String[] args) {
        // Var declarations
        int sum;
        int count;
        int min;
        int max;
        int num;
        boolean prime;

        // Var init
        sum = 0;
        count = 0;
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.println(
                "Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número primo:");

        // Process
        do {
            num = sc.nextInt();

            // CheckPrime
            prime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0)
                    prime = false;
            }
            if (!prime) {
                if (num > max)
                    max = num;
                if (num < min)
                    min = num;
                sum += num;
                count++;
            }

        } while (!prime);

        // Output data
        System.out.println("Ha introducido " + count + " números no primos.");
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
        System.out.printf("Media: %.2f", (float) sum / count);

        sc.close();
    }
}
