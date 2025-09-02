import java.awt.*;
import javax.swing.*;

public class CadastroIdosoScreen extends JFrame {
    private JTextField txtNome, txtEmail, txtCelular, txtNascimento, txtSexo, txtPeso, txtAltura;
    private JPasswordField txtSenha, txtConfirmaSenha;
    private JCheckBox chkTermos;

    public CadastroIdosoScreen() {
        setTitle("Cadastro Idoso");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLocationRelativeTo(null);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        JLabel title = new JLabel("Cadastro Idoso", SwingConstants.CENTER);
        title.setFont(new Font("SansSerif", Font.BOLD, 22));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(title);

        txtNome = criarCampo("Nome:");
        txtEmail = criarCampo("Email:");
        txtCelular = criarCampo("Celular:");
        txtNascimento = criarCampo("Data de Nascimento:");
        txtSexo = criarCampo("Sexo:");
        txtSenha = criarSenha("Senha:");
        txtConfirmaSenha = criarSenha("Confirme a senha:");
        txtPeso = criarCampo("Peso:");
        txtAltura = criarCampo("Altura:");

        chkTermos = new JCheckBox("Aceito os termos e política");
        add(chkTermos);

        JButton btnCriarConta = criarBotao("CRIAR CONTA");
        btnCriarConta.addActionListener(e -> criarConta());

        add(btnCriarConta);
        setVisible(true);
    }

    private JTextField criarCampo(String label) {
        add(rotulo(label));
        JTextField campo = new JTextField();
        campo.setMaximumSize(new Dimension(300, 30));
        add(campo);
        return campo;
    }

    private JPasswordField criarSenha(String label) {
        add(rotulo(label));
        JPasswordField campo = new JPasswordField();
        campo.setMaximumSize(new Dimension(300, 30));
        add(campo);
        return campo;
    }

    private JLabel rotulo(String texto) {
        JLabel lbl = new JLabel(texto);
        lbl.setAlignmentX(Component.LEFT_ALIGNMENT);
        return lbl;
    }

    private JButton criarBotao(String texto) {
        JButton botao = new JButton(texto);
        botao.setBackground(new Color(0, 122, 255));
        botao.setForeground(Color.WHITE);
        botao.setAlignmentX(Component.CENTER_ALIGNMENT);
        return botao;
    }

    private void criarConta() {
        if (!chkTermos.isSelected()) {
            JOptionPane.showMessageDialog(this, "Você deve aceitar os termos!");
            return;
        }
        if (!String.valueOf(txtSenha.getPassword()).equals(String.valueOf(txtConfirmaSenha.getPassword()))) {
            JOptionPane.showMessageDialog(this, "As senhas não coincidem!");
            return;
        }

        JOptionPane.showMessageDialog(this, "Cadastro do idoso realizado com sucesso!");
        dispose();
        new LoginScreen();
    }
}
