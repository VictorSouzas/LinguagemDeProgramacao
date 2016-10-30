
/**
 *
 * @author victor_souzas@yahoo.com.br
 */
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AppAnimal extends JFrame implements ActionListener {

    JFrame frame;
    JButton cadastrar;
    JButton pesquisar;
    JButton exibir;
    JPanel painel;

    public static void main(String[] args) {
        AppAnimal app = new AppAnimal();
        app.go();
    }

    private void go() {
        frame = new JFrame();
        JPanel label = new JPanel();
        cadastrar = new JButton("Cadastar");
        pesquisar = new JButton("Pesquisar");
        exibir = new JButton("Exibir");
        cadastrar.addActionListener(this);
        pesquisar.addActionListener(this);
        exibir.addActionListener(this);
        label.add(cadastrar);
        label.add(pesquisar);
        label.add(exibir);
        frame.setLayout(new BorderLayout());
        frame.add(label, BorderLayout.SOUTH);
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    public void adicionar(){
        String nome = JOptionPane.showInputDialog(frame, "Entre o nome do seu animal: ");
        String cor = JOptionPane.showInputDialog(frame, "Entre a cor de seu animal: ");
        String raca = JOptionPane.showInputDialog(frame, "Entre a raca de seu animal: ");
        int ano = Integer.parseInt(JOptionPane.showInputDialog(frame, "Entre o ano de nascimento: "));
        
        GerenciaAnimal.Adicionar(new Animal(nome, raca, cor, ano));
    }
    public void pesquisar(){
        String raca = JOptionPane.showInputDialog(frame, "Entre a raca a ser pesquisada");
        JOptionPane.showMessageDialog(frame, GerenciaAnimal.qntRaca(raca));
    }
    public void exibir() {
        JOptionPane.showMessageDialog(frame, GerenciaAnimal.dados());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cadastrar) {
            adicionar();
        } else if(e.getSource() == pesquisar) {
            pesquisar();
        } else if(e.getSource() == exibir){
            exibir();
        }
    }
}
