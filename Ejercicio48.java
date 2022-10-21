
/**
 * Exercise: 48
 *
 * @version: 21/10/2022 18:02
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

import java.util.Scanner;

public class Ejercicio48 {
    public static void main(String[] args) {
        // Var declarations
        int zero;
        int one;
        int two;
        int three;
        int four;
        int five;
        int six;
        int seven;
        int eight;
        int nine;
        int num;

        // Var init
        zero = 0;
        one = 0;
        two = 0;
        three = 0;
        four = 0;
        five = 0;
        six = 0;
        seven = 0;
        eight = 0;
        nine = 0;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduzca un número entero: ");
        num = sc.nextInt();

        // Process
        do {
            switch (num % 10) {
                case 0:
                    zero++;
                    break;
                case 1:
                    one++;
                    break;
                case 2:
                    two++;
                    break;
                case 3:
                    three++;
                    break;
                case 4:
                    four++;
                    break;
                case 5:
                    five++;
                    break;
                case 6:
                    six++;
                    break;
                case 7:
                    seven++;
                    break;
                case 8:
                    eight++;
                    break;
                case 9:
                    nine++;
                    break;
            }
            num /= 10;
        } while (num > 0);

        // Output data
        System.out.print("Dígitos que aparecen en el número: ");
        if (zero > 0)
            System.out.print("0 ");
        if (one > 0)
            System.out.print("1 ");
        if (two > 0)
            System.out.print("2 ");
        if (three > 0)
            System.out.print("3 ");
        if (four > 0)
            System.out.print("4 ");
        if (five > 0)
            System.out.print("5 ");
        if (six > 0)
            System.out.print("6 ");
        if (seven > 0)
            System.out.print("7 ");
        if (eight > 0)
            System.out.print("8 ");
        if (nine > 0)
            System.out.print("9 ");
        System.out.println();

        System.out.print("Dígitos que aparecen en el número: ");
        if (zero == 0)
            System.out.print("0 ");
        if (one == 0)
            System.out.print("1 ");
        if (two == 0)
            System.out.print("2 ");
        if (three == 0)
            System.out.print("3 ");
        if (four == 0)
            System.out.print("4 ");
        if (five == 0)
            System.out.print("5 ");
        if (six == 0)
            System.out.print("6 ");
        if (seven == 0)
            System.out.print("7 ");
        if (eight == 0)
            System.out.print("8 ");
        if (nine == 0)
            System.out.print("9 ");

        sc.close();
    }
}
