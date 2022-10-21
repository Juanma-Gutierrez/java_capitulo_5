
/**
 * Exercise: 47
 *
 * @version: 21/10/2022 17:54
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

import java.util.Scanner;

public class Ejercicio47 {
    public static void main(String[] args) {
        // Var init
        float height;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Por favor, introduzca la altura (número impar mayor o igual a 5): ");
        height = sc.nextFloat();

        // Process
        if (height < 5 || height % 2 == 0)
            System.out.print("La altura introducida no es correcta");
        else {
            for (int i = 0; i < height; i++) {
                if (i == 0 || i == height - 1 || i == (int) height / 2)
                    System.out.println("MMMMMM");
                else
                    System.out.println("M    M");
            }

        }

        sc.close();
    }
}
