
/**
 * Exercise: 10
 * 
 *
 * @version: 17/10/2022 17:44
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum;
        int count;
        int num;

        sum = 0;
        count = 0;

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

        System.out.print("La media de los números introducidos es: ");
        System.out.printf("%.2f", ((float) sum / (float) count));
        sc.close();
    }
}
