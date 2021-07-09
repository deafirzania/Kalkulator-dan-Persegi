/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author ASUS
 */
public class Persegi extends JFrame {
    
    JTextField bilangan1, bilangan2;

    /**
     * @param args the command line arguments
     */
    
    public Persegi(){
        super("Hitung Persegi");
        setSize(400,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        JLabel label1 = new JLabel("Sisi : ");
        
        bilangan1 = new JTextField(20);
        
        JButton tombol = new JButton("Count");
        JButton exit = new JButton("Exit");
        label1.setBounds(110,20,150,20);
        bilangan1.setBounds(150,20,150,20);
        tombol.setBounds(40,80,150,30);
        exit.setBounds(200, 80, 150, 30);
        
        panel.setLayout(null);
        panel.add(label1);
        panel.add(bilangan1);
        panel.add(tombol);
        panel.add(exit);
        add(panel);
        
        tombol.addActionListener(new ActionListener(){
           int sisi;
           public void actionPerformed(ActionEvent e){
               try{
                   sisi = Integer.parseInt(bilangan1.getText());
                   int hasil = sisi*sisi;
                   int hasil2 = sisi*4;
                   JOptionPane.showMessageDialog(null,"<html>Luas Persegi : "+hasil
                   +"<br>Keliling Persegi : "+ hasil2 +"</html>");
               } catch(Exception ex){
                   JOptionPane.showMessageDialog(null,"Isi Kotak Kosong dengan Angka");
               }
           }
        });
        exit.addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        setVisible(true);
        setLocationRelativeTo(null);
        show();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Persegi apps = new Persegi();
    }

}
