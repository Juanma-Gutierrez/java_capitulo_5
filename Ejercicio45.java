
/**
 * Exercise: 45
 * 
 * @version: 20/10/2022 12:41
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que cambie un dígito dentro de un número dando la posición y el valor nuevo. Las posiciones se cuentan de izquierda a derecha empezando por el 1. Se recomienda usar long en lugar de int ya que el primero admite números más largos. Suponemos que el usuario introduce correctamente los datos.
 */

import java.util.Scanner;

public class Ejercicio45 {
    public static long rotateNum(long num) {
        // Rotate number
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
        long numToInsert;
        long newNum;
        long pos;
        long rev;
        int cont;

        // Var init
        cont = 0;
        newNum = 0;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Por favor, introduzca un número entero positivo: ");
        num = sc.nextInt();
        System.out.print("Introduzca la posición dentro del número: ");
        pos = sc.nextInt();
        System.out.print("Introduzca el nuevo dígito: ");
        numToInsert = sc.nextInt();

        // Process
        if (numToInsert > 9)
            System.out.print("Ha introducido un dígito erroneo.");
        else {
            rev = rotateNum(num);

            do {
                if (cont == pos - 1) {
                    newNum *= 10;
                    newNum += numToInsert;

                } else {
                    newNum *= 10;
                    newNum += rev % 10;
                }
                cont++;
                rev /= 10;
            } while (rev > 0);

            // Output data
            System.out.print("El número resultante es " + newNum);
        }
        sc.close();
    }
}
