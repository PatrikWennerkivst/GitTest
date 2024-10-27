package FilmDemo.GitAnonymaKlasserTerminalen.LocalClassesDemo;

import FilmDemo.GitAnonymaKlasserTerminalen.InnreKlasserDemo.InnerClassDemo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Lokala klasser vill bara användas när man vill använda klassen inuti den funktionen
//Lolkala klasser kan man inte komma åt utifrån pga dess inkappsling
//Detta gör att det blir rätt svårt att skriva tester till dem
public class LocalKlassDemo extends JFrame{

    JPanel jp = new JPanel();
    JButton jb = new JButton("Tryck här");



    public LocalKlassDemo(){

        //Här skapar jag en lokal klass som skapar upp en instans av en actionlistener
        class InnerClass implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Knapptryckning");
            }
        }

        add(jp);
        jp.add(jb);
        //Här hämtar jag ActionListener från den lokala klassen och lägger till den in orignal klasssen
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
