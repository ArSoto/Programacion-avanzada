import java.util.Random;

public class Main {

    public static void main(String[] args){

        Random random = new Random();
        Termometro t1 = new Termometro(0,0);

        System.out.println("La primera agitacion da "+ random.nextInt(11)+ "°");
        t1.setGrados(random.nextInt(5)+35);
        System.out.println("La primera medicion da "+ t1.getGrados());
        t1.setPromedio(t1.getPromedio()+t1.getGrados());
        System.out.println("La segunda agitacion da "+ random.nextInt(11)+ "°");
        t1.setGrados(random.nextInt(5)+35);
        System.out.println("La segunda medicion da "+ t1.getGrados());
        t1.setPromedio(t1.getPromedio()+t1.getGrados());
        System.out.println("El promedio de temperatura es"+ t1.getPromedio()/2.0);








    }
}
