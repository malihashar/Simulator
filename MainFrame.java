import javax.swing.*;

public class MainFrame extends JFrame {

    private MenuPanel menuPanel;
    private InstructionPanel instructionPanel;
    private SimulationPanel simulationPanel;

    public MainFrame() {
        setTitle("Flight Physics Simulator");
        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        menuPanel = new MenuPanel(this);
        instructionPanel = new InstructionPanel(this);
        simulationPanel = new SimulationPanel();

        menuPanel.setBounds(0, 0, 1200, 800);
        instructionPanel.setBounds(0, 0, 1200, 800);
        simulationPanel.setBounds(0, 0, 1200, 800);

        add(menuPanel);
        add(instructionPanel);
        add(simulationPanel);

        instructionPanel.setVisible(false);
        simulationPanel.setVisible(false);
    }

    public void showMenu() {
        menuPanel.setVisible(true);
        instructionPanel.setVisible(false);
        simulationPanel.setVisible(false);
    }

    public void showInstructions() {
        menuPanel.setVisible(false);
        instructionPanel.setVisible(true);
        simulationPanel.setVisible(false);
    }

    public void showSimulation() {
        menuPanel.setVisible(false);
        instructionPanel.setVisible(false);
        simulationPanel.setVisible(true);
        simulationPanel.updateVariables();
    }

    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        frame.setVisible(true);
    }
}
