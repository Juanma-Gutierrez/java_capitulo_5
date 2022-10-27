
/**
 * Exercise: 17
 *
 * @version: 17/10/2022 19:23
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

<<<<<<< HEAD
/*
 * Realiza un programa que sume los 100 números siguientes a un número entero y positivo introducido por teclado. Se debe comprobar que el dato introducido es correcto (que es un número positivo).
 */

=======
>>>>>>> 4d954ae2b1fdf656202543356f96dbd830b1bbcc
import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int sum;

        sum = 0;

        System.out.print("Introduce un número entero y positivo: ");
        num = sc.nextInt();

        if (num > 0) {
            for (int i = 0; i < 100; i++) {
                sum += num + i;
            }
            System.out.print("La suma de los 100 primeros números a partir del " + num + " es: " + sum);
        } else {
            System.out.print("Has introducido un número no válido");
        }
        sc.close();
    }
}
