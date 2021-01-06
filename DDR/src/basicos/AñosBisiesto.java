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
public class AñosBisiesto {
    public static void main(String[] args) {
        //pide al usuario un año Numero eindica si es bisiesto o no.
        //Es biciesto cuando es divisible entre 4 y no por 100 o si es divisible entre 400
        int año = 2000;

        if((año % 4  == 0) && (año % 100 != 0) || (año % 400 == 0)){
            System.out.println("es bisiesto");
        }else System.out.println("no es bisiesto");
        
    }
}
