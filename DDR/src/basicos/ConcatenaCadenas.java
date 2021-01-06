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
public class ConcatenaCadenas {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        
        
        System.out.println("ingresa palabra");
        String palabras = "";
        String aux=sc.nextLine();;
        
        while(!aux.isEmpty()){
            System.out.println("ingresa nueva palabra");
             palabras += " " + aux;
            aux = sc.nextLine();
           
        }
        System.out.println(palabras);
    }
}
