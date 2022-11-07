
/**
 * Exercise: 47
 *
 * @version: 21/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Con motivo de la celebración del día de la mujer, el 8 de marzo, nos han encargado realizar un programa que pinte un 8 por pantalla usando la letra M. Se pide al usuario la altura, que debe ser un número entero impar mayor o igual que 5. Si el número introducido no es correcto, el programa deberá mostrar un mensaje de error. A continuación se muestran algunos ejemplos. La anchura de la figura siempre será de 6 caracteres.
 */

import java.util.Scanner;

public class Ejercicio47 {
    public static void main(String[] args) {
        // Var init
        float height;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Por favor, introduzca la altura (número impar mayor o igual a 5): ");
        height = sc.nextFloat();

        // Process
        if (height < 5 || height % 2 == 0)
            System.out.print("La altura introducida no es correcta");
        else {
            for (int i = 0; i < height; i++) {
                if (i == 0 || i == height - 1 || i == (int) height / 2)
                    System.out.println("MMMMMM");
                else
                    System.out.println("M    M");
            }

        }

        // Close scanner
        sc.close();
    }
}
