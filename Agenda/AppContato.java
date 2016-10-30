
/**
 *
 * @author victor_souzas@yahoo.com.br
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AppContato extends JFrame implements ActionListener {

    JFrame frame;
    JButton cadastrar = new JButton("Cadastro");
    JButton mostrar = new JButton("Mostar contatos");
    JButton busca = new JButton("Pesquisar");
    JButton telefone = new JButton("Modificar telefone");
    JButton excluir = new JButton("excluir");
    JButton sair = new JButton("sair");

    public static void main(String[] args) {
        AppContato app = new AppContato();
        app.go();
    }

    private void go() {
        frame = new JFrame("Agenda");
        frame.setSize(500, 300);
        JPanel panel = new JPanel();
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cadastrar.addActionListener(this);
        mostrar.addActionListener(this);
        busca.addActionListener(this);
        telefone.addActionListener(this);
        excluir.addActionListener(this);
        sair.addActionListener(this);
        panel.add(cadastrar);
        panel.add(mostrar);
        panel.add(busca);
        panel.add(telefone);
        panel.add(excluir);
        panel.add(sair);
        frame.setVisible(true);
    }

    public void adicionar() {
        String nome = JOptionPane.showInputDialog(frame, "Nome: ");
        String endereco = JOptionPane.showInputDialog(frame, "Endereco: ");
        String telefone = JOptionPane.showInputDialog(frame, "Telefone:");
        String email = JOptionPane.showInputDialog(frame, "E-mail:");
        Contato contato = new Contato(nome, endereco, email, telefone);
        GerenciaContato.adiciona(contato);
        JOptionPane.showMessageDialog(frame, "Contato adicionado com sucesso.");
    }

    public void pesquisar() {
        String nome = JOptionPane.showInputDialog(frame, "Entre o nome do contato: ");
        Contato contato = GerenciaContato.pesquisa(nome);
        if (contato != null) {
            JOptionPane.showMessageDialog(frame, contato.dados());
        } else {
            JOptionPane.showMessageDialog(frame, "Nao foi encontrado nenhum contato com o nome " + nome);
        }
    }

    public void telefone() {
        String nome = JOptionPane.showInputDialog(frame, "Entre o nome do contato: ");
        String telefone = JOptionPane.showInputDialog(frame, "Entre o novo numero de telefone: ");
        GerenciaContato.modificaTelefone(nome, telefone);
    }
    
    public void excluir() {
        String nome = JOptionPane.showInputDialog(frame, "Entre o nome do contato que deseja excluir:");
        GerenciaContato.exclui(nome);
    }
    public void mostrar(){
        JOptionPane.showMessageDialog(frame, GerenciaContato.dados());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cadastrar) {
            adicionar();
        } else if (e.getSource() == busca) {
            pesquisar();
        } else if (e.getSource() == telefone) {
            telefone();
        } else if (e.getSource() == excluir) {
            excluir();
        } else if(e.getSource() == mostrar) {
            mostrar();
        }
    }
}
