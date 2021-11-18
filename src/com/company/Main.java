package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*Pedir numero
	* Leer numero
	* SI(numero<0)
	*   numero=numero*(-1)
	* FINSI
	* Escribir resultado*/


        Scanner scan = new Scanner(System.in);
        int numero = 0;
        System.out.println("Escriba un número para hallar su valor absoluto");
        numero = scan.nextInt();
        if (numero < 0) {
            numero = -1 * numero;
        }
        System.out.println("El valor absoluto del número es" + " " + numero);
    }
}
