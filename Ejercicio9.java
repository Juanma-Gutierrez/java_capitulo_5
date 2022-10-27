
/**
 * Exercise: 9
 *
 * @version: 17/10/2022 17:32
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

<<<<<<< HEAD
/*
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con la salvedad de que el anterior estaba limitado a números de 5 dígitos como máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de esta manera, la única limitación en el número de dígitos la establece el tipo de dato que se utilice (int o long).
 */

=======
>>>>>>> 4d954ae2b1fdf656202543356f96dbd830b1bbcc
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
