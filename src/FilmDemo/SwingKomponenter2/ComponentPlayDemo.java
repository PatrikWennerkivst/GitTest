package FilmDemo.SwingKomponenter2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComponentPlayDemo extends JFrame implements ActionListener {

    JPanel p = new JPanel();

    JButton A = new JButton("A");
    JButton B = new JButton("B");
    JButton C = new JButton("C");
    JButton D = new JButton("D");

    ComponentPlayDemo(){
        add(p);
        p.setLayout(new FlowLayout());
        //D är inte tillagd för att den ska läggas till manuelt sent i körning vi tryckning av A
        p.add(A); p.add(B); p.add(C);
        A.addActionListener(this);
        B.addActionListener(this);
        C.addActionListener(this);
        D.addActionListener(this);
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Lägger till en extra knapp "D"
        if (e.getSource() == A) {
            p.add(D);
            p.revalidate();
            p.repaint();
        }
        if (e.getSource() == B) {
            //Hämtar B:s förälder
            Container c1 = ((Container)e.getSource()).getParent();
            //Tar up knapp A
            Component c2 = c1.getComponent(0);
            //Vi vet att detta är en JButton, vi kan skirva ut
            //texten för att veta att vi hämtat rätt
            System.out.println(((JButton)c2).getText());
            //Det blir en utskrift av A eftersom Component hämtar ut "föräldern"
            //som i detta fall är JPanel. där efter plockar jag ut första componenten via index.
        }

        if (e.getSource() == C) {
            //Tar bort sig själv
            Container c1 = ((Container)e.getSource()).getParent();
            c1.remove(2);
            c1.revalidate();
            c1.repaint();
        }

        if (e.getSource()== D) {
            Container c1 = ((Container)e.getSource()).getParent();
            c1.removeAll();
            c1.revalidate();
            c1.repaint();
        }
    }

    public static void main(String[] args) {
        ComponentPlayDemo componentPlayDemo = new ComponentPlayDemo();
    }
}
