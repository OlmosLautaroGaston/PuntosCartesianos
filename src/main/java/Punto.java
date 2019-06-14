import java.text.DecimalFormat;
import java.util.Scanner;

public class Punto {
    private int init;
    private int end;
    private int[] arrx;
    private int[] arry;
    private int[] cont;
    private int firstEntrance;
    private double hypo;
    private double numMinimo = 1000000;

    Scanner scaner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.00");

    public Punto(int firstEntrance) {
        this.firstEntrance = firstEntrance;
        arrx = new int[firstEntrance];
        arry = new int[firstEntrance];
        cont = new int[firstEntrance];
    }

    public void generateXY() {
        for (int i = 0; i < firstEntrance; i++) {
            cont[i] = i + 1;
            System.out.println("Ingrese el valor de X del Punto < " + cont[i] + " >  ");
            arrx[i] = scaner.nextInt();
            System.out.println("Ingrese el valor de Y del Punto < " + cont[i] + " >  ");
            arry[i] = scaner.nextInt();
        }
    }

    public void calculateDistanceXY() {
        for (int i = 0; i < arrx.length-1; i++) {
            for (int j = i+1; j < arry.length; j++) {
                    hypo = Math.sqrt(Math.pow(arrx[i] - arrx[j], 2) + Math.pow(arry[i] - arry[j], 2));
                    calculateDistanceMIN(hypo,cont[j],cont[i]);
                    System.out.println("la distancia entre el punto " + cont[i] + " y " + cont[j] + " es < " + df.format(hypo)+" >");

            }
        }
        System.out.println("");
        System.out.println("La distancia más corta es < "+df.format(numMinimo)+" > entre los puntos < "+end+" > y < "+ init +" >");
    }
    private void calculateDistanceMIN(double hypo, int j,int i){
        if (numMinimo>hypo){
            numMinimo = hypo;
            init = j;
            end = i;
        }

    }
}
