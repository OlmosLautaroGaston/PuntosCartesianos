import java.text.DecimalFormat;

public class View {

    DecimalFormat Df = new DecimalFormat("#.00");

    public View(){
    }
    public void menu(){
        System.out.println("Ingrese puntos en el eje cartesiano.");
        System.out.println("basado en los puntos dictados obtendremos los dos más cercanos(Distancia Mínima).");
        System.out.println("1 - Para generar numeros aleatorios hasta 1.000.000 y calcular ");
        System.out.println("2 - Para ingresar los puntos manualmente X e Y");
    }
    public void responseError(){
        System.out.println("¡ERROR!");
        System.out.println("El numero ingresado es incorrecto");
    }
    public void firsEntranceView(){
        System.out.println("Cuantos puntos desea crear? ");
    }
    public void calculateDistanceView(double numMinimo,int end,int init){
        System.out.println("");
        System.out.println("La distancia más corta es < " + Df.format(numMinimo) + " > entre los puntos < " + end + " > y < " + init + " >");
    }
    public void requestXValue(int contX){
        System.out.println("Ingrese el valor de X del Punto < " + contX + " >  ");
    }
    public void requestYValue(int contY){
        System.out.println("Ingrese el valor de X del Punto < " + contY + " >  ");
    }
    public void resultTimeEx(float time){System.out.println("Tiempo de ejecución en segundos: " + time); }
}
