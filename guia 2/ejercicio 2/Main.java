import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Carrera carrera = new Carrera(0);



        do {
            System.out.println("Ingrese largo de la pista ");

            carrera.setLongitud(scanner.nextInt());

        }while (carrera.getLongitud()!= 30 && carrera.getLongitud()!=20
                && carrera.getLongitud()!=15);

        while (carrera.getLongitud() > carrera.r1.getDistancia() &&
                carrera.getLongitud() > carrera.r2.getDistancia()){

            carrera.r1.setDistancia(carrera.r1.getSalto()+carrera.r1.getDistancia());
            carrera.r2.setDistancia(carrera.r2.getSalto()+ carrera.r2.getDistancia());

            System.out.println("Distancia recorrida por Rana "+ carrera.r1.getColor()+ "es " + carrera.r1.getDistancia());
            System.out.println("Distancia recorrida por Rana "+ carrera.r2.getColor()+ "es " + carrera.r2.getDistancia());

        }

        if(carrera.r1.getDistancia() > carrera.r2.getDistancia()){
            carrera.setGanadora(carrera.r1.getColor());
        }else
            {
            carrera.setGanadora(carrera.r2.getColor());
        }

        carrera.getGanadora();




    }

}
