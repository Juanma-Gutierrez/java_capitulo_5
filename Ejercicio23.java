
/**
 * Exercise: 23
 *
 * @version: 18/10/2022 17:00
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum;
        int cont;
        int num;

        cont = 0;
        sum = 0;
        num = 0;

        while (num + sum <= 10000) {
            System.out.print("Introduce un número: ");
            num = sc.nextInt();
            cont++;
            sum += num;
        }

        System.out.println("Total acumulado: " + sum);
        System.out.println("Contador de números introducidos: " + cont);
        System.out.printf("Media de números introducidos: %.2f", ((float) sum / cont));
        sc.close();
    }
}