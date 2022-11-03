
/**
 * Exercise: 10
 * 
 *
 * @version: 17/10/2022 17:44
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que calcule la media de un conjunto de números positivos introducidos por teclado. A priori, el programa no sabe cuántos números se introducirán. El usuario indicará que ha terminado de introducir los datos cuando meta un número negativo.
 */

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        // Var declarations
        int sum;
        int count;
        int num;

        // Var init
        sum = 0;
        count = 0;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Process
        System.out.println(
                "Promedio de números. Introduce los números de los que quieres calcular la media. Introduce un valor negativo para finalizar.");
        do {
            System.out.print("Introduce número: ");
            num = sc.nextInt();
            if (num >= 0) {
                sum += num;
                count++;
            }
        } while (num >= 0);

        // Output results
        System.out.print("La media de los números introducidos es: ");
        System.out.printf("%.2f", ((float) sum / (float) count));
        sc.close();
    }
}
