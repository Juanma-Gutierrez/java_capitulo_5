
/**
 * Exercise: 34
 *
 * @version: 19/10/2022 17:11
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

import java.util.Scanner;

public class Ejercicio34 {
    public static long rotateNum(long num) {
        // Rotate number 2
        long rotateNum;

        rotateNum = 0;

        while (num > 0) {
            rotateNum *= 10;
            rotateNum += num % 10;
            num /= 10;
        }
        return rotateNum;
    }

    public static void main(String[] args) {
        // Var declarations
        long num1;
        long rotateNum1;
        long num2;
        long rotateNum2;
        long resPair;
        long resOdd;

        // Var init
        resPair = 0;
        resOdd = 0;
        rotateNum1 = 0;
        rotateNum2 = 0;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Por favor, introduzca un número: ");
        num1 = sc.nextInt();
        System.out.print("Introduzca otro número: ");
        num2 = sc.nextInt();

        // Process
        // Rotate numbers
        rotateNum1 = rotateNum(num1);
        rotateNum2 = rotateNum(num2);

        // Create new numbers
        do {
            if (rotateNum1 % 2 == 0) {
                resPair *= 10;
                resPair += rotateNum1 % 10;
                rotateNum1 /= 10;
            } else {
                resOdd *= 10;
                resOdd += rotateNum1 % 10;
                rotateNum1 /= 10;
            }
            if (rotateNum2 % 2 == 0) {
                resPair *= 10;
                resPair += rotateNum2 % 10;
                rotateNum2 /= 10;
            } else {
                resOdd *= 10;
                resOdd += rotateNum2 % 10;
                rotateNum2 /= 10;
            }

        } while (rotateNum1 > 0 || rotateNum2 > 0);

        // Output results
        System.out.println("El número formado por los dígitos pares es " + resPair);
        System.out.println("El número formado por los dígitos impares es " + resOdd);
        sc.close();
    }
}
