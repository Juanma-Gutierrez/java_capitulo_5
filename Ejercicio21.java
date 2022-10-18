
/**
 * Exercise: 21
 *
 * @version: 18/10/2022 07:46
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/* Realiza un programa que vaya pidiendo números hasta que se introduzca un numero negativo y nos diga cuantos números se han introducido, la media de los impares y el mayor de los pares. El número negativo sólo se utiliza para indicar el final de la introducción de datos pero no se incluye en el cómputo. */
import java.util.Scanner;

import javax.swing.text.AbstractDocument.Content;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxPair;
        int averageOdd;
        int counterOdd;
        int counter;
        int num;

        counter = 0;
        averageOdd = 0;
        counterOdd = 0;
        maxPair = 0;

        do {
            System.out.print("Introduce un número: ");
            num = sc.nextInt();
            if (num >= 0) {
                if (num % 2 == 0) {
                    if (num > maxPair)
                        maxPair = num;
                } else {
                    averageOdd += num;
                    counterOdd++;
                }
                counter++;
            }
        } while (num >= 0);

        System.out.println("La cantidad de números introducida es: " + counter);
        System.out.println("El mayor número par es: " + maxPair);
        if (counterOdd>0)
            System.out.println("La media de impares es: " + ((float) averageOdd / counterOdd));
            else
            System.out.println("No se ha introducido ningún número impar");

        sc.close();
    }
}
