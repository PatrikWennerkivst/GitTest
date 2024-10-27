package Uppgift4a;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class TextEditor extends JFrame {

    JPanel panel = new JPanel();
    JLabel fileNamne = new JLabel("Filnamn:");
    JTextField name = new JTextField();
    JTextArea area = new JTextArea();
    JButton openButton = new JButton("Öppna");
    JButton saveButton = new JButton("Spara");
    JButton printButton = new JButton("Skriv ut");
    JButton exitButton = new JButton("Avuslta");

    JScrollPane scrollPane = new JScrollPane(area,
            JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
            JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

    public TextEditor() {
        area.setFont(new Font("Monospaced", Font.PLAIN, 12));
        panel.setLayout(new GridLayout(1, 6));
        panel.add(fileNamne);
        panel.add(name);
        panel.add(openButton);
        panel.add(saveButton);
        panel.add(printButton);
        panel.add(exitButton);

        //En ActionListener som läser in texten från filnamnet ifrån JTextField:en name??
        class ReadFileListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                readInFile(name.getText());
            }
        }

        //En ActionListener som anropar metoden saveFile för att spara texten i filen??
        class SaveFileListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveFile(name.getText());
            }
        }

        //En Actionlistener som anropar printern på datorn för att printa up texten ur JTextArea
        class PrintFileListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    area.print();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }

            //En Actionlistener som stänger ner programmet om JButton exitButton klickas på
            static class ExsitListener implements ActionListener {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            }
        }
        name.addActionListener(new ReadFileListener());
        openButton.addActionListener(new ReadFileListener());
        saveButton.addActionListener(new SaveFileListener());
        printButton.addActionListener(new PrintFileListener());
        exitButton.addActionListener(new PrintFileListener.ExsitListener());
        add(panel);

        setLayout(new BorderLayout());
        add(panel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        setSize(500, 300);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    //Metod som läser in en fil och lägger till den i JTextArea "area".
    private void readInFile(String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            area.write(writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Metod som sparar texten i filens och kopplar den till filens namn??
    private void saveFile(String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            area.write(writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TextEditor text = new TextEditor();
    }
}

