package com.example.sofka.ejerciciojava;

import java.util.Scanner;

public class MillasKilometros {
    public static void main(String[] args) {

        int millas;
        double km;
        do {
            Scanner capture = new Scanner(System.in);
            System.out.println("Introduce las millas que quieras pasar a Kilometros , con el 0 sales del programa.");
            millas = capture.nextInt();

            if (millas != 0) {
                km = millas * 1.6093;
                System.out.println(km);
            }

        } while (millas != 0);
    }

}




//    Programa Java que convierte millas a kilómetros. El programa pide que se introduzca una cantidad de
//    millas y calcula y muestra su equivalente en Kilómetros.
//    El proceso se repite hasta que se introduzca un 0 como valor para las millas.
//        1 Milla equivale a 1.6093 Kilómetros.
//        El valor de los KM resultantes se debe mostrar con dos decimales.
