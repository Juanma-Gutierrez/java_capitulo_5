
/**
 * Exercise: 52
 *
 * @version: 22/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que sea capaz de desplazar todos los dígitos de un número de derecha a izquierda una posición. El dígito de más a la izquierda, pasaría a dar la vuelta y se colocaría a la derecha. Si el número tiene un solo dígito, se queda igual.
 */

import java.util.Scanner;

public class Ejercicio52 {
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
        dig = (int) num / val;
        num = num % val;
        num *= 10;
        num += dig;

        System.out.print("El número resultado es: " + num);

        // Close scanner
        sc.close();
    }
}
