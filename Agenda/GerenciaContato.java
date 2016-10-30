
/**
 *
 * @author victor_souzas@yahoo.com.br
 */

import java.util.ArrayList;

public class GerenciaContato {

    private static ArrayList<Contato> agenda = new ArrayList();

    public static void adiciona(Contato contato) {
        agenda.add(contato);
    }

    public static Contato pesquisa(String nome) {
        for (Contato contato : agenda) {
            if (contato.getNome().equals(nome)) {
                return contato;
            }
        }
        return null;
    }

    public static void exclui(String nome) {
        Contato busca;
        do {
            busca = pesquisa(nome);
            agenda.remove(busca);
        } while (busca != null);
    }

    public static void modificaTelefone(String nome, String telefone) {
        Contato busca = pesquisa(nome);
        int indice = agenda.indexOf(busca);
        agenda.get(indice).setTelefone(telefone);
    }

    public static String dados() {
        String retorno = "";
        for (Contato contato : agenda) {
            retorno += contato.dados();
        }
        return retorno;
    }
}
