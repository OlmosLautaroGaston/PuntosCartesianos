import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Punto {
    private int init;
    private int end;
    private int[] arrx;
    private int[] arry;
    private int[] cont;
    private double hypo;
    private double numMinimo = 1000000;
    private int cantPoint;

    Scanner Scanner = new Scanner(System.in);
    Random Random = new Random();
    View View = new View();

    public Punto() {

    }

    public void setSizeArr() {
        cantPoint = firstEntrance();
        arrx = new int[cantPoint];
        arry = new int[cantPoint];
        cont = new int[cantPoint];
    }

    private int firstEntrance() {
        int firstEntrance = Scanner.nextInt();
        return firstEntrance;
    }

    public void generateXYaleatory() {
        for (int i = 0; i < cantPoint; i++) {
            cont[i] = i + 1;
            arrx[i] = Random.nextInt(1000000);
            arry[i] = Random.nextInt(1000000);
        }
    }

    public void generateXY() {
        for (int i = 0; i < cantPoint; i++) {
            cont[i] = i + 1;
            View.requestXValue(cont[i]);
            arrx[i] = Scanner.nextInt();
            View.requestYValue(cont[i]);
            arry[i] = Scanner.nextInt();
        }
    }

    public void calculateDistanceXY() {
        for (int i = 0; i < arrx.length - 1; i++) {
            for (int j = i + 1; j < arry.length; j++) {
                hypo = Math.sqrt(Math.pow(arrx[i] - arrx[j], 2) + Math.pow(arry[i] - arry[j], 2));
                calculateDistanceMIN(hypo, cont[j], cont[i]);
            }
        }
        View.calculateDistanceView(numMinimo, end, init);
    }

    private void calculateDistanceMIN(double hypo, int j, int i) {
        if (numMinimo > hypo) {
            numMinimo = hypo;
            init = j;
            end = i;
        }

    }
}
