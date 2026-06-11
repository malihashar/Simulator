import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPanel extends JPanel implements ActionListener {

    private MainFrame mainFrame;
    private JButton startButton;
    private JButton instructionsButton;
    private JButton exitButton;

    public MenuPanel(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        setLayout(null);
        setBackground(new Color(173, 216, 230));
        setOpaque(true);

        JLabel titleLabel = new JLabel("FLIGHT PHYSICS SIMULATOR");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 48));
        titleLabel.setForeground(Color.BLACK);
        titleLabel.setBounds(250, 80, 700, 60);
        add(titleLabel);

        ImageIcon planeIcon = new ImageIcon("assets/pngtree-realistic-passenger-airplane-in-mid-flight-isolated-on-transparent-background-png-image_15788014.png");
        JLabel planeLabel = new JLabel(planeIcon);
        planeLabel.setBounds(350, 180, 500, 250);
        add(planeLabel);

        startButton = new JButton("Start Simulation");
        startButton.setBounds(450, 450, 300, 50);
        startButton.addActionListener(this);
        add(startButton);

        instructionsButton = new JButton("Instructions");
        instructionsButton.setBounds(450, 520, 300, 50);
        instructionsButton.addActionListener(this);
        add(instructionsButton);

        exitButton = new JButton("Exit");
        exitButton.setBounds(450, 590, 300, 50);
        exitButton.addActionListener(this);
        add(exitButton);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            mainFrame.showSimulation();
        }
        if (e.getSource() == instructionsButton) {
            mainFrame.showInstructions();
        }
        if (e.getSource() == exitButton) {
            System.exit(0);
        }
    }
}
