package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradateclado = new Scanner(System.in);
        String dia;
        System.out.println("Introduce un dia de la semana");
         dia = entradateclado.next();

        switch(dia){
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("Es un dia laboral");
                break;
            case "sabado":
            case "domingo":
                System.out.println("Es un dia festivo");
            default:
                System.out.println("Introduce un dia de la semana");
        }
    }
}
