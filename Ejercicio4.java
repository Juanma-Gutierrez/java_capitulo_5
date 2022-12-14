/**
 * Exercise: 4
 *
 * @version: 17/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
 * utilizando un bucle for.
 */

public class Ejercicio4 {
    public static void main(String[] args) {
        // Process
        for (int i = 320; i >= 160; i -= 20) {
            if (i == 320)
                System.out.print(i);
            else
                System.out.print(", " + i);
        }
    }
}
