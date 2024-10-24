package Uppgift1b;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bildvisare2 extends JFrame implements ActionListener {

    JLabel bildVisare;
    JPanel panel;
    JButton button;
    final String bild1 = "C:/Users/patri/OneDrive/Desktop/PhotosSwing/Caving1.jpg";
    final String bild2 = "C:/Users/patri/OneDrive/Desktop/PhotosSwing/Climbing1.jpg";
    int toggler = 0;

    public Bildvisare2() {
        button = new JButton("Växla bild");
        bildVisare = new JLabel(new ImageIcon(bild1));
        panel = new JPanel();
        setLayout(new FlowLayout());
        panel.setBackground(Color.BLACK);
        panel.add(bildVisare);
        panel.add(button);
        this.add(panel);
        button.addActionListener(this);
        pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);


    }

    public static void main(String[] args) {
        Bildvisare2 visa = new Bildvisare2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (toggler == 0) {
            bildVisare.setIcon(new ImageIcon(bild1));
            toggler = 1;
        }
        else if (toggler == 1) {
            bildVisare.setIcon(new ImageIcon(bild2));
            toggler = 0;
        }

    }
}
