import java.util.Random;
public class Termometro {

    private float promedio;
    private int grados;


    public Termometro(float promedio, int grados) {
        this.promedio = promedio;
        this.grados = grados;

    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public int getGrados() {
        return grados;
    }

    public void setGrados(int grados) {
        this.grados = grados;
    }
}
