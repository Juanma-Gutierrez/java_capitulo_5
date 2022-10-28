
/**
 * Exercise: 7
 *
 * @version: 17/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación” y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”. Tendremos cuatro oportunidades para abrir la caja fuerte.
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
