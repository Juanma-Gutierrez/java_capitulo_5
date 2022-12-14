
/**
 * Exercise: 55
 *
 * @version: 22/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que sea capaz de desplazar todos los dígitos de un número de izquierda a derecha una posición. El dígito de más a la derecha, pasaría a dar la vuelta y se colocaría a la izquierda. Si el número tiene un solo dígito, se queda igual.
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

        // Output results
        System.out.print("El número resultado es: " + num);

        // Close scanner
        sc.close();
    }
}
