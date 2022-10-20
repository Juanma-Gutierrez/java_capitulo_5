
/**
 * Exercise: 43
 * 
 * @version: 20/10/2022 09:31
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

import java.util.Scanner;

public class Ejercicio43 {
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
        long newNum1;
        long newNum2;
        long pos;
        long rev;
        int cont;

        // Var init
        cont = 0;
        newNum1 = 0;
        newNum2 = 0;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Por favor, introduzca un número entero positivo: ");
        num = sc.nextInt();
        System.out.print("Introduzca la posición a partir de la cual quiere partir el número: ");
        pos = sc.nextInt();

        // Process
        rev = rotateNum(num);

        do {
            if (cont < pos) {
                newNum1 *= 10;
                newNum1 += rev % 10;
            } else {
                newNum2 *= 10;
                newNum2 += rev % 10;
            }
            cont++;
            rev /= 10;
        } while (rev > 0);

        // Output data
        System.out.print("Los números partidos son el " + newNum1 + " y el " + newNum2);

        sc.close();
    }
}
