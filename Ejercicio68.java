
/**
 * Exercise: 68
 *
 * @version: 23/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que pida un número por teclado y que luego lo “disloque” de tal forma que a cada dígito se le suma 1 si es par y se le resta 1 si es impar. Usa long en lugar de int donde sea necesario para admitir números largos.
 */

import java.util.Scanner;

public class Ejercicio68 {
    public static long rotateNum(long num) {
        long rotateNum;
        rotateNum = 0;
        while (num > 0) {
            rotateNum *= 10;
            rotateNum += num % 10;
            num /= 10;
        }
        return rotateNum;
    }

    public static void main(String[] args) {
        // Var declarations
        long num;
        long revNum;
        long dislocNum;

        // Var init
        dislocNum = 0;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Por favor, introduzca un número: ");
        num = sc.nextLong();

        // Process
        revNum = rotateNum(num);
        do {
            if (revNum % 10 % 2 == 0) {
                dislocNum *= 10;
                dislocNum += revNum % 10 + 1;
            } else {
                dislocNum *= 10;
                dislocNum += revNum % 10 - 1;
            }
            revNum /= 10;
        } while (revNum > 0);

        System.out.print("Dislocando el " + num + " sale el " + dislocNum);
        sc.close();
    }
}
