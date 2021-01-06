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
public class AdivinaElNumero {

    public static void main(String[] args) {
        /**
         * vammos a juagar a un pqueño juego, Generar un numero aleatorio entre
         * 1 y 100 Pedir al usuario numeros dentro de este rango (validar) Si el
         * usuario falla indicar si el numero es mayor o menor que el que debe
         * acertar. el programa termina cuando es usuario acierta
         */

        Scanner sc = new Scanner(System.in);
        int numUsuario; 
        int numSeleccionado = (int) (Math.random() * (100 - 0 + 1) + (0));

        boolean acerto = false;
        while (!acerto) {
            
            if (!acerto) {
                System.out.println("Introduzca un numero entre 0 y 100");
            }
            numUsuario = sc.nextInt();

            while (!(numUsuario >= 0 && numUsuario <= 100)) {
                System.out.println("Error, debe ser un numero entre o y 100");
                System.out.println("Introduzca un numero entre 0 y 100");
                numUsuario = sc.nextInt();
            }
            
            if (numSeleccionado > numUsuario) {
                System.out.println("EL NUMERO ES MAYOR QUE" + numUsuario);
            } else if (numSeleccionado < numUsuario) {
                System.out.println("EL NUMERO ES MENOR QUE" + numUsuario);
            } else {
                System.out.println("GANASTE, EL NUMERO ERA " + numSeleccionado);
                acerto = true;
            }

            

        }
    }

}
