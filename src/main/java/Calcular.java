import javax.swing.*;

public class Calcular {
    public static void main(String[] args) {

        Punto puntos = new Punto();
        double x1 = puntos.getX1();
        double x2 = puntos.getX2();
        double y1 = puntos.getY1();
        double y2 = puntos.getY2();
        double hipotenusa = puntos.calcularHipotenusa();


        JOptionPane.showMessageDialog(null, "La distancia entre los puntos \nA("+x1+","+y1+") y B("+x2+","+y2+") es ="+hipotenusa);
    }
}
