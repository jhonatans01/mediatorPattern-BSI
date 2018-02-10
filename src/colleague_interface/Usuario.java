package colleague_interface;

import mediator_interface.RankingMediator;
import entity.Denunciante;

/**
 *
 * @author Jhonatan
 */
public abstract class Usuario {

    protected RankingMediator rm;
    protected Denunciante den;

    public Denunciante getDen() {
        return den;
    }

    public Usuario(RankingMediator rm, String den) {
        this.rm = rm;
        this.den = Denunciante.criarDenunciante(den);
    }

    public abstract void adicionar(String bairro, String bens);

    public abstract void verLista_Cadastros();
    
    public abstract void listarTodos();

}
