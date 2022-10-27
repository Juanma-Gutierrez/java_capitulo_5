
/**
 * Exercise: 41
 *
 * @version: 19/10/2022 19:21
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares hay dentro de un número. Se recomienda usar long en lugar de int ya que el primero admite números más largos.
 */

import java.util.Scanner;

public class Ejercicio41 {
    public static void main(String[] args) {
        // Var declarations
        int num;
        int temp;

        int evenCount;
        int oddCount;

        // Var init
        evenCount = 0;
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
                evenCount++;
            else
                oddCount++;
            temp /= 10;
        } while (temp > 0);

        // Output data
        System.out.print("El " + num + " contiene " + evenCount + " dígitos pares y " + oddCount + " dígitos impares.");

        sc.close();
    }
}
