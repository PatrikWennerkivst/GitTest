package Uppgift6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class F extends JFrame {

    JPanel window = new JPanel();
    JButton övre = new JButton("Första knappen");
    JButton nedre = new JButton("Andra knappen");

    JTextField första = new JTextField();

    public F(){
        add(window);

        window.setLayout(new BorderLayout());
        add(första, BorderLayout.CENTER);
        add(övre, BorderLayout.NORTH);
        add(nedre, BorderLayout.SOUTH);
        addWindowListener(fönsterLyss);
        första.addFocusListener(focusLyss);

        setVisible(true);
        setSize(300,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    WindowAdapter fönsterLyss = new WindowAdapter() {

        //Lägger till funktion för att Första alltid ska vara i fokus när fönstret aktiveras
        @Override
        public void windowGainedFocus(WindowEvent e) {
            första.requestFocus();
        }
    };
        //Lägger till funktion så att FÖrsta blir blå när man interagerar med den
    FocusListener focusLyss = new FocusListener() {
        @Override
        public void focusGained(FocusEvent e) {
            första.setBackground(Color.blue);

        }
        //Lägger till funktion så att FÖrsta blir vit igen när man slutar interagerar med den
        @Override
        public void focusLost(FocusEvent e) {
            första.setBackground(Color.WHITE);
        }
    };

    public static void main(String[] args) {
        F f = new F();
    }
}
