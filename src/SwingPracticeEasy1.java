import java.awt.*;
import javax.swing.*;

public class SwingPracticeEasy1 {
    private JFrame mainFrame;
    private int WIDTH=800;
    private int HEIGHT=700;


    public SwingPracticeEasy1() {
        prepareGUI();
    }

    public static void main(String[] args) {
        SwingPracticeEasy1 swingControlDemo = new SwingPracticeEasy1();
        swingControlDemo.showEventDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Felix Learning Swing");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new GridLayout(2, 3));

        JButton button1 = new JButton("button 1");
        JButton button2 = new JButton("button 2");
        JButton button3 = new JButton("button 3");
        JButton button4 = new JButton("button 4");
        JButton button5 = new JButton("button 5");

        mainFrame.add(button1);
        mainFrame.add(button2);
        mainFrame.add(button3);
        mainFrame.add(button4);
        mainFrame.add(button5);

        mainFrame.setVisible(true);
    }

    private void showEventDemo() {
        mainFrame.setVisible(true);
    }
}