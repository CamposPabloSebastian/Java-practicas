/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mi_biblioteca;

import java.util.Scanner;

/**
 *
 * @author pscam
 */
public class Mi_Biblioteca {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        /**
         * genera numeros entre 0 y 10 incluidos. para excluir 10 pongo 10 en
         * lugar de 11
         */
        int num;
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
            System.out.println("mun2 " + num2);
        }
    }

    /**
     * funcion/metodo que genera un numero aleatorio dentro de un rango, ambos 
     * incluidos
     *
     * @param min valor minimo
     * @param max valor maximo
     * @return numero aleatorio
     */
    public static int dameNumAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + (min));
    }

    /**
     * funcion/metodo que valida numero entre 2 valores
     *
     * @param min valor minimo del rango
     * @param max valor maximo del rango
     * @return el valor validado
     */
    public static int validarNumero(int min, int max) {
        if (min > max) {
            int aux = min;
            min = max;
            max = aux;
        }
        
        int numero;
        do {
            System.out.println("ingresa numero");
            numero = sc.nextInt();

            if (!(numero >= min && numero <= max)) {
                System.out.println("debes ingresar numero entre " + min + " y " + max);
            }
        } while (!(numero >= min && numero <= max));
        return numero;
    }
    
    /**
     * funcion/metodo que nos informa si una cadena es palindromo
     * @param cadena a verificar
     * @return true si es palindromo, de lo contrario false
     */
    public static boolean esPalindromo(String cadena) {
        cadena = cadena.toLowerCase().trim();
        String cadInvertida = invertirCadena(cadena);
        if (cadena.equals(cadInvertida)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * funcion/metodo que Invierte cadena
     *
     * @param cadena string quye queremos invertir
     * @return cadena invertida
     */
    public static String invertirCadena(String cadena) {
        String invertida = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            invertida += cadena.charAt(i);
        }
        return invertida;
    }
    
    /**
     * procedimiento que muestra los digitos de un numero
     * @param num valor que vamos a separar en digitos
     */
    public static void mostrarDigitosNumero(int num){
        final int DIVISOR = 10;
        int digito;
        for(int i = num; i > 0; i/=DIVISOR){
            digito = i % DIVISOR;
            System.out.println(digito);
        }
    }
    
    /**
     * funcion/metodo que cuenta las mayusculas o minusculas de una cadena dependiendo
     * del segundo argumento
     * @param cadena cadena que queremos contar sus letras
     * @param tipo true si contamos las mayusculas, false contamos minusculas
     * @return cantidad de letras
     */
    public static int cuentaLetras(String cadena, boolean tipo) {
        int contadorMinus=0, contadorMayus=0;

            for (int i = 0; i < cadena.length(); i++) {
                if(cadena.charAt(i) >= 'A' && cadena.charAt(i) <= 'Z'){
                    contadorMayus++;
                }else if(cadena.charAt(i) >= 'a' && cadena.charAt(i) <= 'z'){
                    contadorMinus++;
                }
            }
            return tipo? contadorMayus: contadorMinus;
            //¿que es tipo?? es verdadero? -> return mayus, es false? -> retur minus
    }
    
    /**
     * procedimiento que nos muestra el digoto mas alto de un numero
     * @param num numero a verificar
     */
    public static void mostrarDigitoMasAlto(int num){
        final int DIVISOR = 10;
        int digito;
        int mayor = 0;
        for(int i = num; i > 0; i/=DIVISOR){
            digito = i % DIVISOR;
            if(digito > mayor){
                mayor = digito;
            }
        }
        System.out.println(mayor);
    }
    
     /**
     * funcion/metodo que cuenta las cifras de un numero
     * @param num numero pasdo
     * @return cantidad de cifras
     */
    public static int contarCifras(int num){
        final int DIVISOR = 10;
        int contador = 0;
        for(int i = num; i > 0; i/=DIVISOR){
            contador++;
        }
        return contador;
    }
    
    /**
     * funcion/metodo que devuelve un array con las cifras de un numero
     * ej: si pasamos 25 muestras 2, 5.
     * si en el for ponemos ->> for(int i = num, j = 0 ; i > 0; i/=DIVISOR, j++){
     * al pasar 25 nos devuelde 5, 2.
     * 
     * @param num numero pasado
     * @return array con las cifras
     */
    public static int[] mostrarDigitosNumero2(int num){
        int array[] = new int[contarCifras(num)];
        final int DIVISOR = 10;
        int digito;
        for(int i = num, j=array.length-1; i > 0; i/=DIVISOR, j--){
            digito = i % DIVISOR;
            array[j] = digito; 
        }
        return array;
    }

}
