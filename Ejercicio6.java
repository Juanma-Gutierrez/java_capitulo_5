/**
 * Exercise: 6
 *
 * @version: 17/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle
 * do-while.
 */

public class Ejercicio6 {
    public static void main(String[] args) {
        // Var declarations
        int i;

        // Var init
        i = 320;

        // Process
        do {
            System.out.print(i + ", ");
            i -= 20;
        } while (i >= 160);
    }
}
