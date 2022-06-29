package com.example.sofka.ejerciciojava;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[]args){
        Scanner caputre = new Scanner(System.in);
        System.out.println("Ingrese Sueldo Basico");
        String Sueldo = caputre.nextLine();
        System.out.println("Ingrese Area de trabajo: Sistemas / Contabilidad / Otra area ");
        String Area = caputre.nextLine();
        System.out.println("Ingrese Numero de hijos");
        int Hijos = caputre.nextInt();
        switch (Area){
            case "Sistemas":
                System.out.println("tendrá una bonificación del 25% sobre el básico");
                break;
            case "Contabildad":
                System.out.println("tendrá una bonificación del 20% sobre el básico");
                break;
            default:
                System.out.println("tendrá una bonificación del 10% sobre el básico");
                break;

        }
        if(Hijos >= 2){
            Double Bonificacion = Double.valueOf(Hijos * 150);
            System.out.println("Se otorgará una bonificación de 150 por cada hijo =" + "$" +Bonificacion);


        }
    }

}


//    Se ingresan el sueldo básico, área de trabajo y número de hijos.
//
//        Si el área ingresada es:
//        Sistemas tendrá una bonificación del 25% sobre el básico,
//        si es Contabilidad será del 20%,
//        En cualquier otra área, la bonificación será del 10%.
//        Además se otorgará una bonificación de 150 por cada hijo, sólo para aquellos empleados que tengan 2 hijos o más.
//        |Calcule el total a pagos
