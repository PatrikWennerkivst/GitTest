package FilmDemo.SwingKomponenter2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckboxDemo extends JFrame implements ActionListener {

    private JPanel p = new JPanel();
    private JCheckBox red = new JCheckBox("Röd", false);
    private JCheckBox blue = new JCheckBox("Blå", false);
    private JCheckBox yellow = new JCheckBox("Gul", false);
    private JLabel displayArea = new JLabel(" ");

    public CheckboxDemo() {
        p.setLayout(new GridLayout(4,1));
        p.add(red); p.add(blue); p.add(yellow); p.add(displayArea);
        add(p);

        red.addActionListener(this);
        blue.addActionListener(this);
        yellow.addActionListener(this);
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == red) {
            red.setBackground(Color.red);
            if (red.isSelected()) {
                displayArea.setText("Du valde rött");
            } else {
                displayArea.setText("Du valde inte rött");
            }
        } else if (e.getSource() == blue) {
            blue.setBackground(Color.blue);
            if (red.isSelected()) {
                displayArea.setText("Du valde blått");
            } else {
                displayArea.setText("Du valde inte blått");
            }
        } else if (e.getSource() == yellow) {
            yellow.setBackground(Color.yellow);
            if (red.isSelected()) {
                displayArea.setText("Du valde gult");
            } else {
                displayArea.setText("Du valde inte gult");
            }
        }
    }
    public static void main (String[]args){
        CheckboxDemo checkboxDemo = new CheckboxDemo();
    }
}
