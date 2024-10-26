package Uppgift7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEvents extends JFrame implements MouseListener {

    JPanel panel = new JPanel();
    JLabel text = new JLabel("Den ökända knappen");
    JButton knapp = new JButton("Knappen");

    public MouseEvents() {

        add(panel);
        setLayout(new GridLayout(1,2));
        panel.add(text);
        panel.add(knapp);
        addMouseListener(this);

        setSize(100,100);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    //Lämnas tom för att detta inte behövs
    @Override
    public void mouseClicked(MouseEvent e) {
    }
    //Lämnas tom för att detta inte behövs
    @Override
    public void mousePressed(MouseEvent e) {
    }
    //Lämnas tom för att detta inte behövs
    @Override
    public void mouseReleased(MouseEvent e) {
    }
    //Gör så att knappen blir röd varje gång man drar in musen över den
    @Override
    public void mouseEntered(MouseEvent e) {
        knapp.setBackground(Color.red);
    }
    //Gör så att knappen blir vit ingen när drar bort musen från den
    @Override
    public void mouseExited(MouseEvent e) {
        knapp.setBackground(Color.white);
    }

    public static void main(String[] args) {
        MouseEvents mus = new MouseEvents();
    }
}
