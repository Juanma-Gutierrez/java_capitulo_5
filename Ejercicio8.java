
/**
 * Exercise: 8
 *
 * @version: 17/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 */

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        // Var declarations
        int num;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduce un número del 1 al 10: ");
        num = sc.nextInt();

        // Process
        if (num < 0 || num > 10)
            System.out.print("Has introducido un número no válido");
        else {
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }
        }

        // Close scanner
        sc.close();
    }
}
