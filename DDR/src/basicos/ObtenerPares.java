/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicos;

/**
 *
 * @author Gestel-Bcn-21
 */
public class ObtenerPares {
    public static void main(String[] args) {
        //obtener numeros pares entre 2 y 10 (while y for)
        
        for(int i = 0; i <= 10; i++){
            if(i % 2 == 0){
                System.out.println(i + " es par con for");
            }
        }
        
        System.out.println("");
        int i = 0;
        while(i<= 10){
            if(i % 2 == 0){
                System.out.println(i + " es par con while");
            }
            i++;
        }
        
        
    }
}
