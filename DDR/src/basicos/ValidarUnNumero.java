/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicos;

import java.util.Scanner;

/**
 *
 * @author Gestel-Bcn-21
 */
public class ValidarUnNumero {

    public static void main(String[] args) {
        //pide un numero por consola y valida que este entre 0 y 10
        //usa do-while
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int num;
        System.out.println("ingresa num entre 0 y 10");
        do {
            num = sc.nextInt();
            if (!(num > -1 && num < 11)) {
                System.out.println("ingresa nuvamente");
            } else {
                salir = true;
            }
        } while (!salir);
    }
}
