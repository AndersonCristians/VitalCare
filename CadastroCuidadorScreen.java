import java.awt.*;
import javax.swing.*;

public class CadastroCuidadorScreen extends JFrame {
    public CadastroCuidadorScreen() {
        setTitle("Cadastro Cuidador");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 400);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("Tela de Cadastro - Cuidador", SwingConstants.CENTER);
        label.setFont(new Font("SansSerif", Font.BOLD, 18));

        add(label);

        setVisible(true);
    }
}
