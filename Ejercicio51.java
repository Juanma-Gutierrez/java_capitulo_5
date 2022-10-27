
/**
 * Exercise: 51
 *
 * @version: 21/10/2022 20:29
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

<<<<<<< HEAD
/*
 * El gusano numérico se come los dígitos con forma de rosquilla, o sea, el 0 y el 8 (todos los que encuentre). Realiza un programa que muestre un número antes y después de haber sido comido por el gusano. Si el animalito no se ha comido ningún dígito, el programa debe indicarlo.
 */

=======
>>>>>>> 4d954ae2b1fdf656202543356f96dbd830b1bbcc
import java.util.Scanner;

public class Ejercicio51 {
    // Function numLong
    // return num length
    public static int nlong(int num) {
        int count;
        count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        // Var declarations
        int num;
        int numLong;
        int newNum;
        int value;

        // Var init
        newNum = 0;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduzca un número entero (mayor que cero): ");
        num = sc.nextInt();

        if (num <= 0) {
            System.out.print("Ha introducido un valor no válido.");
        } else {
            numLong = nlong(num);
            for (int i = numLong - 1; i >= 0; i--) {
                value = (int) (num / Math.pow(10, i)) % 10;
                if (value != 0 && value != 8) {
                    newNum *= 10;
                    newNum += value;
                }
            }
        }

        System.out.print(newNum == num ? "El gusano numérico no se ha comido ningún dígito."
                : "Después de haber sido comido por el gusano numérico se queda en " + newNum);

        sc.close();
    }

}
