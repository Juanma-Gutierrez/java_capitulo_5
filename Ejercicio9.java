
/**
 * Exercise: 9
 *
 * @version: 17/10/2022 17:32
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int cont;

        cont = 0;

        System.out.print("Introduce un número mayor que 0: ");
        num = sc.nextInt();
        if (num <= 0)
            System.out.print("Has introducido un número no válido");
        else {
            while (num > 0) {
                num /= 10;
                cont++;
            }
            System.out.print("El número introducido tiene " + cont + " dígitos");

        }

        sc.close();
    }
}
