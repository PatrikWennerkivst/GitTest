package FilmDemo.Eventdemo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionlistOtherClass implements ActionListener {

    JLabel l = new JLabel();
    JButton b = new JButton();
    JButton b2 = new JButton();


    public ActionlistOtherClass(JLabel l, JButton b, JButton b2) {
        this.l = l;
        this.b = b;
        this.b2 = b2;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            l.setText("knapp 1 har blivit tryckt på");
        }
        else {
            l.setText("Knapp 2 har blivit tryckt på");
        }
    }
}
