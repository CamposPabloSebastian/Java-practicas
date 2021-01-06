/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicos;

import java.util.Scanner;

/**
 *
 * @author pscam
 */
public class CalcularSueldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * pedir un salario un puesto por consola y  calcula el salario segun lo sig:
         * 
         * Si es vendedor cobra 500 mas
         * si es director 1000 mas
         * si es conserje 100 mas
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese salario");
        double salarioBase = sc.nextDouble();

        System.out.println("ingrese puesto");
        String puesto = sc.next().toUpperCase().trim();

        boolean existe = false;
        for (PuestoTrabajo p : PuestoTrabajo.values()) {
            if (puesto.equals(p.name())) {
                existe = true;
            }
        }

        if (existe) {
            double salarioFinal = salarioBase;
            PuestoTrabajo p = PuestoTrabajo.valueOf(puesto);
            switch (p) {
                case VENDEDOR:
                    salarioFinal += 500;
                    break;

                case DIRECTOR:
                    salarioFinal += 1000;
                    break;

                case CONSERJE:
                    salarioFinal += 100;
                    break;

            }
            System.out.println("el salario final es: " + salarioFinal);
        } else {
            System.out.println("no existe");
        }
    }

}
