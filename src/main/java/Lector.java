import javax.swing.*;

public class Lector {
    private int entrada;
    private int contador = 2;

    public Lector(){}
    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }
    public int getContador() {return contador;}

    public void contarVueltas (){
        while (entrada > contador) {
            contador = contador + 1;
            System.out.println("numero de vueltas: "+contador);
        }

    }
}

