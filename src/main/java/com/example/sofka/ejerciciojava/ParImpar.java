package com.example.sofka.ejerciciojava;

import java.util.Scanner;

public class ParImpar {

    public static void main (String[]args){
        Scanner caputre = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int Numero = caputre.nextInt();

        if(Numero % 2==0){
            System.out.println("Numero PAR");

        }else{
            System.out.println("Numero IMPAR");

        }
    }
}
//    Programa Java que lea un número entero por teclado y calcule si es par o impar.
//
//        Podemos saber si un número es par o si el resto de dividir el número entre 2 es igual a cero. En caso contrario el número es impar
//
//        El operador Java que calcula el resto de la división entre dos números enteros o no es el operador %
