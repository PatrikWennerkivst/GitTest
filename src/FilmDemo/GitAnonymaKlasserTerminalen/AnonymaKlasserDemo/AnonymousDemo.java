package FilmDemo.GitAnonymaKlasserTerminalen.AnonymaKlasserDemo;

import FilmDemo.GitAnonymaKlasserTerminalen.InnreKlasserDemo.InnerClassDemo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousDemo extends JFrame{
    JPanel jp = new JPanel();
    JButton jb = new JButton("Tryck här");



    public AnonymousDemo(){

        add(jp);
        jp.add(jb);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Knapptryckning");
            }
        });

        setSize(200,200);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        InnerClassDemo demo = new InnerClassDemo();
    }
}

