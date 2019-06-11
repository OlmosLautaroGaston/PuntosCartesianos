import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Calcular {
    public static void main(String[] args) {
        System.out.println("Ingrese puntos en el eje cartesiano.");
        System.out.println("basado en los puntos dictados obtendremos los dos más cercanos(Distancia Mínima).");
        /**Generamos un scanner que nos permite leer el numero de punto que deseamos crear**/
        Scanner scaner=new Scanner(System.in);
        System.out.println("Cuantos puntos desea crear? ");
        int cantPoint = scaner.nextInt();
        /**Instanciamos la clase Punto, en su controlador nos pide la cantidad de Puntos que deseamos crear**/
            Punto point = new Punto(cantPoint);
            point.generateXY();
            point.calculateDistanceXY();
    }
}