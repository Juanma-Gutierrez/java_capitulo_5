
/**
 * Exercise: 36
 *
 * @version: 19/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que diga si un número introducido por teclado es o no capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El programa debe aceptar números de cualquier longitud siempre que lo permita el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar long en lugar de int ya que el primero admite números más largos.
 */

import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[] args) {
        // Var declarations
        int num;
        int longNum;
        boolean cap;
        int neg;

        // Var init
        cap = true;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduce un número entero: ");
        num = sc.nextInt();
        longNum = Integer.toString(num).length();
        neg = (num < 0) ? 1 : 0;

        // Process
        for (int i = 0; i < longNum / 2; i++) {
            if (Integer.toString(num).charAt(i + neg) != Integer.toString(num).charAt(longNum - i - 1)) {
                cap = false;
            }
        }

        // Output data
        System.out.print((cap) ? "El " + num + " es capicúa " : "El " + num + " no es capicúa");
        if (neg == 1)
            System.out.print("y de signo negativo");

        // Close scanner
        sc.close();
    }

}
