
/**
 * Exercise: 24
 *
 * @version: 18/10/2022 17:11
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

<<<<<<< HEAD
/*
 * Escribe un programa que lea un número n e imprima una pirámide de números con n filas como en la siguiente figura:
 */

=======
>>>>>>> 4d954ae2b1fdf656202543356f96dbd830b1bbcc
import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height;

        System.out.print("Introduce la altura de la pirámide: ");
        height = sc.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int j = height - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

        sc.close();
    }
}
