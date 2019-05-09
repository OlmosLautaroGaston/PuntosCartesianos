public class Calcular {
    public static void main(String[] args) {
        Punto p1 = new Punto(15,25);
        Punto p2 = new Punto(35,50);

//calculo de la distancia entre dos puntos
        double distancia = p1.calcularDistanciaDesde(p2);
        System.out.println("La distancia de p1 a p2 es: " + distancia);
    }
}
