package concrete_mediator;

import colleague_interface.Usuario;
import concrete_colleague.UsuarioAdmin;
import mediator_interface.RankingMediator;
import entity.Ocorrencia;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Jhonatan
 */
public class RankingMediatorImpl implements RankingMediator {

    private List<Usuario> usuarios;
    private List<Ocorrencia> ocorrencias;

    public RankingMediatorImpl() {
        this.usuarios = new ArrayList<>();
        this.ocorrencias = new ArrayList<>();
    }

    @Override
    public void adicionarOcorrencia(String bairro, String bens, Usuario us) {
        ocorrencias.add(new Ocorrencia(us.getDen(), bairro, bens));
    }

    @Override
    public void addUsuario(Usuario us) {
        this.usuarios.add(us);
        System.out.println("Usuário " + us.getDen().getNome() + " adicionado");
    }

    @Override
    public void verRanking() {

        Map<String, Float> map = new HashMap<>();
        for (int i = 0; i < ocorrencias.size(); i++) {
            String bairro = ocorrencias.get(i).getBairro();
            if (map.containsKey(bairro)) {
                map.put(bairro, (float) map.get(bairro) + 1);
            } else {
                map.put(bairro, (float) 1);
            }
        }
        for (Map.Entry<String, Float> maps : map.entrySet()) {
            map.put(maps.getKey(), maps.getValue() * 100 / ocorrencias.size());
            System.out.printf("\n%s ---- %.2f%% ", maps.getKey(), maps.getValue());
        }

    }

    @Override
    public void listarOcorrencias(Usuario us) {
        for (Ocorrencia oc : ocorrencias) {
            if (oc.getDenunciante().getNome() == us.getDen().getNome()) {
                System.out.println("*------------");
                System.out.println("Bairro: " + oc.getBairro());
                System.out.println("Bens: " + oc.getBens());
            }
        }
    }

    @Override
    public void listarOcorrenciasTodos(Usuario us) {
        if (us instanceof UsuarioAdmin) {
            System.out.println("\n\nLista de Ocorrências");
            for (Usuario usuario : usuarios) {
                System.out.println("");
                System.out.println("*------------");
                System.out.println("Usuário: " + usuario.getDen().getNome());
                for (Ocorrencia oc : ocorrencias) {
                    if (oc.getDenunciante().getNome().equals(usuario.getDen().getNome())) {
                        System.out.println("Bairro: " + oc.getBairro());
                        System.out.println("Bens: " + oc.getBens());
                        System.out.println("");
                    }
                }
            }
        } else {
            System.out.printf("\nO usuário %s não é administrador\n", us.getDen().getNome());
        }
    }

}
