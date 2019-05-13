import javax.swing.*;

public class Lector {
    private int entrada;
    private int contador = 2;

    public Lector(){
        this.setEntrada(entrada);
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de puntos a medir:"));
    }
    public void contarVueltas (){
        while (entrada > contador) {
            contador = contador + 1;
            System.out.println("numero de vueltas: "+contador);
        }

    }
}

