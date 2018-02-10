package entity;

/**
 *
 * @author Jhonatan
 */
public class Ocorrencia {

    private String bairro;
    private String bens;
    private Denunciante denunciante;

    public Ocorrencia() {
    }

    public Ocorrencia(Denunciante denunciante, String bairro, String bens) {
        this.denunciante = denunciante;
        this.bairro = bairro;
        this.bens = bens;
    }

    public Denunciante getDenunciante() {
        return denunciante;
    }

    public void setDenunciante(Denunciante denunciante) {
        this.denunciante = denunciante;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getBens() {
        return bens;
    }

    public void setBens(String bens) {
        this.bens = bens;
    }

}
