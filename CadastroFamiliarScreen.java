import java.awt.*;
import javax.swing.*;

public class CadastroFamiliarScreen extends JFrame {
    private JTextField txtNome, txtEmail, txtCelular, txtCpfIdoso, txtParentesco;
    private JPasswordField txtSenha, txtConfirmaSenha;
    private JCheckBox chkTermos;

    public CadastroFamiliarScreen() {
        setTitle("Cadastro Familiar");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 450);
        setLocationRelativeTo(null);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        JLabel title = new JLabel("Cadastro Familiar", SwingConstants.CENTER);
        title.setFont(new Font("SansSerif", Font.BOLD, 22));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(title);

        txtNome = criarCampo("Nome:");
        txtEmail = criarCampo("Email:");
        txtCelular = criarCampo("Celular:");
        txtSenha = criarSenha("Senha:");
        txtConfirmaSenha = criarSenha("Confirme a senha:");
        txtCpfIdoso = criarCampo("CPF do idoso:");
        txtParentesco = criarCampo("Parentesco:");

        chkTermos = new JCheckBox("Aceito os termos e política");
        add(chkTermos);

        JButton btnCriarConta = criarBotao("CRIAR CONTA");
        btnCriarConta.addActionListener(e -> criarConta());

        add(btnCriarConta);
        setVisible(true);
    }

    private JTextField criarCampo(String label) {
        add(new JLabel(label));
        JTextField campo = new JTextField();
        campo.setMaximumSize(new Dimension(300, 30));
        add(campo);
        return campo;
    }

    private JPasswordField criarSenha(String label) {
        add(new JLabel(label));
        JPasswordField campo = new JPasswordField();
        campo.setMaximumSize(new Dimension(300, 30));
        add(campo);
        return campo;
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

        JOptionPane.showMessageDialog(this, "Cadastro do familiar realizado com sucesso!");
        dispose();
        new LoginScreen();
    }
}
