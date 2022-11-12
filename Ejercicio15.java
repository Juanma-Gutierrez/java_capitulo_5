
/**
 * Exercise: 15
 *
 * @version: 17/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que dados dos números, uno real (base) y un entero positivo (exponente), saque por pantalla todas las potencias con base el numero dado y exponentes entre uno y el exponente introducido. No se deben utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5, se deberán mostrar 2<sup>1</sup>, 2<sup>2</sup>, 2<sup>3</sup>, 2<sup>4</sup> y 2<sup>5</sup>.
 */

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        // Var declarations
        int base;
        int pow;
        long res;
        int basePrint;
        boolean powNeg;
        String resOutput;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduce la base: ");
        base = sc.nextInt();
        System.out.print("Introduce la potencia (entero positivo): ");
        pow = sc.nextInt();
        powNeg = pow < 0 ? true : false;
        res = 0;
        resOutput = "";
        basePrint = base;
        base = base < 0 ? base *= (-1) : base; // Control base negativa
        pow = powNeg ? pow *= (-1) : pow; // Control exponente negativo

        // Process
        if (pow == 0) // Control exponente cero
            System.out.print(basePrint + " elevado a " + pow + " es 1");
        else {
            for (int i = 1; i <= pow; i++) {
                res = 1;
                for (int j = 0; j < i; j++) {
                    res *= base;
                }
                // Control de salida de negativos en base y exp
                res = basePrint < 0 ? res *= (-1) : res;
                resOutput = powNeg ? "-1/" + (res < 0 ? res *= (-1) : res) : String.valueOf(res);
                System.out.printf("%d elevado a %d es %s\n", basePrint, powNeg ? i * (-1) : i, resOutput);
            }
        }

        // Close scanner
        sc.close();
    }

}
