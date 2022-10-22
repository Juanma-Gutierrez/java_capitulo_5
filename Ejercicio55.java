
/**
 * Exercise: 55
 *
 * @version: 22/10/2022 11:41
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

import java.util.Scanner;

public class Ejercicio55 {
    public static int nLong(int num) {
        int cont;
        cont = 0;
        do {
            num /= 10;
            cont++;
        } while (num > 0);
        return cont;
    }

    public static void main(String[] args) {
        // Var declarations
        int num;
        int dig;
        int numLong;
        int val;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduzca un número: ");
        num = sc.nextInt();

        // Process
        numLong = nLong(num);
        val = (int) Math.pow(10, numLong - 1);
        dig = num % 10;
        num = num / 10;
        dig *= val;
        num += dig;

        System.out.print("El número resultado es: " + num);

        sc.close();
    }
}
