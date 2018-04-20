
public class Candidatos {

    private String candidato;
    private int votos;

    public Candidatos(String candidato, int votos) {
        this.candidato = candidato;
        this.votos = votos;

    }

    //setters

    public void setCandidato(String candidato) {
        this.candidato = candidato;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    // Getters

    public String getCandidato() {
        return candidato;
    }    public int getVotos() {
        return votos;
    }

}
