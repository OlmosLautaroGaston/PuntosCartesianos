import javax.swing.*;

public class Punto {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double hipotenusa;

    public Punto() {
        this.setX1(x1);
        this.setY1(y1);
        this.setX2(x2);
        this.setY2(y2);
    }
    public void puntoVuelta(){
        this.setX2(x2);
        this.setY2(y2);
    }
    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese x del punto A:"));
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese y del punto A:"));
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese x del punto B:"));
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese y del punto B:"));
    }
    public double calcularHipotenusa() {
        hipotenusa = Math.hypot(x2-x1, y2-y1);
        return hipotenusa;
    }
}
