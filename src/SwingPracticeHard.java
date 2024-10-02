import javax.swing.*;
import java.awt.*;

public class SwingPracticeHard {
    private JFrame mainFrame;
    private int WIDTH=1200;
    private int HEIGHT=700;


    public SwingPracticeHard() {
        prepareGUI();
    }

    public static void main(String[] args) {
        SwingPracticeHard swingControlDemo = new SwingPracticeHard();
        swingControlDemo.showEventDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Hard");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new GridLayout(2, 1));

        JPanel gridPanels = new JPanel();
        gridPanels.setLayout(new GridLayout(1,2));

        JPanel leftGrid = new JPanel();
        leftGrid.setLayout(new GridLayout(3, 3));

        JLabel top01 = new JLabel("top 0", JLabel.CENTER);
        JLabel top02 = new JLabel("top 0", JLabel.CENTER);
        JLabel top03 = new JLabel("top 0", JLabel.CENTER);
        JLabel top04 = new JLabel("top 0", JLabel.CENTER);
        JButton top1 = new JButton("Top 1");
        JButton top2 = new JButton("Top 2");
        JButton top3 = new JButton("Top 3");
        JButton top4 = new JButton("Top 4");

        leftGrid.add(top01);
        leftGrid.add(top1);
        leftGrid.add(top02);
        leftGrid.add(top2);
        leftGrid.add(top03);
        leftGrid.add(top3);
        leftGrid.add(top04);
        leftGrid.add(top4);

        JPanel rightGrid = new JPanel();
        rightGrid.setLayout(new GridLayout(2, 1));

        JLabel topRight = new JLabel("Top Right", JLabel.CENTER);
        JButton button1 = new JButton("1");


        JPanel numberRow = new JPanel();
        numberRow.setLayout(new GridLayout(1, 9));
        JLabel bottom01 = new JLabel("0", JLabel.CENTER);
        JLabel bottom02 = new JLabel("0", JLabel.CENTER);
        JLabel bottom03 = new JLabel("0", JLabel.CENTER);
        JLabel bottom04 = new JLabel("0", JLabel.CENTER);
        JLabel bottom05 = new JLabel("0", JLabel.CENTER);

        JButton bottomButton1 = new JButton("1");
        JButton bottomButton2 = new JButton("2");
        JButton bottomButton3 = new JButton("3");
        JButton bottomButton4 = new JButton("4");

        numberRow.add(bottom01);
        numberRow.add(bottomButton1);
        numberRow.add(bottom02);
        numberRow.add(bottomButton2);
        numberRow.add(bottom03);
        numberRow.add(bottomButton3);
        numberRow.add(bottom04);
        numberRow.add(bottomButton4);
        numberRow.add(bottom05);


        rightGrid.add(topRight);
        rightGrid.add(button1);

        gridPanels.add(leftGrid);
        gridPanels.add(rightGrid);

        JTextArea textArea = new JTextArea();

        JPanel textAreaNumberRow = new JPanel();
        textAreaNumberRow.setLayout(new BorderLayout());

        textAreaNumberRow.add(textArea);
        textAreaNumberRow.add(numberRow, BorderLayout.SOUTH);

        mainFrame.add(gridPanels);
        mainFrame.add(textAreaNumberRow);
        mainFrame.setVisible(true);
    }

    private void showEventDemo() {
        mainFrame.setVisible(true);
    }

}
