import java.awt.*;
import javax.swing.*;

public class CadastroScreen extends JFrame {

    public CadastroScreen() {
        setTitle("Cadastro - VitalCare");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 400);
        setLocationRelativeTo(null);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        JLabel title = new JLabel("Qual o tipo de cadastro?");
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        title.setFont(new Font("SansSerif", Font.BOLD, 18));
        title.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));

        JButton btnIdoso = new JButton("Idoso");
        estilizarBotao(btnIdoso);
        btnIdoso.addActionListener(e -> {
            dispose();
            new CadastroIdosoScreen();
        });

        JButton btnCuidador = new JButton("Cuidador");
        estilizarBotao(btnCuidador);
        btnCuidador.addActionListener(e -> {
            dispose();
            new CadastroCuidadorScreen();
        });

        JButton btnFamiliar = new JButton("Familiar");
        estilizarBotao(btnFamiliar);
        btnFamiliar.addActionListener(e -> {
            dispose();
            new CadastroFamiliarScreen();
        });

        add(title);
        add(Box.createRigidArea(new Dimension(0, 15)));
        add(btnIdoso);
        add(Box.createRigidArea(new Dimension(0, 15)));
        add(btnCuidador);
        add(Box.createRigidArea(new Dimension(0, 15)));
        add(btnFamiliar);

        setVisible(true);
    }

    private void estilizarBotao(JButton botao) {
        botao.setAlignmentX(Component.CENTER_ALIGNMENT);
        botao.setBackground(new Color(0, 122, 255));
        botao.setForeground(Color.WHITE);
        botao.setFocusPainted(false);
        botao.setMaximumSize(new Dimension(200, 40));
    }
}
