import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class SwingPracticeMedium1 {
        private JFrame mainFrame;
        private int WIDTH=800;
        private int HEIGHT=700;


        public SwingPracticeMedium1() {
            prepareGUI();
        }

        public static void main(String[] args) {
            SwingPracticeMedium1 swingControlDemo = new SwingPracticeMedium1();
            swingControlDemo.showEventDemo();
        }

        private void prepareGUI() {
            mainFrame = new JFrame("Medium 1");
            mainFrame.setSize(WIDTH, HEIGHT);
            mainFrame.setLayout(new BorderLayout());
            JPanel innerPanel = new JPanel();
            innerPanel.setLayout(new GridLayout(2, 3));

            JButton button1 = new JButton("button 1");
            JButton button2 = new JButton("button 2");
            JButton button3 = new JButton("button 3");
            JButton button4 = new JButton("button 4");
            JButton button5 = new JButton("button 5");

            JLabel label1 = new JLabel("label 1", JLabel.CENTER);
            JLabel label2 = new JLabel("label 2", JLabel.CENTER);

            innerPanel.add(button2);
            innerPanel.add(label1);
            innerPanel.add(button4);
            innerPanel.add(label2);
            innerPanel.add(button5);

            mainFrame.add(button1, BorderLayout.NORTH);
            mainFrame.add(innerPanel);
            mainFrame.add(button3, BorderLayout.SOUTH);



            mainFrame.setVisible(true);
        }

        private void showEventDemo() {
            mainFrame.setVisible(true);
        }
    }
