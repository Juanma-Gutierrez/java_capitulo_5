/**
 * Exercise: 1
 *
 * @version: 17/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        // Process
        for (int i = 0; i <= 100; i += 5) {
            if (i == 0)
                System.out.print(i);
            else
                System.out.print(", " + i);
        }
    }
}
