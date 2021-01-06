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
public class Palindromo {

    public static void main(String[] args) {

        /**
         * pide una frase por consola e indica si es palindromo. Es palindromo
         * cuando se lee igual de izq-der que de der-izq == alola
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese frase");
        String frase = sc.nextLine().trim();
        String aux = "";

        for (int i = frase.length() - 1; i >= 0; i--) {
            aux += frase.charAt(i);
        }
        boolean palindromo = false;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == aux.charAt(i)) {
                palindromo = true;
            }
        }

//        if(palindromo){
//            System.out.println("es palindromo");
//        }else{
//            System.out.println("no es palindromo");
//        }

//TODO LO COMENTADO EQUIVAÑLE A AHCAR UN EQUALS
        if (frase.equals(aux)) {
             System.out.println("es palindromo");
        } else {
            System.out.println("no es palindromo");
        }
        
        System.out.println (aux);
    }
}
