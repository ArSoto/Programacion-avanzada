import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Candidatos a1, a2, a3;
        Scanner scanner;
        int total = 0, nulos=0;
        String voto;



        a1 = new Candidatos("Kathie", 0);
        a2 = new Candidatos("Francisca", 0);
        a3 = new Candidatos("Felipe", 0);

        scanner = new Scanner(System.in);


        do{
            System.out.println("Escriba el nombre \n (1) kathie" +
                "\n (2) Francisca \n (3) Felipe");
            voto = scanner.nextLine();


            switch (voto){

                case "Kathie": a1.setVotos(a1.getVotos()+1); total=total+1; break;
                case "Francisca": a2.setVotos(a2.getVotos()+1) ;total=total+1; break;
                case "Felipe": a3.setVotos(a3.getVotos()+1); total=total+1; break;
                case "f":break;
                default: nulos+=1; total+=1;break;

            }


        }while (!voto.equals("f"));



        //buscar al mayor

        if(a1.getVotos() > a2.getVotos() && a1.getVotos() > a3.getVotos()){
            System.out.println("El ganador es " + a1.getCandidato() + " con " + a1.getVotos() + " votos");

        }

        if(a2.getVotos() > a1.getVotos() && a2.getVotos() > a3.getVotos()){
            System.out.println("El ganador es " + a2.getCandidato() + " con " + a2.getVotos() + " votos");
        }

        if(a3.getVotos() > a1.getVotos() && a3.getVotos() > a2.getVotos()){
            System.out.println("El ganador es " + a3.getCandidato() + " con " + a3.getVotos() + " votos");
        }

        System.out.println("\n Tabla de porcentaje \n"+ a1.getCandidato()+ " Votos " + a1.getVotos() +" "+ (a1.getVotos()/total*100) + "%\n"
                + a2.getCandidato()+ " Votos " + a2.getVotos() +" "+ (a2.getVotos()/total*100) + "%\n"+
                a3.getCandidato()+ " Votos " + a3.getVotos() +" "+ (a3.getVotos()/total*100) + "%\n");

        System.out.println("Total de votos emitidos " + total+ "\n votos nulos "+ nulos);






    }



}
