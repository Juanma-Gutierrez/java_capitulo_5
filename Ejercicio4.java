/**
 * Exercise: 4
 *
 * @version: 17/10/2022 17:03
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
 * utilizando un bucle for.
 */

public class Ejercicio4 {
    public static void main(String[] args) {
        for (int i = 320; i >= 160; i -= 20) {
            System.out.print(i + ", ");
        }
    }
}
