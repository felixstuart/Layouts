import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class SwingPracticeMedium2 {
    private JFrame mainFrame;
    private int WIDTH=800;
    private int HEIGHT=700;


    public SwingPracticeMedium2() {
        prepareGUI();
    }

    public static void main(String[] args) {
        SwingPracticeMedium2 swingControlDemo = new SwingPracticeMedium2();
        swingControlDemo.showEventDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Medium 2");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new GridLayout(3,3));
        JPanel innerPanel = new JPanel();
        innerPanel.setLayout(new BorderLayout());

        JButton button1 = new JButton("button 1");
        JButton button2 = new JButton("button 2");
        JButton button3 = new JButton("button 3");
        JButton button4 = new JButton("button 4");
        JButton button5 = new JButton("button 5");
        JButton button6 = new JButton("button 6");
        JButton button7 = new JButton("button 7");
        JButton button8 = new JButton("button 8");
        JButton button9 = new JButton("button 9");
        JButton button10 = new JButton("button 10");

        JLabel label = new JLabel("label", JLabel.CENTER);

        innerPanel.add(label);
        innerPanel.add(button9, BorderLayout.EAST);
        innerPanel.add(button10, BorderLayout.SOUTH);


        mainFrame.add(button1);
        mainFrame.add(button2);
        mainFrame.add(button3);
        mainFrame.add(button4);
        mainFrame.add(innerPanel);
        mainFrame.add(button5);
        mainFrame.add(button6);
        mainFrame.add(button7);
        mainFrame.add(button8);


        mainFrame.setVisible(true);
    }

    private void showEventDemo() {
        mainFrame.setVisible(true);
    }
}
