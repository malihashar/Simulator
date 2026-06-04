import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPanel extends JPanel implements ActionListener {

    private MainFrame mainFrame;

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
        Image planeImage = planeIcon.getImage().getScaledInstance(400, 200, Image.SCALE_SMOOTH);
        JLabel planeLabel = new JLabel(new ImageIcon(planeImage));
        planeLabel.setBounds(400, 180, 400, 200);
        add(planeLabel);

        JButton startButton = new JButton("Start Simulation");
        startButton.setBounds(450, 450, 300, 50);
        add(startButton);

        JButton instructionsButton = new JButton("Instructions");
        instructionsButton.setBounds(450, 520, 300, 50);
        instructionsButton.addActionListener(this);
        add(instructionsButton);

        JButton exitButton = new JButton("Exit");
        exitButton.setBounds(450, 590, 300, 50);
        exitButton.addActionListener(this);
        add(exitButton);
    }

    public void actionPerformed(ActionEvent e) {
        String text = ((JButton) e.getSource()).getText();

        if (text.equals("Instructions")) {
            mainFrame.showInstructions();
        } else if (text.equals("Exit")) {
            System.exit(0);
        }
    }
}
