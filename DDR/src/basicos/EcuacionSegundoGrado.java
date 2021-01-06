/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicos;

import java.util.Scanner;

/**
 *
 * @author pscam
 */
public class EcuacionSegundoGrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * pedir 3 numeros por consola y realiza una aecuacion de segundo grado
         */

        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("valor a");
        a = sc.nextInt();
        System.out.println("valor b");
        b = sc.nextInt();
        System.out.println("valor c");
        c = sc.nextInt();
        double discriminandte = (Math.pow(b, 2) - 4 * a * c);
        double x1, x2;

        if (discriminandte > 0) {
            x1 = (-b + Math.sqrt((Math.pow(b, 2) - 4 * a * c)) / 2 * a);
            x2 = (-b - Math.sqrt((Math.pow(b, 2) - 4 * a * c)) / 2 * a);
            System.out.println("x1 " + x1 + " x2 " + x2);
        } else if (discriminandte == 0) {
            x1 = -b / (2 * a);
            System.out.println("unica solucion x1 " + x1);
        } else {
            System.out.println("no tiene solucion");
        }

    }

}
