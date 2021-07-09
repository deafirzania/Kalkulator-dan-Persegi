/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.Container;

/**
 *
 * @author ASUS
 */
public class Calculator extends JFrame implements ActionListener {

    private JTextField jTFInput, jTFInput2, jTFHasil;
    private JButton btnkali, btntambah, btnkurang, btnbagi;

    public static void main(String[] args) {
        Calculator frame = new Calculator();
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Calculator");
        frame.setVisible(true);
        frame.setSize(550, 150);
    }

    public Calculator() {
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 1));
        p1.add(new JLabel("Bilangan 1"));
        p1.add(jTFInput = new JTextField(3));
        p1.add(new JLabel("Bilangan 2"));
        p1.add(jTFInput2 = new JTextField(3));
        p1.add(new JLabel("Hasil"));
        p1.add(jTFHasil = new JTextField(4));
        jTFHasil.setEditable(false);
        JPanel p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        p2.add(btnkali = new JButton("*"));
        btnkali.addActionListener(this);
        JPanel p3 = new JPanel();
        p3.setLayout(new FlowLayout());
        p3.add(btntambah = new JButton("+"));
        btntambah.addActionListener(this);
        JPanel p4 = new JPanel();
        p4.setLayout(new FlowLayout());
        p4.add(btnkurang = new JButton("-"));
        btnkurang.addActionListener(this);
        JPanel p5 = new JPanel();
        p4.setLayout(new FlowLayout());
        p4.add(btnbagi = new JButton("/"));
        btnbagi.addActionListener(this);
        Container container1 = getContentPane();
        container1.setLayout(new BorderLayout(150, 10));
        container1.add(p1);
        Container container = getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.LEFT, 40, 10));
        container.add(p2);
        container.add(p3);
        container.add(p4);
        container.add(p5);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnkali) {
            double bilangan1 = (Double.parseDouble(jTFInput.getText().trim()));
            double bilangan2 = (Double.parseDouble(jTFInput2.getText().trim()));
            double hasil = bilangan1 * bilangan2;
            jTFHasil.setText(String.valueOf(hasil));
        } else if (e.getSource() == btntambah) {
            double bilangan1 = (Double.parseDouble(jTFInput.getText().trim()));
            double bilangan2 = (Double.parseDouble(jTFInput2.getText().trim()));
            double hasil = bilangan1 + bilangan2;
            jTFHasil.setText(String.valueOf(hasil));
        } else if (e.getSource() == btnkurang) {
            double bilangan1 = (Double.parseDouble(jTFInput.getText().trim()));
            double bilangan2 = (Double.parseDouble(jTFInput2.getText().trim()));
            double hasil = bilangan1 - bilangan2;
            jTFHasil.setText(String.valueOf(hasil));
        } else {
            double bilangan1 = (Double.parseDouble(jTFInput.getText().trim()));
            double bilangan2 = (Double.parseDouble(jTFInput2.getText().trim()));
            double hasil = bilangan1 / bilangan2;
            jTFHasil.setText(String.valueOf(hasil));
        }
    }
}
