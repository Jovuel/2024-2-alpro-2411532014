package pekan8;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {

    private JFrame frame;
    private JTextField output;
    private double num1 = 0, num2 = 0, result = 0;
    private String operator = "";

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Calculator window = new Calculator();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Calculator() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        output = new JTextField();
        output.setBounds(10, 10, 260, 40);
        frame.getContentPane().add(output);
        output.setColumns(10);

        // Tombol Angka
        int x = 10, y = 60;
        for (int i = 1; i <= 9; i++) {
            JButton btn = new JButton(String.valueOf(i));
            btn.setBounds(x, y, 60, 40);
            frame.getContentPane().add(btn);
            x += 70;
            if (i % 3 == 0) {
                x = 10;
                y += 50;
            }
            btn.addActionListener(e -> output.setText(output.getText() + btn.getText()));
        }

        // Tombol 0 dan .
        JButton btn0 = new JButton("0");
        btn0.setBounds(10, 267, 130, 40);
        frame.getContentPane().add(btn0);
        btn0.addActionListener(e -> output.setText(output.getText() + "0"));

        JButton btnDot = new JButton(".");
        btnDot.setBounds(150, 267, 60, 40);
        frame.getContentPane().add(btnDot);
        btnDot.addActionListener(e -> output.setText(output.getText() + "."));

        // Tombol Operasi
        String[] operations = {"+", "-", "*", "/", "%"};
        y = 60;
        for (String op : operations) {
            JButton btnOp = new JButton(op);
            btnOp.setBounds(220, y, 50, 40);
            frame.getContentPane().add(btnOp);
            y += 50;
            btnOp.addActionListener(e -> {
                num1 = Double.parseDouble(output.getText());
                operator = op;
                output.setText("");
            });
        }

        // Tombol Hasil =
        JButton btnEquals = new JButton("=");
        btnEquals.setBounds(150, 211, 50, 40);
        frame.getContentPane().add(btnEquals);
        btnEquals.addActionListener(e -> {
            num2 = Double.parseDouble(output.getText());
            switch (operator) {
                case "+" -> result = num1 + num2;
                case "-" -> result = num1 - num2;
                case "*" -> result = num1 * num2;
                case "/" -> result = num1 / num2;
                case "%" -> result = num1 % num2;
            }
            output.setText(String.valueOf(result));
        });

        // Tombol Clear C
        JButton btnClear = new JButton("C");
        btnClear.setBounds(10, 211, 60, 40);
        frame.getContentPane().add(btnClear);
        btnClear.addActionListener(e -> output.setText(""));

        // Tombol Delete ⌫
        JButton btnDel = new JButton("⌫");
        btnDel.setBounds(80, 211, 60, 40);
        frame.getContentPane().add(btnDel);
        btnDel.addActionListener(e -> {
            String text = output.getText();
            if (!text.isEmpty()) {
                output.setText(text.substring(0, text.length() - 1));
            }
        });
    }
}
