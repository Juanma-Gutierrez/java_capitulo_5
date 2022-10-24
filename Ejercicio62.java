
/**
 * Exercise: 62
 *
 * @version: 22/10/2022 12:48
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

import java.util.Scanner;

public class Ejercicio62 {
    public static int nLong(int num) {
        int cont;
        cont = 0;
        do {
            num /= 10;
            cont++;
        } while (num > 0);
        return cont;
    }

    public static void main(String[] args) {
        // Var declarations
        int num;
        int temp;
        int numLong;
        int cLucky;
        int cUnlucky;

        // Var init
        cLucky = 0;
        cUnlucky = 0;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduzca un número: ");
        num = sc.nextInt();
        numLong = nLong(num);

        // Process
        for (int i = 0; i <= 9; i++) {
            temp = num;
            for (int j = 0; j < numLong; j++) {
                if (temp % 10 == i) {
                    if (i == 3 || i >= 7)
                        cLucky++;
                    else if (i <= 2 || (i >= 4 && i <= 6))
                        cUnlucky++;
                }
                temp /= 10;
            }
        }

        // Output data
        System.out.print(cLucky > cUnlucky ? "El " + num + " es un número afortunado"
                : "El " + num + " no es un número afortunado");

        sc.close();
    }
}
