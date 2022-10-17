
/**
 * Exercise: 12
 *
 * @version: 17/10/2022 18:17
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int temp;
        int num;

        num1 = 0;
        num2 = 1;

        System.out.print("Introduce el número de valores que quieres mostrar de la secuencia Fibonacci: ");
        num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.print(num1 + ", ");
            temp = num1;
            num1 = num2;
            num2 = num1 + temp;
        }

        sc.close();
    }
}
