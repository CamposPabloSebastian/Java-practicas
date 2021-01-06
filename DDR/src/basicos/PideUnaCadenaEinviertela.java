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
public class PideUnaCadenaEinviertela {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("ingrese frase");
        String frase = sc.nextLine();
        String aux="";
        
        
        for (int i = frase.length()-1; i >= 0; i--) {
            aux += frase.charAt(i);
        }
        
        System.out.println(aux);
    }
}
