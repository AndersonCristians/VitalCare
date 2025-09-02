
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WelcomeScreen extends JFrame {
    public WelcomeScreen() {
        setTitle("Boas vindas");
        setSize(300, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        centerPanel.setBackground(Color.WHITE);
        centerPanel.setBorder(BorderFactory.createEmptyBorder(50, 20, 20, 20));

        JLabel welcomeLabel = new JLabel("Bem Vindo ao", SwingConstants.CENTER);
        welcomeLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        welcomeLabel.setFont(new Font("SansSerif", Font.PLAIN, 18));

        JLabel logoLabel = new JLabel("VITALCARE", SwingConstants.CENTER);
        logoLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        logoLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
        logoLabel.setForeground(new Color(0, 153, 0));

        JButton startButton = new JButton("INICIAR");
        startButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        startButton.setBackground(new Color(0, 122, 255));
        startButton.setForeground(Color.WHITE);
        startButton.setFocusPainted(false);
        startButton.setMaximumSize(new Dimension(200, 40));

        JLabel noAccount = new JLabel("Não tem conta? Clique aqui", SwingConstants.CENTER);
        noAccount.setAlignmentX(Component.CENTER_ALIGNMENT);
        noAccount.setFont(new Font("SansSerif", Font.PLAIN, 12));
        noAccount.setForeground(Color.BLUE);

        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new LoginScreen();
            }
        });

        centerPanel.add(welcomeLabel);
        centerPanel.add(Box.createVerticalStrut(10));
        centerPanel.add(logoLabel);
        centerPanel.add(Box.createVerticalStrut(30));
        centerPanel.add(startButton);
        centerPanel.add(Box.createVerticalStrut(20));
        centerPanel.add(noAccount);

        add(centerPanel, BorderLayout.CENTER);
        setVisible(true);
    }
}
