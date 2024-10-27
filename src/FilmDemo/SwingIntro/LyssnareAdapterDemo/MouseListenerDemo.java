package FilmDemo.SwingIntro.LyssnareAdapterDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerDemo extends JFrame  implements MouseListener {

    JPanel jp = new JPanel();

    JButton jb = new JButton("Jag är en knapp");

    public MouseListenerDemo(){

        add(jp);
        jp.add(jb);

        jb.addMouseListener(this);

        setSize(200,200);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        jb.setForeground(Color.BLUE);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        jb.setForeground(Color.CYAN);

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        jb.setForeground(Color.GREEN);

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        jb.setForeground(Color.PINK);

    }

    @Override
    public void mouseExited(MouseEvent e) {
        jb.setForeground(Color.YELLOW);

    }

    public static void main(String[] args) {
        MouseListenerDemo jfd = new MouseListenerDemo();
    }
}
