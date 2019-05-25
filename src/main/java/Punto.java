import java.util.Scanner;

public class Punto {
    private int x;
    private int y;
    private int[] arrx;
    private int[] arry;
    private int firstEntrance;
    private int counter=1;
    int hypo;

    Scanner scaner = new Scanner(System.in);

    public Punto(int firstEntrance) {
    this.firstEntrance=firstEntrance;
    arrx = new int[firstEntrance];
    arry = new int[firstEntrance];
    }

    public int generateXY(){
        for(int i=0;i<firstEntrance;i++){

            System.out.println("Ingrese el valor de X del punto "+counter+" : ");
            arrx[i] = scaner.nextInt();
            System.out.println("Ingrese el valor de Y del punto "+counter+" : ");
            arry[i] = scaner.nextInt();
            counter++;
        }
        return counter;
    }
    public void calculateDistanceXY(){
        for(int i=0;i<arrx.length;i++){
            for (int j=0;j<arry.length;j++){
                hypo = (int) Math.sqrt(Math.pow(arrx[i]+arry[i], 2) + Math.pow(arrx[j]+arry[j], 2));

                System.out.println("la distancia entre X e Y "+arrx[i]+" --- "+arry[j]+" es : "+hypo);
            }
        }
    }
    public void hipoXY(){

    }

  /**  public void passNumtoArrXY() {
        String str = (new Integer(entrance)).toString();
        char[] chArr = str.toCharArray();
        if (counter % 2 == 0) {
            for (int i = 0; i < chArr.length; i++) {
                arry[i] = Character.getNumericValue(chArr[i]);
                System.out.println("El numero se almaceno en el arreglo x: " + arry[i]);
            }
        } else {
            for (int i = 0; i < chArr.length; i++) {
                arrx[i] = Character.getNumericValue(chArr[i]);
                System.out.println("El numero se almaceno en el arreglo y: " + arrx[i]);
            }
        }
    }**/
}
