public class Carrera {

    private int longitud;
    private String ganadora;

    Rana r1 = new Rana("Juanito", "verde", 0);
    Rana r2 = new Rana("Kong", "Roja",0);

    public Carrera(int longitud) {
        this.longitud = longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setGanadora(String ganadora) {
        this.ganadora = ganadora;
    }

    public String getGanadora() {
        System.out.println("\n LA GANADORA ES " +this.ganadora);
        return ganadora;
    }
}
