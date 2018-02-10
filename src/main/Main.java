package main;

import mediator_interface.RankingMediator;
import concrete_mediator.RankingMediatorImpl;
import colleague_interface.Usuario;
import concrete_colleague.UsuarioAdmin;
import concrete_colleague.UsuarioComum;

/**
 *
 * @author Jhonatan
 */
public class Main {

    public static void main(String[] args) {
        RankingMediator rm = new RankingMediatorImpl();
        Usuario us1 = new UsuarioAdmin(rm, "Jhonatan");
        Usuario us2 = new UsuarioComum(rm, "Laura");
        Usuario us3 = new UsuarioComum(rm, "Priscila");
        Usuario us4 = new UsuarioAdmin(rm, "Leonardo");

        rm.addUsuario(us1);
        rm.addUsuario(us2);
        rm.addUsuario(us3);
        rm.addUsuario(us4);

        System.out.println("");
        us1.adicionar("Canudos", "celular, mochila");
        us2.adicionar("Batista Campos", "mochila");
        us3.adicionar("Marambaia", "carro");
        us4.adicionar("Reduto", "celular, moto");
        us4.adicionar("Marambaia", "computador");

        System.out.println("");
        us1.verLista_Cadastros();

        System.out.println("");
        us2.verLista_Cadastros();

        System.out.println("");
        us3.verLista_Cadastros();

        System.out.println("");
        us4.verLista_Cadastros();

        System.out.println("");
        rm.verRanking();
        
        System.out.println("");
        us2.listarTodos();
//        System.out.println("");
//        us1.listarTodos();
    }
}
