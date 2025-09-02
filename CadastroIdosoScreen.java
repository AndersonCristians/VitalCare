import java.awt.*;
import javax.swing.*;

public class CadastroIdosoScreen extends JFrame {
    public CadastroIdosoScreen() {
        setTitle("Cadastro Idoso");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 400);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("Tela de Cadastro - Idoso", SwingConstants.CENTER);
        label.setFont(new Font("SansSerif", Font.BOLD, 18));

        add(label);

        setVisible(true);
    }
}
