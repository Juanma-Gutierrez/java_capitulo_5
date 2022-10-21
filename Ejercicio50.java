
/**
 * Exercise: 50
 *
 * @version: 21/10/2022 19:15
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

import java.util.Scanner;

public class Ejercicio50 {
    public static void main(String[] args) {
        // Var declarations
        int height;
        int espaces;
        boolean right;
        String row1;
        String row2;
        String row3;
        String espacesText;

        // Var init
        right = true;
        espaces = 0;
        row1 = "";
        row2 = "";
        row3 = "";
        espacesText = "";

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduzca la altura (5 como mínimo): ");
        height = sc.nextInt();

        if (height < 5)
            right = false;

        if (right) {
            System.out.print("Introduzca el número de espacios entre los números (1 como mínimo): ");
            espaces = sc.nextInt();
        } else
            right = false;

        if (right) {
            for (int i = 0; i < espaces; i++) {
                espacesText += " ";
            }
            row1 = "*" + espacesText + "****" + espacesText + "****";
            row2 = "*" + espacesText + "*   " + espacesText + "*   ";
            row3 = "*" + espacesText + "   *" + espacesText + "   *";

            // Output data
            System.out.println(row1);
            System.out.println(row2);
            System.out.println(row1);
            for (int i = 0; i < height - 4; i++)
                System.out.println(row3);
            System.out.println(row1);
        } else
            System.out.print("Ha introducido valores incorrectos.");

        sc.close();
    }
}
