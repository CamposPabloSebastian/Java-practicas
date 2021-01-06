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
public class HorasMinutosSegundos {
    public static void main(String[] args) {
        /**
         * pide un numero en segundo y calcula cuantas hotas min y seg son0
         */
        int valor = 90;
        
        int horas = valor / 3600;
        int resto = valor % 3600;
        int min = (resto / 60);
        int segundos = resto % 60;
        
        
        System.out.println("horas " + horas);
        System.out.println("min " + min);
        System.out.println("seg " + segundos);
        System.out.println(horas+":"+min+":"+segundos);
    }
   
}
