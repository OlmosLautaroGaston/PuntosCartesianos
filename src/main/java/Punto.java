public class Punto {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double hipotenusa;

    public Punto() {
        this.setX1(getX1());
        this.setX2(getX2());
        this.setY1(getY1());
        this.setY2(getY2());
    }


    public double calcularHipotenusa() {
        hipotenusa = Math.hypot(getX2() - getX1(), getY2() - getY1());
        return hipotenusa;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
        System.out.println("el valor de x es"+x1);
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
        System.out.println("el valor de y es"+y1);
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
        System.out.println("el valor de x2 es"+x2);

    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
        System.out.println("el valor de y2 es"+y2);

    }
}
