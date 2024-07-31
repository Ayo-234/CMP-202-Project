package SimpleInterestCalculatorApp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class SimpleInterestCalculator {

    public static void main(String[] args) {
        new SimpleInterestCalculator().createGUI();
    }

    void createGUI() {
        JFrame frame = new JFrame("Simple Interest Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);

        JLabel principalLabel = new JLabel("Principal(₦):");
        principalLabel.setBounds(50, 50, 100, 30);
        frame.add(principalLabel);

        JTextField principalField = new JTextField();
        principalField.setBounds(150, 50, 200, 30);
        frame.add(principalField);

        JLabel rateLabel = new JLabel("Rate(%):");
        rateLabel.setBounds(50, 100, 100, 30);
        frame.add(rateLabel);

        JTextField rateField = new JTextField();
        rateField.setBounds(150, 100, 200, 30);
        frame.add(rateField);

        JLabel timeLabel = new JLabel("Time(yrs):");
        timeLabel.setBounds(50, 150, 100, 30);
        frame.add(timeLabel);

        JTextField timeField = new JTextField();
        timeField.setBounds(150, 150, 200, 30);
        frame.add(timeField);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.setBounds(50, 200, 300, 30);
        frame.add(calculateButton);

        JLabel resultLabel = new JLabel("Interest: ");
        resultLabel.setBounds(50, 250, 300, 30);
        frame.add(resultLabel);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateInterest(principalField, rateField, timeField, resultLabel);
            }
        });

        frame.setVisible(true);
    }

    void calculateInterest(JTextField principalField, JTextField rateField, JTextField timeField, JLabel resultLabel) {
        String principalText = principalField.getText();
        String rateText = rateField.getText();
        String timeText = timeField.getText();

        System.out.println("Principal: " + principalText);
        System.out.println("Rate: " + rateText);
        System.out.println("Time: " + timeText);

        if (!isValidDouble(principalText) || !isValidDouble(rateText) || !isValidDouble(timeText)) {
            JOptionPane.showMessageDialog(null, "Please enter valid numbers.");
            return;
        }

        double principal = Double.parseDouble(principalText);
        double rate = Double.parseDouble(rateText);
        double time = Double.parseDouble(timeText);

        if (principal <= 0 || rate <= 0 || time <= 0) {
            JOptionPane.showMessageDialog(null, "Principal, Rate, and Time must be greater than zero.");
            return;
        }

        double interest = (principal * rate * time) / 100;
        System.out.println("Calculated Interest: " + interest);
        resultLabel.setText("Interest: ₦" + interest);
        // resultLabel.repaint();
        // JOptionPane.showMessageDialog(null, "Calculated Interest: " + interest);
        saveResultToFile(principal, rate, time, interest);
    }

    boolean isValidDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    void saveResultToFile(double principal, double rate, double time, double interest) {
        try (FileWriter writer = new FileWriter("interest_result.txt")) {
            writer.write("Principal: ₦" + principal + "\n");
            writer.write("Rate: " + rate + "%" + "\n");java
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class SimpleInterestCalculator {

    public static void main(String[] args) {
        new SimpleInterestCalculator().createGUI();
    }

    void createGUI() {
        JFrame frame = new JFrame("Simple Interest Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);

        JLabel principalLabel = new JLabel("Principal(₦):");
        principalLabel.setBounds(50, 50, 100, 30);
        frame.add(principalLabel);

        JTextField principalField = new JTextField();
        principalField.setBounds(150, 50, 200, 30);
        frame.add(principalField);

        JLabel rateLabel = new JLabel("Rate(%):");
        rateLabel.setBounds(50, 100, 100, 30);
        frame.add(rateLabel);

        JTextField rateField = new JTextField();
        rateField.setBounds(150, 100, 200, 30);
        frame.add(rateField);

        JLabel timeLabel = new JLabel("Time(yrs):");
        timeLabel.setBounds(50, 150, 100, 30);
        frame.add(timeLabel);

        JTextField timeField = new JTextField();
        timeField.setBounds(150, 150
            writer.write("Time: " + time + "yrs" + "\n");
            writer.write("Interest: ₦" + interest + "\n");
            System.out.println("Result saved to file.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error saving result to file.");
        }
    }
}
