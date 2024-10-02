import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class SwingPracticeEasy2 {

        private JFrame mainFrame;
        private int WIDTH=800;
        private int HEIGHT=700;


        public SwingPracticeEasy2() {
            prepareGUI();
        }

        public static void main(String[] args) {
            SwingPracticeEasy2 swingControlDemo = new SwingPracticeEasy2();
            swingControlDemo.showEventDemo();
        }

        private void prepareGUI() {
            mainFrame = new JFrame("Easy 2");
            mainFrame.setSize(WIDTH, HEIGHT);
            mainFrame.setLayout(new BorderLayout());

            JButton button1 = new JButton("button 1");
            JButton button2 = new JButton("button 2");
            JButton button3 = new JButton("button 3");
            JButton button4 = new JButton("button 4");
            JButton button5 = new JButton("button 5");

            mainFrame.add(button1, BorderLayout.NORTH);
            mainFrame.add(button2, BorderLayout.EAST);
            mainFrame.add(button3, BorderLayout.SOUTH);
            mainFrame.add(button4, BorderLayout.WEST);
            mainFrame.add(button5);

            mainFrame.setVisible(true);
        }

        private void showEventDemo() {
            mainFrame.setVisible(true);
        }
    }

