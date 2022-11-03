/**
 * Exercise: 5
 *
 * @version: 17/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
 * utilizando un bucle while.
 */

public class Ejercicio5 {
    public static void main(String[] args) {
        // Var declarations
        int i;

        // Var init
        i = 320;

        // Process
        while (i >= 160) {
            System.out.print(i + ", ");
            i -= 20;
        }
    }
}
