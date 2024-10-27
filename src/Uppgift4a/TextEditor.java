package Uppgift4a;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextEditor extends JFrame{

    JPanel panel = new JPanel();
    JLabel fileNamne = new JLabel("Filnamn:");
    JTextField searchButton = new JTextField();
    JTextArea text = new JTextArea();
    JButton openButton = new JButton("Öppna");
    JButton saveButton = new JButton("Spara");
    JButton printButton = new JButton("Skriv ut");
    JButton exitButton = new JButton("Avuslta");

    public TextEditor(){

        add(panel);
        panel.setLayout(new GridLayout(1,6));
        panel.add(fileNamne);
        panel.add(searchButton);
        panel.add(openButton);
        panel.add(saveButton);
        panel.add(printButton);
        panel.add(exitButton);
        setLayout(new BorderLayout());
        add(panel, BorderLayout.NORTH);
        add(text, BorderLayout.CENTER);

        setSize(500,300);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        TextEditor text = new TextEditor();
    }
}
