package FilmDemo.SwingKomponenter2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldDemo extends JFrame implements ActionListener {

    JPanel panel = new JPanel();

    JPanel resultPanel = new JPanel();

    JLabel label = new JLabel("Skriv något: ");

    JTextField textField = new JTextField(10);

    JLabel youWrote = new JLabel("Du skrev: ");

    TextFieldDemo() {
        setLayout(new GridLayout(2,1));
        add(panel);
        panel.add(label);
        panel.add(textField);
        textField.addActionListener(this);
        resultPanel.add(youWrote);
        this.add(resultPanel);

        pack();
        setSize(300,300);
        setVisible(true);
        setLocation(1000,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        TextFieldDemo komp = new TextFieldDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        youWrote.setText("Du skrev: " + textField.getText());
    }
}
