/**
 * Exercise: 2
 *
 * @version: 17/10/2022 16:57
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        // Var declarations
        int i;

        // Var init
        i = 0;

        // Process
        while (i <= 100) {
            System.out.print(i + ", ");
            i += 5;
        }
    }
}
