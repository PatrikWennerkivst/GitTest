package Uppgift1;

import javax.swing.*;
import java.awt.*;

public class Bildvisare extends JFrame {

    JLabel photos = new JLabel();
    JPanel panel = new JPanel();
    ImageIcon bild1 = new ImageIcon("C:/Users/patri/OneDrive/Desktop/PhotosSwing/Caving1.jpg");
    public Bildvisare() {
        add(panel);
        panel.add(photos);
        panel.setLayout(new FlowLayout());
        photos.setIcon(bild1);
        pack();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);


    }

    public static void main(String[] args) {
        Bildvisare visa = new Bildvisare();
    }
}
