
import javax.swing.*;
import java.awt.*;

public class LoginScreen extends JFrame {
    public LoginScreen() {
        setTitle("Login");
        setSize(300, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(Color.WHITE);
        panel.setBorder(BorderFactory.createEmptyBorder(50, 20, 20, 20));

        JLabel loginLabel = new JLabel("Login", SwingConstants.CENTER);
        loginLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        loginLabel.setFont(new Font("SansSerif", Font.BOLD, 20));

        JTextField userField = new JTextField();
        userField.setMaximumSize(new Dimension(250, 30));
        userField.setAlignmentX(Component.CENTER_ALIGNMENT);
        userField.setBorder(BorderFactory.createTitledBorder("Usuário ou email"));

        JPasswordField passField = new JPasswordField();
        passField.setMaximumSize(new Dimension(250, 30));
        passField.setAlignmentX(Component.CENTER_ALIGNMENT);
        passField.setBorder(BorderFactory.createTitledBorder("Senha"));

        JLabel forgotLabel = new JLabel("Esqueceu a senha?", SwingConstants.CENTER);
        forgotLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        forgotLabel.setFont(new Font("SansSerif", Font.PLAIN, 12));
        forgotLabel.setForeground(Color.BLUE);

        JButton loginButton = new JButton("ENTRAR");
        loginButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        loginButton.setBackground(new Color(0, 122, 255));
        loginButton.setForeground(Color.WHITE);
        loginButton.setFocusPainted(false);
        loginButton.setMaximumSize(new Dimension(200, 40));

        JLabel noAccount = new JLabel("Não tem conta? Clique aqui", SwingConstants.CENTER);
        noAccount.setAlignmentX(Component.CENTER_ALIGNMENT);
        noAccount.setFont(new Font("SansSerif", Font.PLAIN, 12));
        noAccount.setForeground(Color.BLUE);

        panel.add(loginLabel);
        panel.add(Box.createVerticalStrut(20));
        panel.add(userField);
        panel.add(Box.createVerticalStrut(10));
        panel.add(passField);
        panel.add(Box.createVerticalStrut(10));
        panel.add(forgotLabel);
        panel.add(Box.createVerticalStrut(20));
        panel.add(loginButton);
        panel.add(Box.createVerticalStrut(20));
        panel.add(noAccount);

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }
}
