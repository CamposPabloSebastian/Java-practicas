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
public class PrecioConIva {
    public static void main(String[] args) {
        /**
         * pide un numero real que represente un precio y calcula el iva
         */
        
        float precio = 12.67F;
        int iva = 21;
        float result = precio * iva /100;
        
        System.out.println("el iva es de " + result);
        System.out.println("el total es de " + (result + precio));
        
    }
}
