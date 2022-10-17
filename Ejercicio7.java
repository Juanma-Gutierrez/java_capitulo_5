
/**
 * Exercise: 7
 *
 * @version: 17/10/2022 17:12
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        String comb;
        String userComb;
        boolean right;
        int tryNumber;

        Scanner sc = new Scanner(System.in);

        tryNumber = 1;
        right = false;
        comb = "1234";

        do {
            System.out.print("Introduce la combinación (intento nº " + tryNumber + "/4): ");
            userComb = sc.next();
            tryNumber++;
            if (comb.equals(userComb))
                right = true;
            System.out.println(
                    right ? "La caja fuerte se ha abierto satisfactoriamente" : "Lo siento, esa no es la combinación");
        } while (tryNumber <= 4 && right == false);

        sc.close();
    }
}
