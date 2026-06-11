import javax.swing.*;
import java.awt.*;

public class SimulationPanel extends JPanel {

    private JSlider gravitySlider;
    private JSlider thrustSlider;
    private JSlider velocitySlider;
    private JSlider windSpeedSlider;
    private JSlider massSlider;
    private JSlider airDensitySlider;
    private JSlider wingAreaSlider;
    private JSlider liftCoefficientSlider;
    private JSlider dragCoefficientSlider;
    private JSlider angleOfAttackSlider;
    private JSlider fuelSlider;
    private JSlider accelerationSlider;

    private double gravity = 9.8;
    private double velocity = 50;
    private double thrust = 500;
    private double mass = 1000;
    private double airDensity = 1.225;
    private double wingArea = 30;
    private double liftCoefficient = 1.2;
    private double dragCoefficient = 0.03;
    private double windSpeed = 0;
    private double angleOfAttack = 5;
    private double acceleration = 0;
    private double fuel = 100;

    private PhysicsCalculator physicsCalculator;

    public SimulationPanel() {
        setLayout(null);
        setBackground(new Color(135, 206, 235));
        setOpaque(true);

        physicsCalculator = new PhysicsCalculator();

        ImageIcon planeIcon = new ImageIcon("aircraft-side-profile.png");
        JLabel planeLabel = new JLabel(planeIcon);
        planeLabel.setBounds(300, 300, 300, 200);
        add(planeLabel);

        JLabel gravityLabel = new JLabel("Gravity");
        gravityLabel.setBounds(850, 20, 200, 20);
        add(gravityLabel);
        gravitySlider = new JSlider(0, 20, 10);
        gravitySlider.setBounds(850, 40, 300, 30);
        add(gravitySlider);

        JLabel enginePowerLabel = new JLabel("Engine Power");
        enginePowerLabel.setBounds(850, 75, 200, 20);
        add(enginePowerLabel);
        thrustSlider = new JSlider(0, 1000, 500);
        thrustSlider.setBounds(850, 95, 300, 30);
        add(thrustSlider);

        JLabel velocityLabel = new JLabel("Velocity");
        velocityLabel.setBounds(850, 130, 200, 20);
        add(velocityLabel);
        velocitySlider = new JSlider(0, 300, 50);
        velocitySlider.setBounds(850, 150, 300, 30);
        add(velocitySlider);

        JLabel windSpeedLabel = new JLabel("Wind Speed");
        windSpeedLabel.setBounds(850, 185, 200, 20);
        add(windSpeedLabel);
        windSpeedSlider = new JSlider(0, 100, 0);
        windSpeedSlider.setBounds(850, 205, 300, 30);
        add(windSpeedSlider);

        JLabel massLabel = new JLabel("Mass");
        massLabel.setBounds(850, 240, 200, 20);
        add(massLabel);
        massSlider = new JSlider(500, 5000, 1000);
        massSlider.setBounds(850, 260, 300, 30);
        add(massSlider);

        JLabel airDensityLabel = new JLabel("Air Density");
        airDensityLabel.setBounds(850, 295, 200, 20);
        add(airDensityLabel);
        airDensitySlider = new JSlider(0, 200, 122);
        airDensitySlider.setBounds(850, 315, 300, 30);
        add(airDensitySlider);

        JLabel wingAreaLabel = new JLabel("Wing Area");
        wingAreaLabel.setBounds(850, 350, 200, 20);
        add(wingAreaLabel);
        wingAreaSlider = new JSlider(10, 100, 30);
        wingAreaSlider.setBounds(850, 370, 300, 30);
        add(wingAreaSlider);

        JLabel liftCoefficientLabel = new JLabel("Lift Coefficient");
        liftCoefficientLabel.setBounds(850, 405, 200, 20);
        add(liftCoefficientLabel);
        liftCoefficientSlider = new JSlider(0, 300, 120);
        liftCoefficientSlider.setBounds(850, 425, 300, 30);
        add(liftCoefficientSlider);

        JLabel dragCoefficientLabel = new JLabel("Drag Coefficient");
        dragCoefficientLabel.setBounds(850, 460, 200, 20);
        add(dragCoefficientLabel);
        dragCoefficientSlider = new JSlider(0, 100, 3);
        dragCoefficientSlider.setBounds(850, 480, 300, 30);
        add(dragCoefficientSlider);

        JLabel angleOfAttackLabel = new JLabel("Angle of Attack");
        angleOfAttackLabel.setBounds(850, 515, 200, 20);
        add(angleOfAttackLabel);
        angleOfAttackSlider = new JSlider(0, 45, 5);
        angleOfAttackSlider.setBounds(850, 535, 300, 30);
        add(angleOfAttackSlider);

        JLabel fuelLabel = new JLabel("Fuel");
        fuelLabel.setBounds(850, 570, 200, 20);
        add(fuelLabel);
        fuelSlider = new JSlider(0, 100, 100);
        fuelSlider.setBounds(850, 590, 300, 30);
        add(fuelSlider);

        JLabel accelerationLabel = new JLabel("Acceleration");
        accelerationLabel.setBounds(850, 625, 200, 20);
        add(accelerationLabel);
        accelerationSlider = new JSlider(0, 50, 0);
        accelerationSlider.setBounds(850, 645, 300, 30);
        add(accelerationSlider);

        JButton startButton = new JButton("Start Simulation");
        startButton.setBounds(850, 700, 300, 50);
        add(startButton);
    }

    public void updateVariables() {
        gravity = gravitySlider.getValue();
        thrust = thrustSlider.getValue();
        velocity = velocitySlider.getValue();
        windSpeed = windSpeedSlider.getValue();
        mass = massSlider.getValue();
        airDensity = airDensitySlider.getValue() / 100.0;
        wingArea = wingAreaSlider.getValue();
        liftCoefficient = liftCoefficientSlider.getValue() / 100.0;
        dragCoefficient = dragCoefficientSlider.getValue() / 100.0;
        angleOfAttack = angleOfAttackSlider.getValue();
        fuel = fuelSlider.getValue();
        acceleration = accelerationSlider.getValue();

        physicsCalculator.gravity = gravity;
        physicsCalculator.thrust = thrust;
        physicsCalculator.velocity = velocity;
        physicsCalculator.mass = mass;
        physicsCalculator.airDensity = airDensity;
        physicsCalculator.wingArea = wingArea;
        physicsCalculator.liftCoefficient = liftCoefficient;
        physicsCalculator.dragCoefficient = dragCoefficient;
    }
}
