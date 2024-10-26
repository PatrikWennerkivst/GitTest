package Uppgift5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class StenSaxPåse extends JFrame implements ActionListener {

    public JButton getRandom() {
        JButton[] cpuChoise = {cpuSten, cpuSax, cpuPåse};
        Random random = new Random();
        int randomIndex = random.nextInt(cpuChoise.length);
        return cpuChoise[randomIndex];
    }

    int användarePoäng = 0;
    int datorPoäng = 0;

    JPanel knappar = new JPanel();
    JPanel cpuRutan = new JPanel();
    JPanel resultatRutan = new JPanel();

    JLabel turngening = new JLabel("Sten, Sax & Påse\nTurneringen!!!");
    JLabel vs = new JLabel("        VS      ");
    JLabel poängTavla = new JLabel("Score board: ");
    JLabel användarPoängLabel = new JLabel( "Användaren: ");
    JLabel datornPoängLabel = new JLabel(" Datorn: ");

    JButton användarSten = new JButton("Sten");
    JButton användarSax = new JButton("Sax");
    JButton användarPåse = new JButton("Påse");
    JButton cpuSten = new JButton("Sten");
    JButton cpuSax = new JButton("Sax");
    JButton cpuPåse = new JButton("Påse");


    JLabel result = new JLabel();

    public StenSaxPåse() {


        knappar.setLayout(new GridLayout(1,3));
        knappar.add(new JLabel("Användaren:" + användarePoäng));
        knappar.add(användarSten);
        knappar.add(användarSax);
        knappar.add(användarPåse);

        cpuRutan.setLayout(new GridLayout(1,3));
        cpuRutan.add(new JLabel("Datorn:" + datorPoäng));
        cpuRutan.add(cpuSten);
        cpuRutan.add(cpuSax);
        cpuRutan.add(cpuPåse);

        resultatRutan.setLayout(new GridLayout(1,3));
        resultatRutan.add(poängTavla);
        resultatRutan.add(användarPoängLabel);
        resultatRutan.add(datornPoängLabel);

        setLayout(new BorderLayout());
        add("North", turngening);
        add("South", resultatRutan);
        add("West", knappar);
        add("East", cpuRutan);
        add("Center", vs);


        användarSten.addActionListener(this);
        användarSax.addActionListener(this);
        användarPåse.addActionListener(this);

        cpuSten.addActionListener(this);
        cpuSax.addActionListener(this);
        cpuPåse.addActionListener(this);

        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        StenSaxPåse ssp = new StenSaxPåse();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Om användaren väljer Sten
        if (e.getSource() == användarSten) {
            användarSten.setBackground(Color.green);
            getRandom();
            if (getRandom() == cpuSten){
                cpuSten.setBackground(Color.green);
                resetGame();
                return;

            } else if (getRandom() == cpuSax) {
                cpuSax.setBackground(Color.green);
                användarePoäng++;
                användarPoängLabel.setText("Användaren:" + användarePoäng);
                resetGame();
                return;

            } else if (getRandom() == cpuPåse) {
                cpuPåse.setBackground(Color.green);
                datorPoäng++;
                datornPoängLabel.setText("Datorn:" + datorPoäng);
                resetGame();
                return;
            }
        }
        //Om användaren väljer Sax
        else if (e.getSource() == användarSax) {
            användarSax.setBackground(Color.green);
            getRandom();
            if (getRandom() == cpuSten){
                cpuSten.setBackground(Color.green);
                datorPoäng++;
                datornPoängLabel.setText("Datorn:" + datorPoäng);
                resetGame();
                return;

            } else if (getRandom() == cpuSax) {
                cpuSax.setBackground(Color.green);
                resetGame();
                return;

            } else if (getRandom() == cpuPåse) {
                cpuPåse.setBackground(Color.green);
                användarePoäng++;
                användarPoängLabel.setText("Användaren:" + användarePoäng);
                resetGame();
                return;
            }
        }
        //OM användaren väljer påse
        else if (e.getSource() == användarPåse) {
            användarPåse.setBackground(Color.green);
            getRandom();
            if (getRandom() == cpuSten){
                cpuSten.setBackground(Color.green);
                användarePoäng++;
                användarPoängLabel.setText("Användaren:" + användarePoäng);
                resetGame();
                return;
            } else if (getRandom() == cpuSax) {
                cpuSax.setBackground(Color.green);
                datorPoäng++;
                datornPoängLabel.setText("Datorn:" + datorPoäng);
                resetGame();
                return;
            } else if (getRandom() == cpuPåse) {
                cpuPåse.setBackground(Color.green);
                resetGame();
                return;

            }
        }

    }
    private void resetGame() {
        new Timer(2000, e2 -> {
            användarSten.setBackground(Color.WHITE);
            användarSax.setBackground(Color.WHITE);
            användarPåse.setBackground(Color.WHITE);

            cpuSten.setBackground(Color.WHITE);
            cpuSax.setBackground(Color.WHITE);
            cpuPåse.setBackground(Color.WHITE);
        }).start();
    }
}
