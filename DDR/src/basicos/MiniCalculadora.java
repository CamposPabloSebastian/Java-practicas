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
public class MiniCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        int opcion, num1,num2, resultado = 0;
        String respuesta;
        while (!salir) {
            
            System.out.println("ingrese primer valor");
            num1 = sc.nextInt();
            System.out.println("ingrese segundo valor");
            num2 = sc.nextInt();
            
            System.out.println("1. sumar ");
            System.out.println("2. restar");
            System.out.println("3. multiplicar");
            System.out.println("4. dividir");
            System.out.println("5. modulo");
            //System.out.println("6. salir");

            try {
                System.out.println("escribe una de las opciones");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        resultado = num1 + num2;
                        break;
                    case 2:
                        resultado = num1 - num2;
                        break;
                    case 3:
                        resultado = num1 * num2;
                        break;
                    case 4:
                        if(num2 == 0){
                            System.out.println("no se puede dividir por 0");
                        }else{
                            double div = (double)num1 / num2;
                            System.out.println("el resultdo es " + div);
                        }
                        break;
                    case 5:
                        resultado = num1 % num2;
                        break;
//                    case 6:
//                        salir = true;
//                        break;
                    default:
                        System.out.println("solo numeros entre 1 y 6");

                }
                if(opcion != 4){
                    System.out.println("el resultado es: " + resultado);
                }
                
            } catch (Exception e) {
                System.out.println("debe insetar un numero");
                sc.nextInt();
            }
            
            System.out.println("deseas continuar? S/N");
            respuesta = sc.next().toLowerCase().trim();
            
            if(respuesta.charAt(0) == 'n'){
                salir = true;
            }
        }
    }

}
