package FilmDemo.SwingKomponenter2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxDemo extends JFrame implements ActionListener {

    private JPanel p = new JPanel();
    private JComboBox colochooser = new JComboBox();
    private JLabel l = new JLabel();
    private final String colors[] = {"röd", "blå", "gul" };

    public ComboBoxDemo() {
        colochooser = new JComboBox(colors);
        colochooser.setSelectedIndex(-1);
        p.setLayout(new GridLayout(2,1));
        p.add(colochooser);
        p.add(l);
        colochooser.setEditable(true);
        colochooser.addActionListener(this);
        add(p, BorderLayout.NORTH);
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (((String)colochooser.getSelectedItem()).equalsIgnoreCase("röd")) {
            p.setBackground(Color.red);
            l.setText("Du valde rött");
        }
        else if (((String)colochooser.getSelectedItem()).equalsIgnoreCase("blå")) {
            p.setBackground(Color.blue);
            l.setText("Du valde blått");
        }
        else if (((String)colochooser.getSelectedItem()).equalsIgnoreCase("gul")) {
            p.setBackground(Color.yellow);
            l.setText("Du valde gult");
        }
    }

    public static void main(String[] args) {
        ComboBoxDemo comboBoxDemo = new ComboBoxDemo();
    }
}
