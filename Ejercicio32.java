
/**
 * Exercise: 32
 * 
 * @version: 19/10/2022 11:08
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
* Escribe un programa que, dado un número entero positivo, diga cuáles son y cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir números largos.
*/

import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        // Var declarations
        int num;
        int rotateNum;
        int evenSum;

        // Var init
        evenSum = 0;
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
                evenSum += rotateNum % 10;
            }
            rotateNum /= 10;
        } while (rotateNum > 0);

        if (evenSum > 0)
            System.out.print("\nSuma de los dígitos pares: " + evenSum);
        else
            System.out.print("\nNo existe ningún dígito par");

        sc.close();
    }
}
