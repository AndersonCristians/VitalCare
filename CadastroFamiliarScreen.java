import java.awt.*;
import javax.swing.*;

public class CadastroFamiliarScreen extends JFrame {
    public CadastroFamiliarScreen() {
        setTitle("Cadastro Familiar");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 400);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("Tela de Cadastro - Familiar", SwingConstants.CENTER);
        label.setFont(new Font("SansSerif", Font.BOLD, 18));

        add(label);

        setVisible(true);
    }
}
