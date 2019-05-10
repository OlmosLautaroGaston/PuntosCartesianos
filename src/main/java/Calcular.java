import javax.swing.*;

public class Calcular {
    public static void main(String[] args) {
        double x1,x2,y1,y2;

        x1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese x del punto A:"));


        y1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese y del punto A:"));


        x2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese x del punto B:"));


        y2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese y del punto B:"));
        double d;

       d = Math.hypot(x2-x1, y2-y1);
        JOptionPane.showMessageDialog(null, "La distancia entre los puntos \nA("+x1+","+y1+") y B("+x2+","+y2+") es ="+d);
    }
}
