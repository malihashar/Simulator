import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private CardLayout cardLayout;
    private JPanel cardPanel;

    public MainFrame() {
        setTitle("Flight Physics Simulator");
        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        MenuPanel menuPanel = new MenuPanel(this);
        InstructionPanel instructionPanel = new InstructionPanel(this);

        cardPanel.add(menuPanel, "menu");
        cardPanel.add(instructionPanel, "instructions");

        add(cardPanel);
    }

    public void showMenu() {
        cardLayout.show(cardPanel, "menu");
    }

    public void showInstructions() {
        cardLayout.show(cardPanel, "instructions");
    }

    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        frame.setVisible(true);
    }
}
