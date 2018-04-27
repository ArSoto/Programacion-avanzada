import java.util.Random;

public class Rana {

    private String duenio;
    private int distancia;
    private String color;
    private Random saltos= new Random();
    int saltar;


    public Rana(String duenio,  String color, int distancia) {
        this.duenio = duenio;
        this.color = color;
        this.distancia = distancia;

    }

    public String getColor() {
        return color;
    }

    public void setDistancia(int distancia) {

        this.distancia = distancia;
    }

    public int getDistancia() {
        return distancia;
    }

    public int getSalto(){
        saltar = saltos.nextInt(3)+1;
        System.out.println("Rana "+ this.color + " salta "+ saltar + " espacios");
        return (saltar);

    }
}
