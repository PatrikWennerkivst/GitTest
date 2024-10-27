package FilmDemo.GitAnonymaKlasserTerminalen.InnreKlasserDemo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerClassDemo extends JFrame {

    JPanel jp = new JPanel();
    JButton jb = new JButton("Tryck här");

    //Här skapar jag upp en innrekalss
    class InnerClass implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Knapptryckning");
        }
    }

    public InnerClassDemo(){

        add(jp);
        jp.add(jb);
        //Här hämtar jag ActionListener från den innreklassen och lägger till den in orignal klasssen
        //Jag får alltså en instans av Innerclass i InnerClassDemo
        jb.addActionListener(new InnerClass());

        setSize(200,200);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        InnerClassDemo demo = new InnerClassDemo();
    }
}
