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
public class RecorreCadenas {
    public static void main(String[] args) {
        //pide una cadena por consola y muestra sus caracteres uno a uno
        Scanner sc =  new Scanner(System.in);
        
        String cadena = sc.nextLine();
        
        
        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena.charAt(i));
            
        }
       
    }
    
}
