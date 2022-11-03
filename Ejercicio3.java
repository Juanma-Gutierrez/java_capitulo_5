/**
 * Exercise: 3
 *
 * @version: 17/10/2022 17:01
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        // Var declarations
        int i;

        // Var init
        i = 0;
        
        // Process
        do {
            System.out.print(i + ", ");
            i += 5;
        } while (i <= 100);
    }
}
