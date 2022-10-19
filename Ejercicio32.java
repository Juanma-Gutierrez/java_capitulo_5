
/**
 * Exercise: 32
 * 
 * @version: 19/10/2022 11:08
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        // Vars definition
        int num;
        int rotateNum;
        int pairSum;

        // Vars init
        pairSum = 0;
        rotateNum = 0;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Por favor, introduzca un número entero positivo: ");
        num = sc.nextInt();

        // Process
        // Rotate the number
        while (num > 0) {
            rotateNum *= 10;
            rotateNum += num % 10;
            num /= 10;
        }

        System.out.print("Dígitos pares: ");
        do {
            if (rotateNum % 2 == 0) {
                System.out.print((rotateNum % 10) + " ");
                pairSum += rotateNum % 10;
            }
            rotateNum /= 10;
        } while (rotateNum > 0);

        System.out.print("\nSuma de los dígitos pares: " + pairSum);

        sc.close();
    }
}
