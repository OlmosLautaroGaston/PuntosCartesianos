public class Punto {
    private int x;
    private int y;

    public Punto(int x, int y) {
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x=x;
    }
    public void setY(int y) {
        this.y=y;
    }
    public int calcularDistanciaDesde(Punto parametros) {
        int cateto1 = x = parametros.getX();
        int cateto2 = y = parametros.getY();
        int hipotenusa = (int) Math.sqrt(cateto1*cateto1 + cateto2*cateto2);
        return hipotenusa;
    }
    public String toString(){
        return "(x= " + getX() + ", y= " + getY() +"  )";
    }
}
