package HotelManagementSystem;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class first extends JFrame implements ActionListener {

    JLabel l1, l2, l3;
    JButton b1, b2, b3;

    public first() {
        //creating frame 
        setBounds(0, 0, 1700, 1240);

        //inserting image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("newwhms/Icons/reception.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1700, 1240, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1700, 1240);
        add(l3);
        //creating Jbuttons
        b1 = new JButton("Login As Admin");
        b1.setBounds(700, 350, 350, 50);
        b1.setFont(new Font("serif", Font.BOLD, 22));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.RED);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("Login As Reception");
        b2.setBounds(700, 500, 350, 50);
        b2.setFont(new Font("serif", Font.BOLD, 22));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.RED);
        b2.addActionListener(this);
        l3.add(b2);

        b3 = new JButton("Login As User");
        b3.setBounds(700, 650, 350, 50);
        b3.setFont(new Font("serif", Font.BOLD, 22));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.RED);
        b3.addActionListener(this);
        l3.add(b3);

        // font of hotel management systemm
        JLabel l2 = new JLabel("HOTEL OPERATIONS CONTROLER");
        l2.setBounds(350, 20, 1500, 100);
        l2.setFont(new Font("serif", Font.PLAIN, 70));
        l2.setForeground(Color.red);
        l3.add(l2);

        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            new Login_As_Admin().setVisible(true);
            setVisible(false);
        }
        if (ae.getSource() == b2) {
            new Login_As_Reception().setVisible(true);
            setVisible(false);

        }
        if (ae.getSource() == b3) {
            new Login_As_Customer().setVisible(true);
            setVisible(false);

        }
    }

    public static void main(String[] args) {
        first c = new first();
    }
}
