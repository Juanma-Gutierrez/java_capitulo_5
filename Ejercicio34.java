
/**
 * Exercise: 34
 *
 * @version: 19/10/2022 17:11
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

<<<<<<< HEAD
/*
 * Escribe un programa que pida dos números por teclado y que luego mezcle en dos números diferentes los dígitos pares y los impares. Se van comprobando los dígitos de la siguiente manera: primer dígito del primer número, primer dígito del segundo número, segundo dígito del primer número, segundo dígito del segundo número, tercer dígito del primer número… Para facilitar el ejercicio, podemos suponer que el usuario introducirá dos números de la misma longitud y que siempre habrá al menos un dígito par y uno impar. Usa long en lugar de int donde sea necesario para admitir números largos.
 */

=======
>>>>>>> 4d954ae2b1fdf656202543356f96dbd830b1bbcc
import java.util.Scanner;

public class Ejercicio34 {
    public static long rotateNum(long num) {
<<<<<<< HEAD
        // Rotate number 2
        long rotateNum;

        rotateNum = 0;

=======
        long rotateNum;
        rotateNum = 0;
>>>>>>> 4d954ae2b1fdf656202543356f96dbd830b1bbcc
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
<<<<<<< HEAD
        long resPair;
        long resOdd;

        // Var init
        resPair = 0;
=======
        long resEven;
        long resOdd;

        // Var init
        resEven = 0;
>>>>>>> 4d954ae2b1fdf656202543356f96dbd830b1bbcc
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
<<<<<<< HEAD
                resPair *= 10;
                resPair += rotateNum1 % 10;
=======
                resEven *= 10;
                resEven += rotateNum1 % 10;
>>>>>>> 4d954ae2b1fdf656202543356f96dbd830b1bbcc
                rotateNum1 /= 10;
            } else {
                resOdd *= 10;
                resOdd += rotateNum1 % 10;
                rotateNum1 /= 10;
            }
            if (rotateNum2 % 2 == 0) {
<<<<<<< HEAD
                resPair *= 10;
                resPair += rotateNum2 % 10;
=======
                resEven *= 10;
                resEven += rotateNum2 % 10;
>>>>>>> 4d954ae2b1fdf656202543356f96dbd830b1bbcc
                rotateNum2 /= 10;
            } else {
                resOdd *= 10;
                resOdd += rotateNum2 % 10;
                rotateNum2 /= 10;
            }
<<<<<<< HEAD

        } while (rotateNum1 > 0 || rotateNum2 > 0);

        // Output results
        System.out.println("El número formado por los dígitos pares es " + resPair);
=======
        } while (rotateNum1 > 0 || rotateNum2 > 0);

        // Output results
        System.out.println("El número formado por los dígitos pares es " + resEven);
>>>>>>> 4d954ae2b1fdf656202543356f96dbd830b1bbcc
        System.out.println("El número formado por los dígitos impares es " + resOdd);
        sc.close();
    }
}
