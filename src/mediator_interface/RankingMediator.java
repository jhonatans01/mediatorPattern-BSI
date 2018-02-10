package mediator_interface;

import colleague_interface.Usuario;

/**
 *
 * @author Jhonatan
 */
public interface RankingMediator {

    void adicionarOcorrencia(String bairro, String bens, Usuario us);

    void addUsuario(Usuario us);

    void verRanking();

    void listarOcorrencias(Usuario us);
    
    void listarOcorrenciasTodos(Usuario us);
}
