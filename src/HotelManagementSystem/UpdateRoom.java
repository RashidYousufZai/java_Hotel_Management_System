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
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UpdateRoom extends JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    private JPanel l1;
    private JTextField txt_ID;
    private JTextField txt_Ava;
    private JTextField txt_Status;
    private JTextField txt_Room;

    Choice c1;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UpdateRoom frame = new UpdateRoom();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void close() {
        this.dispose();
    }

    /**
     * Create the frame.
     *
     * @throws SQLException
     */
    public UpdateRoom() throws SQLException {
        //conn = Javaconnect.getDBConnection();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(530, 200, 1000, 450);
        l1 = new JPanel();
        l1.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(l1);
        l1.setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("neWwhms/Icons/RECEPTION.jpg"));
        Image i3 = i1.getImage().getScaledInstance(1000, 450, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel l1 = new JLabel(i2);
        l1.setBounds(0, 0, 1000, 450);
        add(l1);

        JLabel lblUpdateRoomStatus = new JLabel("Update Room Status");
        lblUpdateRoomStatus.setForeground(Color.red);
        lblUpdateRoomStatus.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblUpdateRoomStatus.setBounds(85, 11, 206, 34);
        l1.add(lblUpdateRoomStatus);

        JLabel lblNewLabel = new JLabel("Guest ID:");
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setBounds(27, 87, 90, 14);
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
        c1.setBounds(160, 84, 140, 20);
        l1.add(c1);

        JLabel lblAvailability = new JLabel("Availability:");
        lblAvailability.setForeground(Color.WHITE);
        lblAvailability.setBounds(27, 187, 90, 14);
        l1.add(lblAvailability);

        JLabel lblCleanStatus = new JLabel("Clean Status:");
        lblCleanStatus.setForeground(Color.WHITE);
        lblCleanStatus.setBounds(27, 240, 90, 14);
        l1.add(lblCleanStatus);

        txt_Ava = new JTextField();
        txt_Ava.setBounds(160, 184, 140, 20);
        l1.add(txt_Ava);
        txt_Ava.setColumns(10);

        txt_Status = new JTextField();
        txt_Status.setBounds(160, 237, 140, 20);
        l1.add(txt_Status);
        txt_Status.setColumns(10);

        txt_Room = new JTextField();
        txt_Room.setBounds(160, 130, 140, 20);
        l1.add(txt_Room);
        txt_Room.setColumns(10);

        JButton b1 = new JButton("Check");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String s1 = c1.getSelectedItem();
                    conn c = new conn();
                    ResultSet rs1 = c.s.executeQuery("select * from customer where number = " + s1);

                    while (rs1.next()) {
                        txt_Room.setText(rs1.getString("room"));
                    }

                    ResultSet rs2 = c.s.executeQuery("select * from room where roomnumber = " + txt_Room.getText());
                    while (rs2.next()) {
                        txt_Ava.setText(rs2.getString("availability"));
                        txt_Status.setText(rs2.getString("cleaning_status"));
                    }
                } catch (Exception ee) {
                }
            }
        });
        b1.setBounds(120, 315, 89, 23);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        l1.add(b1);

        JButton btnUpdate = new JButton("Update");
        btnUpdate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) throws NumberFormatException {

                try {
                    conn c = new conn();
                    String str = "update room set cleaning_status = '" + txt_Status.getText() + "' where roomnumber = " + txt_Room.getText();
                    c.s.executeUpdate(str);
                    JOptionPane.showMessageDialog(null, "Update Sucessful");

                    new dashboard_reception().setVisible(true);
                    setVisible(false);
                } catch (Exception ee) {
                    ee.printStackTrace();
                }

            }
        });
        btnUpdate.setBounds(60, 355, 89, 23);
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
        btnExit.setBounds(180, 355, 89, 23);
        btnExit.setBackground(Color.BLACK);
        btnExit.setForeground(Color.WHITE);
        l1.add(btnExit);

        JLabel lblRoomId = new JLabel("Room Number:");
        lblRoomId.setBounds(27, 133, 100, 14);
        lblRoomId.setForeground(Color.WHITE);
        l1.add(lblRoomId);

        getContentPane().setBackground(Color.WHITE);
    }

}
