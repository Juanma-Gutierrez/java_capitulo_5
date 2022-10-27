
/**
 * Exercise: 12
 *
 * @version: 17/10/2022 18:17
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos anteriores, por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se debe introducir por teclado.
 */

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int temp;
        int num;

        num1 = 0;
        num2 = 1;

        System.out.print("Introduce el número de valores que quieres mostrar de la secuencia Fibonacci: ");
        num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.print(num1 + ", ");
            temp = num1;
            num1 = num2;
            num2 = num1 + temp;
        }

        sc.close();
    }
}
