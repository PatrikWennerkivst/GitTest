package FilmDemo.Eventdemo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventhanteringDemo extends JFrame implements ActionListener {

    JPanel jp = new JPanel();
    JLabel jl = new JLabel("hejsan hoppsan");
    JButton jb = new JButton("knappediknapp");
    JButton jb2 = new JButton("knappediknapp2");

    public EventhanteringDemo(){

        this.add(jp);
        jp.add(jb);
        jp.add(jb2);
        jp.add(jl);

        jb.addActionListener(new ActionlistOtherClass(jl, jb, jb2));
        jb2.addActionListener(new ActionlistOtherClass(jl, jb, jb2));

        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventhanteringDemo event = new EventhanteringDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
