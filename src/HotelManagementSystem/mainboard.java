package HotelManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class mainboard extends JFrame implements ActionListener {

    JLabel l1, l2, l3;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15;

    public mainboard() {
        //creating frame 
        setBounds(0, 0, 1700, 1240);

        //inserting image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("newwhms/Icons/reception.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1700, 1240, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l5 = new JLabel(i3);
        l5.setBounds(0, 0, 1700, 1240);
        add(l5);
        //creating Jbuttons
        b1 = new JButton("Add Employee");
        b1.setBounds(1100, 350, 250, 50);
        b1.setFont(new Font("serif", Font.BOLD, 15));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l5.add(b1);

        b2 = new JButton("Add Driver");
        b2.setBounds(1100, 500, 250, 50);
        b2.setFont(new Font("serif", Font.BOLD, 15));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l5.add(b2);
        b3 = new JButton("Add Rooom");
        b3.setBounds(1100, 650, 250, 50);
        b3.setFont(new Font("serif", Font.BOLD, 15));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
        l5.add(b3);

        b4 = new JButton("New Costomer Form");
        b4.setBounds(90, 350, 250, 50);
        b4.setFont(new Font("serif", Font.BOLD, 15));
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.addActionListener(this);
        l5.add(b4);
        b5 = new JButton("Room");
        b5.setBounds(370, 350, 250, 50);
        b5.addActionListener(this);
        b5.setFont(new Font("serif", Font.BOLD, 15));
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        l5.add(b5);
        b6 = new JButton("Department");
        b6.setBounds(90, 430, 250, 50);
        b6.setFont(new Font("serif", Font.BOLD, 15));
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.WHITE);
        b6.addActionListener(this);
        l5.add(b6);
        b7 = new JButton("All Employee Info");
        b7.setBounds(370, 430, 250, 50);
        b7.setFont(new Font("serif", Font.BOLD, 15));
        b7.setBackground(Color.BLACK);
        b7.setForeground(Color.WHITE);
        b7.addActionListener(this);
        l5.add(b7);
        b8 = new JButton("Costumer Info");
        b8.setBounds(90, 510, 250, 50);
        b8.setFont(new Font("serif", Font.BOLD, 15));
        b8.setBackground(Color.BLACK);
        b8.setForeground(Color.WHITE);
        b8.addActionListener(this);
        l5.add(b8);
        b9 = new JButton("Manager Info");
        b9.setBounds(370, 510, 250, 50);
        b9.setFont(new Font("serif", Font.BOLD, 15));
        b9.setBackground(Color.BLACK);
        b9.setForeground(Color.WHITE);
        b9.addActionListener(this);
        l5.add(b9);
        b10 = new JButton("Check Out");
        b10.setBounds(90, 590, 250, 50);
        b10.setFont(new Font("serif", Font.BOLD, 15));
        b10.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b10.addActionListener(this);
        l5.add(b10);
        b11 = new JButton("Update Check Status");
        b11.setBounds(370, 590, 250, 50);
        b11.setFont(new Font("serif", Font.BOLD, 15));
        b11.setBackground(Color.BLACK);
        b11.setForeground(Color.WHITE);
        b11.addActionListener(this);
        l5.add(b11);
        b12 = new JButton("Update Room Status");
        b12.setBounds(90, 670, 250, 50);
        b12.setFont(new Font("serif", Font.BOLD, 15));
        b12.setBackground(Color.BLACK);
        b12.setForeground(Color.WHITE);
        b12.addActionListener(this);
        l5.add(b12);
        b13 = new JButton("Pick Up Service");
        b13.setBounds(370, 670, 250, 50);
        b13.setFont(new Font("serif", Font.BOLD, 15));
        b14.setBackground(Color.BLACK);
        b14.setForeground(Color.WHITE);
        b14.addActionListener(this);
        l5.add(b13);
        b14 = new JButton("Search RoOm");
        b14.setBounds(220, 750, 250, 50);
        b14.setFont(new Font("serif", Font.BOLD, 15));
        b14.setBackground(Color.BLACK);
        b15.setForeground(Color.WHITE);
        b14.addActionListener(this);
        l5.add(b14);
        b15 = new JButton("Logout");
        b15.setBounds(1400, 880, 250, 50);
        b15.setFont(new Font("serif", Font.BOLD, 15));
        b15.setBackground(Color.BLACK);
        b15.setForeground(Color.WHITE);
        b15.addActionListener(this);
        l5.add(b15);
        // font of hotel management systemm
        JLabel l2 = new JLabel("HOTEL MANAGEMENT SYSTEM");
        l2.setBounds(350, 20, 1500, 100);
        l2.setFont(new Font("serif", Font.PLAIN, 70));
        b2.setFont(new Font("serif", Font.BOLD, 15));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        l2.setForeground(Color.red);
        l5.add(l2);

        JLabel l3 = new JLabel("Admin");
        l3.setBounds(1160, 160, 1500, 100);
        l3.setFont(new Font("serif", Font.PLAIN, 40));
        l3.setForeground(Color.red);
        l5.add(l3);

        JLabel l4 = new JLabel("Reception");
        l4.setBounds(300, 160, 1500, 100);
        l4.setFont(new Font("serif", Font.PLAIN, 40));
        l4.setForeground(Color.red);
        l5.add(l4);

        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        mainboard cob = new mainboard();

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
