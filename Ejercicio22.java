/**
 * Exercise:
 *
 * @version: 18/10/2022 16:50
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 */

public class Ejercicio22 {
    public static void main(String[] args) {
        boolean prime;

        for (int i = 2; i <= 100; i++) {
            int j;
            j = 2;
            prime = true;
            while (prime && j <= i / 2) {
                if (i % j == 0)
                    prime = false;
                j++;
            }
            if (prime)
                System.out.print(i + ", ");
        }
    }
}
