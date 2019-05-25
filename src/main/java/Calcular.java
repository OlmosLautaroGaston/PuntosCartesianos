import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Calcular {
    public static void main(String[] args) {
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