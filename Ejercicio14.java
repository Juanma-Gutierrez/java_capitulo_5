
/**
 * Exercise: 14
 *
 * @version: 17/10/2022 18:33
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

<<<<<<< HEAD
/*
 * Escribe un programa que pida una base y un exponente (entero positivo) y que calcule la potencia.
 */

=======
>>>>>>> 4d954ae2b1fdf656202543356f96dbd830b1bbcc
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base;
        int pow;
        int res;

        res = 1;

        System.out.print("Introduce la base: ");
        base = sc.nextInt();
        System.out.print("Introduce la potencia (entero positivo): ");
        pow = sc.nextInt();

        if (pow <= 0)
            System.out.print("Has introducido una potencia no válida");
        else {
            for (int i = 0; i < pow; i++) {
                res *= base;
            }
            System.out.print(base + " a la " + pow + " potencia es " + res);
        }

        sc.close();
    }
}
