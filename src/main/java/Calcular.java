import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Calcular {
    public static void main(String[] args) {
        int [][] arreglo = new int[20][2];
        Lector lector = new Lector();
        Scanner scaner=new Scanner(System.in);
        Punto punto = new Punto();
        lector.contarVueltas();
        System.out.println("Introduzca la cantidad de puntos a evaluar");
        int e = scaner.nextInt();
        int x;
        int y;
        for (x=0;x<e;x++){
            for (y=0;y<2;y++) {
                System.out.println("dijite los elementos ["+x+"] y de ["+y+"]");
                arreglo[x][y]=scaner.nextInt();
            }
        }
        int [][] arrayacum = new int[20][2];
        for (x=0; x < arreglo.length; x++) {
            for (y=0; y < arreglo[x].length; y++) {
                if(y==0){
                    arrayacum[x][y] = arreglo[x][y]-arreglo[x][y+1];
                    punto.setX1(arrayacum[x][y]);
                }else{
                    arrayacum[x][y] = arreglo[x][y]-arreglo[x+1][y];
                    punto.setY1(arrayacum[x][y]);
                }
            }
        }
        for (int[]fila:arreglo){
            System.out.println();
            for (int z: fila){
                System.out.print(z +"");
            }
        }
        //JOptionPane.showMessageDialog(null, "La distancia entre los puntos \nA("+x1+","+y1+") y B("+x2+","+y2+") es ="+hipotenusa);
    }
}
