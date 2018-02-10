package entity;

/**
 *
 * @author Jhonatan
 */
public class Denunciante {

    private String nome;

    public Denunciante() {
    }

    public Denunciante(String nome) {
        this.nome = nome;
    }

    public static Denunciante criarDenunciante(String nome) {
        return new Denunciante(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
