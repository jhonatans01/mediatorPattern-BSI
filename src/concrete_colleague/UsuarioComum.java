package concrete_colleague;

import colleague_interface.Usuario;
import mediator_interface.RankingMediator;

/**
 *
 * @author Jhonatan
 */
public class UsuarioComum extends Usuario {
    
    public UsuarioComum(RankingMediator rm, String den) {
        super(rm, den);
    }
    
    @Override
    public void adicionar(String bairro, String bens) {
        System.out.println("Ocorrência adicionada ao usuário " + den.getNome());
        rm.adicionarOcorrencia(bairro, bens, this);
    }
    
    @Override
    public void verLista_Cadastros() {
        System.out.println("Lista de ocorrências do(a) usuário(a) " + den.getNome());
        rm.listarOcorrencias(this);
    }
    
    @Override
    public void listarTodos(){
     rm.listarOcorrenciasTodos(this);
    }
}
