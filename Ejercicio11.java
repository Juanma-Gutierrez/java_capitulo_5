
/**
 * Exercise: 11
 *
 * @version: 17/10/2022 18:08
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

<<<<<<< HEAD
/*
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de los 5 primeros números enteros a partir de uno que se introduce por teclado.
 */

=======
>>>>>>> 4d954ae2b1fdf656202543356f96dbd830b1bbcc
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Introduce un número entero: ");
        num = sc.nextInt();

        for (int i = 0; i < 5; i++) {
            System.out.printf("%-10d%-10d%-10d\n", (num + i), (int) (Math.pow(num + i, 2)),
                    (int) (Math.pow(num + i, 3)));
        }

        sc.close();
    }
}
