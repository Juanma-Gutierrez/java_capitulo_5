
/**
 * Exercise: 41
 *
 * @version: 19/10/2022 19:21
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

import java.util.Scanner;

public class Ejercicio41 {
    public static void main(String[] args) {
        // Var declarations
        int num;
        int temp;
        int pairCount;
        int oddCount;

        // Var init
        pairCount = 0;
        oddCount = 0;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduce un número enter: ");
        num = sc.nextInt();
        temp = num;

        // Process
        do {
            if (temp % 2 == 0)
                pairCount++;
            else
                oddCount++;
            temp /= 10;
        } while (temp > 0);

        // Output data
        System.out.print("El " + num + " contiene " + pairCount + " dígitos pares y " + oddCount + " dígitos impares.");

        sc.close();
    }
}
