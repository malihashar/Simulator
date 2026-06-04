import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InstructionPanel extends JPanel implements ActionListener {

    private MainFrame mainFrame;

    public InstructionPanel(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        setLayout(null);
        setBackground(Color.WHITE);

        ImageIcon instructionsIcon = new ImageIcon("assets/Insturctions.png");
        Image instructionsImage = instructionsIcon.getImage().getScaledInstance(900, 600, Image.SCALE_SMOOTH);
        JLabel instructionsLabel = new JLabel(new ImageIcon(instructionsImage));
        instructionsLabel.setBounds(150, 50, 900, 600);
        add(instructionsLabel);

        JButton backButton = new JButton("Back");
        backButton.setBounds(500, 700, 200, 50);
        backButton.addActionListener(this);
        add(backButton);
    }

    public void actionPerformed(ActionEvent e) {
        mainFrame.showMenu();
    }
}
