
/**
 * Exercise: 26
 *
 * @version: 18/10/2022 17:45
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

<<<<<<< HEAD
/*
 * Realiza un programa que pida primero un número y a continuación un dígito. El programa nos debe dar la posición (o posiciones) contando de izquierda a derecha que ocupa ese dígito en el número introducido.
 */

=======
>>>>>>> 4d954ae2b1fdf656202543356f96dbd830b1bbcc
import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {

        // Var declarations
        int num;
        int dig;
        int count;
        int res;

        // Var init
        count = 1;
        res = 0;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduce un número: ");
        num = sc.nextInt();
        System.out.print("Introduce un dígito del número introducido: ");
        dig = sc.nextInt();

        // Process
        // Rotate the number
        while (num > 0) {
            res *= 10;
            res += num % 10;
            num /= 10;
        }

        // Check last digit
        while (res > 0) {
            if (res % 10 == dig) {
                // Output results
                System.out.print(count + ", ");
            }
            res /= 10;
            count++;
        }

        sc.close();
    }
}
