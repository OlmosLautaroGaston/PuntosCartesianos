import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Calcular {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        Punto point = new Punto();
        int exResp;
        System.out.println("Ingrese puntos en el eje cartesiano.");
        System.out.println("basado en los puntos dictados obtendremos los dos más cercanos(Distancia Mínima).");
        System.out.println("1 - Para generar numeros aleatorios hasta 100.000 y calcular ");
        System.out.println("2 - Para ingresar los puntos manualmente X e Y");
        System.out.println("");

        do {
            exResp = scaner.nextInt();
            switch (exResp){
                case 1:
                    point.setSizeArr();
                    point.generateXYaleatory();
                    break;
                case 2:
                    point.setSizeArr();
                    point.generateXY();
                    break;
                default:
                    System.out.println("¡ERROR!");
                    System.out.println("El numero ingresado es incorrecto");
                    break;
            }
        }while(exResp != 2 && exResp !=1);
        point.calculateDistanceXY();
    }

}