
/**
 * Exercise: 13
 *
 * @version: 17/10/2022 18:26
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que lea una lista de diez números y determine cuántos son positivos, y cuántos son negativos.
 */

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos;
        int neg;
        int num;

        pos = 0;
        neg = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce un número: ");
            num = sc.nextInt();
            if (num > 0)
                pos++;
            else if (num < 0)
                neg++;
        }

        System.out.println("Números positivos introducidos: " + pos);
        System.out.println("Números negativos introducidos: " + neg);
        sc.close();
    }
}
