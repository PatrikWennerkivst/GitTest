package KlassDemo;

import javax.swing.*;
import java.awt.*;

import static javax.swing.SwingConstants.*;

public class SwingDemo extends JFrame {

    JPanel panel = new JPanel();

    public SwingDemo() {
        add(panel);
        panel.setLayout(new BorderLayout());
        panel.add(new JLabel("text 1"), BorderLayout.NORTH);
        panel.add(new JButton("rödknapp 1"), BorderLayout.SOUTH);
        panel.add(new JLabel("Text 2"), BorderLayout.WEST);
        panel.add(new JButton("röd knapp 2"), BorderLayout.EAST);
        panel.add(new JLabel("The world of knappar"), BorderLayout.CENTER);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        SwingDemo demo = new SwingDemo();
    }
}
