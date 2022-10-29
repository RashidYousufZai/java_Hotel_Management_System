/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelManagementSystem;

import java.awt.BorderLayout;
import java.awt.*;

import java.sql.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UpdateCheck extends JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    private JPanel l1;
    private JTextField tfRoom;
    private JTextField txt_Room;
    private JTextField tfName;
    private JTextField txt_Date;
    private JTextField tfdeposit;
    private JTextField txt_Payment;

    Choice c1, c2;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UpdateCheck frame = new UpdateCheck();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
//	public void close(){
//		this.dispose();
//	}

    /**
     * Create the frame.
     *
     * @throws SQLException
     */
    public UpdateCheck() throws SQLException {
        //conn = Javaconnect.getDBConnection();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500, 200, 950, 500);
        l1 = new JPanel();
        l1.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(l1);
        l1.setLayout(null);

        JLabel lblUpdateCheckStatus = new JLabel("Check-In Details");
        lblUpdateCheckStatus.setForeground(Color.red);
        lblUpdateCheckStatus.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblUpdateCheckStatus.setBounds(124, 11, 222, 25);
        l1.add(lblUpdateCheckStatus);

//                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("newwhms/Icons/reception.jpg"));
//                JLabel l1 = new JLabel(i1);
//                l1.setBounds(0,0,950,500);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("newwhms/Icons/reception.jpg"));
        Image i2 = i1.getImage().getScaledInstance(950, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 960, 500);
        add(l1);

        JLabel lblNewLabel = new JLabel("ID:");
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setBounds(25, 88, 46, 14);
        l1.add(lblNewLabel);

        c1 = new Choice();
        try {
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from customer");
            while (rs.next()) {
                c1.add(rs.getString("number"));
            }
        } catch (Exception e) {
        }
        c1.setBounds(248, 85, 140, 20);
        l1.add(c1);

        JLabel lblNewLabel_1 = new JLabel("Room Number :");
        lblNewLabel_1.setForeground(Color.WHITE);
        lblNewLabel_1.setBounds(25, 129, 107, 14);
        l1.add(lblNewLabel_1);

        tfRoom = new JTextField();
        tfRoom.setBounds(248, 126, 140, 20);
        l1.add(tfRoom);

        JLabel lblNewLabel_2 = new JLabel("Name : ");
        lblNewLabel_2.setForeground(Color.WHITE);
        lblNewLabel_2.setBounds(25, 174, 97, 14);
        l1.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("Checked-in :");
        lblNewLabel_3.setForeground(Color.WHITE);
        lblNewLabel_3.setBounds(25, 216, 107, 14);
        l1.add(lblNewLabel_3);

        JLabel lblNewLabel_4 = new JLabel("Amount Paid (Rs) : ");
        lblNewLabel_4.setForeground(Color.WHITE);
        lblNewLabel_4.setBounds(25, 261, 107, 14);
        l1.add(lblNewLabel_4);

        JLabel lblNewLabel_5 = new JLabel("Pending Amount (Rs) : ");
        lblNewLabel_5.setForeground(Color.WHITE);
        lblNewLabel_5.setBounds(25, 302, 150, 14);
        l1.add(lblNewLabel_5);

        tfName = new JTextField();
        tfName.setBounds(248, 171, 140, 20);
        l1.add(tfName);
        tfName.setColumns(10);

        txt_Date = new JTextField();
        txt_Date.setBounds(248, 216, 140, 20);
        l1.add(txt_Date);
        txt_Date.setColumns(10);

        tfdeposit = new JTextField();
        tfdeposit.setBounds(248, 258, 140, 20);
        l1.add(tfdeposit);
        tfdeposit.setColumns(10);

        txt_Payment = new JTextField();
        txt_Payment.setBounds(248, 299, 140, 20);
        l1.add(txt_Payment);
        txt_Payment.setColumns(10);

        JButton btnUpdate = new JButton("Update");
        btnUpdate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                String s1 = c1.getSelectedItem();
                    String s2 = tfRoom.getText(); //room_number;    
                    String s3 = tfName.getText(); //name    
                    String s4 = txt_Date.getText(); //status;    
                    String s5 = tfdeposit.getText(); //deposit    

                try {
                    conn c = new conn();

                    
                    c.s.executeUpdate("update customer set room = '" + s2 + "', name = '" + s3 + "', checkintime = '" + s4 + "', deposit = '" + s5 + "' where number = '" + s1 + "'");

                    JOptionPane.showMessageDialog(null, "Data Updated Successfully");
                    new dashboard_reception().setVisible(true);
                    setVisible(false);
                } catch (Exception ee) {
                    System.out.println(ee);
                }

            }
        });
        btnUpdate.setBounds(168, 378, 89, 23);
        btnUpdate.setBackground(Color.BLACK);
        btnUpdate.setForeground(Color.WHITE);
        l1.add(btnUpdate);

        JButton btnExit = new JButton("Back");
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new dashboard_reception().setVisible(true);
                setVisible(false);
            }
        });
        btnExit.setBounds(281, 378, 89, 23);
        btnExit.setBackground(Color.BLACK);
        btnExit.setForeground(Color.WHITE);
        l1.add(btnExit);

        JButton btnAdd = new JButton("Check");
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s1 = c1.getSelectedItem();
                String query = "select * from customer where number = " + s1;
                try {
                    
                    conn c = new conn();
                    ResultSet rs1 = c.s.executeQuery(query);

                    while (rs1.next()) {
                        tfRoom.setText(rs1.getString("room"));
                        tfName.setText(rs1.getString("name"));
                        txt_Date.setText(rs1.getString("checkintime"));
                        tfdeposit.setText(rs1.getString("deposit"));
                    }
                } catch (Exception ee) {
                }

                try {
                    String total = "";
                    conn c = new conn();
                    ResultSet rs2 = c.s.executeQuery("select * from room where roomnumber = " + tfRoom.getText());
                    while (rs2.next()) {
                        total = rs2.getString("price");

                    }
                    String paid = tfdeposit.getText();
                    int pending = Integer.parseInt(total) - Integer.parseInt(paid);

                    txt_Payment.setText(Integer.toString(pending));

                } catch (Exception ee) {
                }
            }
        });
        btnAdd.setBounds(56, 378, 89, 23);
        btnAdd.setBackground(Color.BLACK);
        btnAdd.setForeground(Color.WHITE);
        l1.add(btnAdd);

        getContentPane().setBackground(Color.WHITE);
    }

}
