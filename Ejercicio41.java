
/**
 * Exercise: 41
 *
 * @version: 19/10/2022 19:21
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

<<<<<<< HEAD
/*
 * Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares hay dentro de un número. Se recomienda usar long en lugar de int ya que el primero admite números más largos.
 */

=======
>>>>>>> 4d954ae2b1fdf656202543356f96dbd830b1bbcc
import java.util.Scanner;

public class Ejercicio41 {
    public static void main(String[] args) {
        // Var declarations
        int num;
        int temp;
<<<<<<< HEAD
        int pairCount;
        int oddCount;

        // Var init
        pairCount = 0;
=======
        int evenCount;
        int oddCount;

        // Var init
        evenCount = 0;
>>>>>>> 4d954ae2b1fdf656202543356f96dbd830b1bbcc
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
<<<<<<< HEAD
                pairCount++;
=======
                evenCount++;
>>>>>>> 4d954ae2b1fdf656202543356f96dbd830b1bbcc
            else
                oddCount++;
            temp /= 10;
        } while (temp > 0);

        // Output data
<<<<<<< HEAD
        System.out.print("El " + num + " contiene " + pairCount + " dígitos pares y " + oddCount + " dígitos impares.");
=======
        System.out.print("El " + num + " contiene " + evenCount + " dígitos pares y " + oddCount + " dígitos impares.");
>>>>>>> 4d954ae2b1fdf656202543356f96dbd830b1bbcc

        sc.close();
    }
}
