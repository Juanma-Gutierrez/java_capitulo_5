
/**
 * Exercise: 44
 * 
 * @version: 20/10/2022 12:30
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

<<<<<<< HEAD
/*
 * Escribe un programa que sea capaz de insertar un dígito dentro de un número indicando la posición. El nuevo dígito se colocará en la posición indicada y el resto de dígitos se desplazará hacia la derecha. Las posiciones se cuentan de izquierda a derecha empezando por el 1. Suponemos que el usuario introduce correctamente los datos. Se recomienda usar long en lugar de int ya que el primero admite números más largos.
 */

=======
>>>>>>> 4d954ae2b1fdf656202543356f96dbd830b1bbcc
import java.util.Scanner;

public class Ejercicio44 {
    public static long rotateNum(long num) {
        // Rotate number
        long rotateNum;
<<<<<<< HEAD

        rotateNum = 0;

=======
        rotateNum = 0;
>>>>>>> 4d954ae2b1fdf656202543356f96dbd830b1bbcc
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
        long numToInsert;
        long newNum;
        long pos;
        long rev;
        int cont;

        // Var init
        cont = 0;
        newNum = 0;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Por favor, introduzca un número entero positivo: ");
        num = sc.nextInt();
        System.out.print("Introduzca la posición donde quiere insertar: ");
        pos = sc.nextInt();
        System.out.print("Introduzca el dígito que quiere insertar: ");
        numToInsert = sc.nextInt();

        // Process
        if (numToInsert > 9)
            System.out.print("Ha introducido un dígito erroneo.");
        else {
            rev = rotateNum(num);

            do {
                if (cont == pos) {
                    newNum *= 10;
                    newNum += numToInsert;
                    newNum *= 10;
                    newNum += rev % 10;
                } else {
                    newNum *= 10;
                    newNum += rev % 10;
                }
                cont++;
                rev /= 10;
            } while (rev > 0);

            // Output data
            System.out.print("El número resultante es " + newNum);
        }
        sc.close();
    }
}
