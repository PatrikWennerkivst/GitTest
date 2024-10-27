package FilmDemo.GitAnonymaKlasserTerminalen.Lambdas;

import FilmDemo.GitAnonymaKlasserTerminalen.InnreKlasserDemo.InnerClassDemo;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//För EventListener funkar det bara att använda Lambdas när bara en metod finns i gränssnittet
    // Funkar för ActionListener men inte för MouseLIstener! (bara för interfaceses med EN metod i sig)

public class LambdasDemo extends JFrame{

    JPanel jp = new JPanel();
    JButton jb = new JButton("Tryck här");

    public LambdasDemo(){

        add(jp);
        jp.add(jb);
        //Lambdas är ett väldigt förskortat sätt att skriva metoder
        // e är inparametern och allt efter "pilen" är det som sker efter
        //"pilen" räknas som ett skilljetecken
        jb.addActionListener(e ->System.out.println("Knapptryckning"));

        setSize(200,200);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        InnerClassDemo demo = new InnerClassDemo();
    }
}
