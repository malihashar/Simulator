import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InstructionPanel extends JPanel implements ActionListener {

    private MainFrame mainFrame;
    private JButton backButton;

    public InstructionPanel(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        setLayout(null);
        setBackground(Color.WHITE);

        ImageIcon instructionsIcon = new ImageIcon("assets/Insturctions.png");
        JLabel instructionsLabel = new JLabel(instructionsIcon);
        instructionsLabel.setBounds(100, 50, 1000, 650);
        add(instructionsLabel);

        backButton = new JButton("Back");
        backButton.setBounds(500, 700, 200, 50);
        backButton.addActionListener(this);
        add(backButton);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == backButton) {
            mainFrame.showMenu();
        }
    }
}
