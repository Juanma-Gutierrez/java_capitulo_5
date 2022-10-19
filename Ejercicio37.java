
/**
 * Exercise: 37
 *
 * @version: 19/10/2022 18:29
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

import java.util.Scanner;

public class Ejercicio37 {
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
        long num;
        long rotatedNum;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Por favor, introduzca un número entero positivo: ");
        num = sc.nextInt();

        // Process
        rotatedNum = rotateNum(num);
        System.out.print("El " + num + "en decimal es el ");
        do {
            for (int i = 0; i < rotatedNum % 10; i++) {
                System.out.print("|");
            }
            if (rotatedNum > 10)
                System.out.print("-");
            rotatedNum /= 10;
        } while (rotatedNum > 0);
        System.out.print(" en el sistema de palotes.");

        sc.close();
    }
}
