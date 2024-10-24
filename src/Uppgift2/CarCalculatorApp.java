package Uppgift2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class CarCalculatorApp extends JFrame implements ActionListener {

        JLabel mileageTodayLabel = new JLabel("Ange mätarställning nu:");
        JLabel mileageLastYearlabel = new JLabel("Ange mättarställning föe ett år sedan:");
        JLabel GasUsedLabel = new JLabel("Ange antal L förburkad bensin:");

        JTextField mileageLastYear = new JTextField(30);
        JTextField mileageToday = new JTextField(30);
        JTextField GasUsed= new JTextField(30);

        JLabel drivenMilesToday = new JLabel(" ");
        JLabel litersOfGas = new JLabel(" ");
        JLabel litersPerMile = new JLabel(" ");

        JPanel questions = new JPanel();
        JPanel awnser = new JPanel();
        JPanel calculatedAwnser = new JPanel();

        public CarCalculatorApp(){

            questions.setLayout(new BorderLayout());
            add(questions, BorderLayout.WEST);
            add(awnser, BorderLayout.EAST);
            add(calculatedAwnser, BorderLayout.SOUTH);

            questions.setLayout(new GridLayout(3,1));
            questions.add(mileageTodayLabel);
            questions.add(mileageLastYearlabel);
            questions.add(GasUsedLabel);
            awnser.setLayout(new GridLayout(3,1));
            awnser.add(mileageToday);
            awnser.add(mileageLastYear);
            awnser.add(GasUsed);
            calculatedAwnser.setLayout(new GridLayout(3,1));
            calculatedAwnser.add(drivenMilesToday);
            calculatedAwnser.add(litersOfGas);
            calculatedAwnser.add(litersPerMile);

            mileageToday.addActionListener(this);
            mileageLastYear.addActionListener(this);
            GasUsed.addActionListener(this);

            pack();
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }

        protected static double usagePerMile(double amountOfGas, double amountOfMiles) {
            return amountOfGas / amountOfMiles;
        }

        protected static double milesDriven(double currentMileage, double lastYearsMileage) {
            return  currentMileage - lastYearsMileage;
        }

    public static void main(String[] args) {
        CarCalculatorApp car = new CarCalculatorApp();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Scanner scanMilesToday = new Scanner(mileageToday.getText());
        Scanner scanMilesLastYear = new Scanner(mileageLastYear.getText());
        Scanner scanGasUsed = new Scanner(GasUsed.getText());

        if (scanMilesToday.hasNextDouble() && scanMilesLastYear.hasNextDouble() && scanGasUsed.hasNextDouble()) {
            double inputMilesToday = scanMilesToday.nextDouble();
            double inputMilesLastYear = scanMilesLastYear.nextDouble();
            double inputGasUsed = scanGasUsed.nextDouble();

            double driveMiles = milesDriven(inputMilesToday, inputMilesLastYear);

            drivenMilesToday.setText(String.format("Antal körda mil: %8.0f \n", driveMiles));
            GasUsedLabel.setText(String.format("Antal liter bensin: %7.1f \n", inputGasUsed));
            litersPerMile.setText(String.format("Förbrukning per mil: %1.2f \n", usagePerMile(inputGasUsed, driveMiles) ));
        }

    }
}
