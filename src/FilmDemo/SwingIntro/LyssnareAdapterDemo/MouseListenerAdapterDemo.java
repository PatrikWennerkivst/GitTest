package FilmDemo.SwingIntro.LyssnareAdapterDemo;

import javax.swing.*;

public class MouseListenerAdapterDemo extends JFrame{

    JPanel jp = new JPanel();

    JButton jb = new JButton("Jag är en knapp");

    public MouseListenerAdapterDemo(){

        add(jp);
        jp.add(jb);

        jb.addMouseListener(new MouseAdapterDemo());

        setSize(200,200);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        MouseListenerAdapterDemo jfd = new MouseListenerAdapterDemo();
    }
}
