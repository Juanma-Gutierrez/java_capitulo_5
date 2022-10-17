
/**
 * Exercise: 18
 *
 * @version: 17/10/2022 19:29
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int temp;

        System.out.print("Introduce el primer número: ");
        num1 = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        num2 = sc.nextInt();

        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        for (int i = num1; i <= num2; i += 7) {
            System.out.print(i + ", ");
        }
        sc.close();
    }
}