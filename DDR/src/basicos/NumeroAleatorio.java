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
public class NumeroAleatorio {
    public static void main(String[] args) {
        /**
         * genera 10 numeros aleatorios entre 1 y 10
         */
        
        
        /**
         * genera numeros entre 0 y 10 incluidos. para excluir 10 pongo 10 en lugar de 11
         */
        int num;
        int max = 10;
        int min = 0;
        for (int i = 0; i < 10; i++) {
            num = (int) (Math.random() * 11);
            System.out.println(num);
        }
        
        /**
         * genera numeros dentro de un rango. Ambos incluidos
         */
        int num2;
        int max2 = 11;
        int min2 = 6;
        for (int i = 0; i < 10; i++) {
            num2 = (int) (Math.random() * (max2 - min2 + 1) + (min2));
            System.out.println("mun2 "+num2);
        }
        
    }
    
}
