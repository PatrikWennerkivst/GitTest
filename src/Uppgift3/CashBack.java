package Uppgift3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CashBack extends JFrame implements ActionListener {

    JTextField paidAwnser = new JTextField(5);
    JTextField priceAwnser = new JTextField(5);

    JPanel p1 = new JPanel();   //Frågor
    JPanel p2 = new JPanel();   //Svarsrutor
    JPanel p3 = new JPanel();   // resultat
    JPanel p4 = new JPanel();   // checkboxar

    JLabel result1000 = new JLabel();
    JLabel result500 = new JLabel();
    JLabel result200 = new JLabel();
    JLabel result100 = new JLabel();
    JLabel result50 = new JLabel();
    JLabel result20 = new JLabel();
    JLabel result10 = new JLabel();
    JLabel result5 = new JLabel();
    JLabel result2 = new JLabel();
    JLabel result1 = new JLabel();

    JCheckBox cb1000 = new JCheckBox("1000", true);
    JCheckBox cb500 = new JCheckBox("500", true);
    JCheckBox cb200 = new JCheckBox("200", true);
    JCheckBox cb100 = new JCheckBox("100", true);
    JCheckBox cb50 = new JCheckBox("50", true);
    JCheckBox cb20 = new JCheckBox("20", true);
    JCheckBox cb10 = new JCheckBox("10", true);
    JCheckBox cb5 = new JCheckBox("5", true);
    JCheckBox cb2 = new JCheckBox("2", true);
    JCheckBox cb1 = new JCheckBox("1", true);

    public CashBack(){

        p1.setLayout(new GridLayout(2,1));
        p1.add(new JLabel("Pris:", Label.RIGHT));
        p1.add(new JLabel("Belopp betalt: ", Label.RIGHT));

        p2.setLayout(new GridLayout(2,1));
        p2.add(priceAwnser);
        p2.add(paidAwnser);

        p3.setLayout(new GridLayout(7,1));
        p3.add(new JLabel("Växel tillbaka:"));
        p3.add(result1000);
        p3.add(result500);
        p3.add(result200);
        p3.add(result100);
        p3.add(result50);
        p3.add(result20);
        p3.add(result10);
        p3.add(result5);
        p3.add(result2);
        p3.add(result1);

        p4.setLayout(new GridLayout(7,1));
        p4.add(cb1000);
        p4.add(cb500);
        p4.add(cb200);
        p4.add(cb100);
        p4.add(cb50);
        p4.add(cb20);
        p4.add(cb10);
        p4.add(cb5);
        p4.add(cb2);
        p4.add(cb1);

        setLayout(new BorderLayout());
        add("North", p4);   //checkboxar
        add("West", p1);    //Frågor
        add("Center", p2);  //svar
        add("South", p3);   //Resultat

        priceAwnser.addActionListener(this);
        paidAwnser.addActionListener(this);

        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        CashBack cashBack = new CashBack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == priceAwnser || e.getSource() == paidAwnser) {
            int price = Integer.parseInt(priceAwnser.getText());
            int  paid = Integer.parseInt(paidAwnser.getText());
            int moneyBack = paid - price;
            if (cb1000.isSelected()) {
                result1000.setText(moneyBack / 1000 + " tusenlappar.");
                moneyBack = moneyBack % 1000;
            } else
                result1000.setText(0 + " tusenlappar.");

            if ((cb500.isSelected())) {
                result500.setText(moneyBack/500 + " femohundralappar.");
                moneyBack = moneyBack % 500;
            } else
                result500.setText(0 + " femohundralappar.");

            if ((cb200.isSelected())) {
                result200.setText(moneyBack/200 + " tvåhundralappar.");
                moneyBack = moneyBack % 200;
            } else
                result200.setText(0 + " tvåhundralappar.");

            if ((cb100.isSelected())) {
                result100.setText(moneyBack/100 + " hundralappar.");
                moneyBack = moneyBack % 100;
            } else
                result100.setText(0 + " hundralappar.");

            if ((cb50.isSelected())) {
                result50.setText(moneyBack/50 + " femtiolappar.");
                moneyBack = moneyBack % 50;
            } else
                result50.setText(0 + " femtiolappar.");

            if ((cb20.isSelected())) {
                result20.setText(moneyBack/20 + " tjugolappar.");
                moneyBack = moneyBack % 20;
            } else
                result20.setText(0 + " tjugolappar.");

            if ((cb10.isSelected())) {
                result10.setText(moneyBack/10 + " tio kronor.");
                moneyBack = moneyBack % 10;
            } else
                result10.setText(0 + " tio kronor.");

            if ((cb5.isSelected())) {
                result5.setText(moneyBack/5 + " fem kronor.");
                moneyBack = moneyBack % 5;
            } else
                result10.setText(0 + " fem, kronor.");


            if ((cb2.isSelected())) {
                result2.setText(moneyBack/2 + " två kronor.");
                moneyBack = moneyBack % 2;
            } else
                result2.setText(0 + " två kronor.");
            result1.setText(moneyBack + " En kronor");

        }
    }
}
