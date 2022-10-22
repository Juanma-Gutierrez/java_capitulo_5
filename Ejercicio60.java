
/**
 * Exercise: 60
 *
 * @version: 22/10/2022 12:26
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

import java.util.Scanner;

public class Ejercicio60 {
    public static void main(String[] args) {
        // Var declarations
        int height;
        String socks1;
        String socks2;

        // Var init
        socks1 = "***     ***   ";
        socks2 = "******  ******";

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduzca la altura de los calcetines (mayor o igual a 4): ");
        height = sc.nextInt();

        // Process
        if (height < 4)
            System.out.print("Ha introducido una altura no válida.");
        else {
            for (int i = 0; i < height - 2; i++)
                System.out.println(socks1);
            for (int i = 0; i < 2; i++)
                System.out.println(socks2);
        }

        sc.close();
    }
}
