package FilmDemo.SwingIntro.SwingKompnenter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.IOException;

public class TextAreaDemo extends JFrame implements ActionListener {

    private JPanel p = new JPanel();

    private JPanel buttonPannel = new JPanel();

    private JTextArea area = new JTextArea();

    private  JScrollPane jsp = new JScrollPane(area);

    private JButton doubleButton = new JButton("Double");

    private  JButton clearButton = new JButton("Clear");

    public  TextAreaDemo() throws IOException {
        area.setFont(new Font("Monospaced", Font.PLAIN, 12));
        p.setLayout(new BorderLayout());
        p.add(jsp, BorderLayout.CENTER);
        buttonPannel.add(doubleButton);
        buttonPannel.add(clearButton);
        p.add(buttonPannel, BorderLayout.SOUTH);
        area.setLineWrap(true);
        add(p);

        doubleButton.addActionListener(this);
        clearButton.addActionListener(this);

        area.read(new FileReader("src/FilmDemo/SwingKomponenter2/text.txt"), null);

        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clearButton) {
            area.setText("");
        } else if (e.getSource() == doubleButton) {
            String newString = area.getText() + area.getText();
            area.setText(newString);
        }
    }

    public static void main(String[] args) throws IOException {
        TextAreaDemo textAreaDemo = new TextAreaDemo();
    }
}
