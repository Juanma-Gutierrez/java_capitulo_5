
/**
 * Exercise: 15
 *
 * @version: 17/10/2022 18:51
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

<<<<<<< HEAD
/*
 * Escribe un programa que dados dos números, uno real (base) y un entero positivo (exponente), saque por pantalla todas las potencias con base el numero dado y exponentes entre uno y el exponente introducido. No se deben utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5, se deberán mostrar 2<sup>1</sup>, 2<sup>2</sup>, 2<sup>3</sup>, 2<sup>4</sup> y 2<sup>5</sup>.
 */

=======
>>>>>>> 4d954ae2b1fdf656202543356f96dbd830b1bbcc
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base;
        int pow;
        int res;

        System.out.print("Introduce la base: ");
        base = sc.nextInt();
        System.out.print("Introduce la potencia (entero positivo): ");
        pow = sc.nextInt();

        if (pow <= 0)
            System.out.print("Has introducido una potencia no válida");
        else {

            for (int i = 1; i <= pow; i++) {
                res = 1;
                for (int j = 0; j < i; j++) {
                    res *= base;
                }
                System.out.println(base + " a la " + i + " potencia es " + res);
            }
        }

        sc.close();
    }

}
