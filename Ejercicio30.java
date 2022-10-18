
/**
 * Exercise: 30
 *
 * @version: 18/10/2022 18:24
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {

        // Var declarations
        int dayInit;
        int hourInit;
        int dayFinal;
        int hourFinal;
        int hours;
        boolean right;

        // Var init
        hours = 0;
        right = true;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.println("Por favor, introduzca la primera hora.");
        System.out.println("Día (1-7):");
        dayInit = sc.nextInt();
        System.out.println("Hora (0-23):");
        hourInit = sc.nextInt();
        System.out.println("Por favor, introduzca la segunda hora.");
        System.out.println("Día (1-7):");
        dayFinal = sc.nextInt();
        System.out.println("Hora (0-23):");
        hourFinal = sc.nextInt();

        // Process
        if (hourFinal < hourInit) {
            if (dayFinal <= dayInit) {
                System.out.print("Has introducido datos incorrectos.");
                right = false;
            } else {
                hours = 24 - hourInit + hourFinal;
                hours += (dayFinal - dayInit - 1) * 24;
            }
        } else {
            hours = hourFinal - hourInit;
            hours += (dayFinal - dayInit) * 24;
        }

        // Output results
        if (right)
            System.out.print(
                    "Entre las " + hourInit + ":00h del día " + dayInit + " y las " + hourFinal + ":00h del día "
                            + dayFinal + " hay " + hours + " hora/s");
        sc.close();
    }
}
