import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Calcular {
    public static void main(String[] args) {
        /** Instanciamos las clases necesarioas **/
        Scanner Scanner = new Scanner(System.in);
        View View = new View();
        Punto Point = new Punto();
        int exResp;
        /**Generamos el menu**/
        View.menu();
        do {
            exResp = Scanner.nextInt();
            switch (exResp){
                case 1:
                    View.firsEntranceView();
                    Point.setSizeArr();
                    Point.generateXYaleatory();
                    break;
                case 2:
                    View.firsEntranceView();
                    Point.setSizeArr();
                    Point.generateXY();
                    break;
                default:
                    View.responseError();
                    break;
            }
        }while(exResp != 2 && exResp !=1);
        Point.calculateDistanceXY();
    }

}