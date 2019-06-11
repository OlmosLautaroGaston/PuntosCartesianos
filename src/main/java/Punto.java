import java.util.Scanner;

public class Punto {
    private int x;
    private int y;
    private int[] arrx;
    private int[] arry;
    private int[] cont;
    private int firstEntrance;
    private double hypo;
    private double numMinimo = 1000000;

    Scanner scaner = new Scanner(System.in);

    public Punto(int firstEntrance) {
        this.firstEntrance = firstEntrance;
        arrx = new int[firstEntrance];
        arry = new int[firstEntrance];
        cont = new int[firstEntrance];
    }

    public void generateXY() {
        for (int i = 0; i < firstEntrance; i++) {
            cont[i] = i + 1;
            System.out.println("Ingrese el valor de X del punto " + cont[i] + " : ");
            arrx[i] = scaner.nextInt();
            System.out.println("Ingrese el valor de Y del punto " + cont[i] + " : ");
            arry[i] = scaner.nextInt();
        }
    }

    public void calculateDistanceXY() {
        for (int i = 0; i < arrx.length; i++) {
            for (int j = 0; j < arry.length; j++) {
                if (cont[i] != cont[j]) {
                    hypo = Math.sqrt(Math.pow(arrx[i] - arrx[j], 2) + Math.pow(arry[i] - arry[j], 2));
                    calculateDistanceMIN(hypo,cont[j],cont[i]);
                    System.out.println("la distancia entre el punto " + cont[j] + " y " + cont[i] + " es :" + hypo);
                }
            }
        }
        System.out.println("La distancia más corta es < "+numMinimo+" > entre los puntos < "+y+" >,< "+x+" >");
    }
    public void calculateDistanceMIN(double hypo, int j,int i){
        if (numMinimo>hypo){
            numMinimo = hypo;
            x = j;
            y = i;
        }

    }
}
