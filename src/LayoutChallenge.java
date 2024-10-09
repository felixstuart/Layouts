import javax.swing.*;
import java.awt.*;

public class LayoutChallenge {
    private JFrame mainFrame;
    private int WIDTH=1200;
    private int HEIGHT=700;


    public LayoutChallenge() {
        prepareGUI();
    }

    public static void main(String[] args) {
        LayoutChallenge swingControlDemo = new LayoutChallenge();
        swingControlDemo.showEventDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Group Layout Challenge");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new GridLayout(1,2));

        TextArea textArea = new TextArea();

        JLabel symbol = new JLabel("Symbol");
        JTextField symbolText = new JTextField();
        JLabel chromosome = new JLabel("Chromosome");
        JTextField chromosomeText = new JTextField();
        JLabel startPosition = new JLabel("Start Position");
        JTextField startPositionText = new JTextField();
        JLabel stopPosition = new JLabel("Stop Position");
        JTextField stopPositionText = new JTextField();

        JButton plus = new JButton("+");
        JButton minus = new JButton("-");

        JPanel geneInformation = new JPanel();
        geneInformation.setLayout(new GridLayout(2,2));

        geneInformation.add(symbol);
        geneInformation.add(symbolText);
        geneInformation.add(chromosome);
        geneInformation.add(chromosomeText);
        geneInformation.add(startPosition);
        geneInformation.add(startPositionText);
        geneInformation.add(stopPosition);
        geneInformation.add(stopPositionText);

        JPanel controls = new JPanel();
        controls.setLayout(new GridLayout(1,2));

        controls.add(minus);
        controls.add(plus);

        JPanel geneInformationWithControls = new JPanel();
        geneInformationWithControls.setLayout(new GridLayout(2, 1));

        geneInformationWithControls.add(geneInformation);
        geneInformationWithControls.add(controls);

        mainFrame.add(textArea);
        mainFrame.add(geneInformationWithControls);

        mainFrame.setVisible(true);
    }
    private void showEventDemo() {
        mainFrame.setVisible(true);
    }
}
