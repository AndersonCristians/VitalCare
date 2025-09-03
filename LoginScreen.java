
import java.awt.*;
import javax.swing.*;

public class LoginScreen extends JFrame {

    public LoginScreen() {
        setTitle("Login - VitalCare");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 400);
        setLocationRelativeTo(null);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        JLabel title = new JLabel("Login");
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        title.setFont(new Font("SansSerif", Font.BOLD, 22));
        title.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));

        JTextField txtUser = new JTextField();
        txtUser.setMaximumSize(new Dimension(200, 30));
        txtUser.setAlignmentX(Component.CENTER_ALIGNMENT);
        txtUser.setBorder(BorderFactory.createTitledBorder("Usuário"));

        JPasswordField txtPass = new JPasswordField();
        txtPass.setMaximumSize(new Dimension(200, 30));
        txtPass.setAlignmentX(Component.CENTER_ALIGNMENT);
        txtPass.setBorder(BorderFactory.createTitledBorder("Senha"));

        JButton btnLogin = new JButton("Entrar");
        btnLogin.setAlignmentX(Component.CENTER_ALIGNMENT);
        estilizarBotao(btnLogin);

        // ação do botão de login
        btnLogin.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Login ainda não implementado.");
        });

        // Label de cadastro
        JLabel lblRegister = new JLabel("Não tem conta? Clique aqui");
        lblRegister.setForeground(Color.BLUE);
        lblRegister.setCursor(new Cursor(Cursor.HAND_CURSOR));
        lblRegister.setAlignmentX(Component.CENTER_ALIGNMENT);

        lblRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent e) {
                dispose(); // fecha login
                new CadastroScreen(); // abre tela de cadastro
            }
        });

        // adicionar componentes
        add(title);
        add(txtUser);
        add(Box.createRigidArea(new Dimension(0, 10)));
        add(txtPass);
        add(Box.createRigidArea(new Dimension(0, 20)));
        add(btnLogin);
        add(Box.createRigidArea(new Dimension(0, 20)));
        add(lblRegister);

        setVisible(true);
    }

    private void estilizarBotao(JButton botao) {
        botao.setBackground(new Color(0, 122, 255));
        botao.setForeground(Color.WHITE);
        botao.setFocusPainted(false);
        botao.setMaximumSize(new Dimension(200, 40));
    }
}
