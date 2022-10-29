package HotelManagementSystem;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class dashboard_reception extends JFrame implements ActionListener {

    JButton b1, b2, b3, c3, b4, b5, b6, b7, b8, b9, b10, b11, b12;

    public dashboard_reception() {
        //creating frame 
        setBounds(0, 0, 1700, 1240);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("newwhms/Icons/reception.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1700, 1240, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1700, 1240);
        add(l3);

        c3 = new JButton("New Costomer Form");
        c3.setBounds(90, 350, 250, 50);
        c3.setBackground(Color.BLACK);
        c3.setForeground(Color.WHITE);
        c3.addActionListener(this);
        l3.add(c3);
        b2 = new JButton("Room");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(370, 350, 250, 50);
        b2.addActionListener(this);
        l3.add(b2);
        b3 = new JButton("Department");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(90, 430, 250, 50);
        b3.addActionListener(this);
        l3.add(b3);
        b4 = new JButton("All Employee Info");
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setBounds(370, 430, 250, 50);
        b4.addActionListener(this);
        l3.add(b4);
        b5 = new JButton("Costumer Info");
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        b5.setBounds(90, 510, 250, 50);
        b5.addActionListener(this);
        l3.add(b5);
        b6 = new JButton("Manager Info");
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.WHITE);
        b6.setBounds(370, 510, 250, 50);
        b6.addActionListener(this);
        l3.add(b6);
        b7 = new JButton("Check Out");
        b7.setBackground(Color.BLACK);
        b7.setForeground(Color.WHITE);
        b7.setBounds(90, 590, 250, 50);
        b7.addActionListener(this);
        l3.add(b7);
        b8 = new JButton("Update Check Status");
        b8.setBackground(Color.BLACK);
        b8.setForeground(Color.WHITE);
        b8.setBounds(370, 590, 250, 50);
        b8.addActionListener(this);
        l3.add(b8);
        b9 = new JButton("Update Room Status");
        b9.setBackground(Color.BLACK);
        b9.setForeground(Color.WHITE);
        b9.setBounds(90, 670, 250, 50);
        b9.addActionListener(this);
        l3.add(b9);
        b10 = new JButton("Pick Up Service");
        b10.setBackground(Color.BLACK);
        b10.setForeground(Color.WHITE);
        b10.setBounds(370, 670, 250, 50);
        b10.addActionListener(this);
        l3.add(b10);
        b11 = new JButton("Search RoOM");
        b11.setBackground(Color.BLACK);
        b11.setForeground(Color.WHITE);
        b11.setBounds(220, 750, 250, 50);
        b11.addActionListener(this);
        l3.add(b11);
        b12 = new JButton("Logout");
        b12.setBackground(Color.BLACK);
        b12.setForeground(Color.WHITE);
        b12.setBounds(1400, 880, 250, 50);
        b12.addActionListener(this);
        l3.add(b12);

        // font of hotel management systemm
        JLabel l2 = new JLabel("HOTEL OPERATIONS CONTROLER");

        l2.setBounds(350, 20, 1500, 100);
        l2.setFont(new Font("serif", Font.PLAIN, 70));
        l2.setForeground(Color.red);
        l3.add(l2);
        JLabel l4 = new JLabel("Reception");
        l4.setBounds(300, 160, 1500, 100);
        l4.setFont(new Font("serif", Font.PLAIN, 40));
        l4.setForeground(Color.red);
        l3.add(l4);

        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == c3) {
            try {
                new NewCustomer().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(dashboard_reception.class.getName()).log(Level.SEVERE, null, ex);
            }
            setVisible(false);

        }
        if (ae.getSource() == b2) {
            try {
                new Room().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(dashboard_reception.class.getName()).log(Level.SEVERE, null, ex);
            }
            setVisible(false);

        }
        if (ae.getSource() == b3) {
            try {
                new Department().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(dashboard_reception.class.getName()).log(Level.SEVERE, null, ex);
            }
            setVisible(false);

        }
        if (ae.getSource() == b4) {
            try {
                new Employee().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(dashboard_reception.class.getName()).log(Level.SEVERE, null, ex);
            }
            setVisible(false);

        }
        if (ae.getSource() == b5) {
            try {
                new CustomerInfo().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(dashboard_reception.class.getName()).log(Level.SEVERE, null, ex);
            }
            setVisible(false);

        }
        if (ae.getSource() == b6) {
            try {
                new ManagerInfo().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(dashboard_reception.class.getName()).log(Level.SEVERE, null, ex);
            }
            setVisible(false);

        }
        if (ae.getSource() == b7) {
            try {
                new CheckOut().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(dashboard_reception.class.getName()).log(Level.SEVERE, null, ex);
            }
            setVisible(false);

        }

        if (ae.getSource() == b8) {
            try {
                new UpdateCheck().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(dashboard_reception.class.getName()).log(Level.SEVERE, null, ex);
            }
            setVisible(false);

        }
        if (ae.getSource() == b9) {
            try {
                new UpdateRoom().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(dashboard_reception.class.getName()).log(Level.SEVERE, null, ex);
            }
            setVisible(false);

        }
        if (ae.getSource() == b10) {
            try {
                new PickUp().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(dashboard_reception.class.getName()).log(Level.SEVERE, null, ex);
            }
            setVisible(false);

        }
        if (ae.getSource() == b11) {
            try {
                new SearchRoom().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(dashboard_reception.class.getName()).log(Level.SEVERE, null, ex);
            }
            setVisible(false);

        }
        if (ae.getSource() == b12) {
            new first().setVisible(true);
            setVisible(false);

        }

    }

    public static void main(String[] args) {
        dashboard_reception d = new dashboard_reception();
    }
}
