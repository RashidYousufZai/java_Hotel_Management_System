/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelManagementSystem;

import java.awt.BorderLayout;
import java.awt.*;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Image;
import java.sql.*;	
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class NewCostumerF extends JFrame {
	Connection conn = null;
	PreparedStatement pst = null;
	private JPanel contentPane;
	private JTextField t1,t2,t3,t4,t5,t6;
        JComboBox comboBox;
        JRadioButton r1,r2;
        Choice c1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewCustomer frame = new NewCustomer();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public NewCostumerF() throws SQLException {
		
                setBounds(530, 200, 850, 550);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("newwhms/Icons/reception.jpg"));
                Image i3 = i1.getImage().getScaledInstance(850, 550,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel l1 = new JLabel(i2);
                l1.setBounds(0,0,850,550);
                add(l1);
		
		JLabel lblName = new JLabel("NEW CUSTOMER FORM");
		lblName.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
                lblName.setBackground(Color.WHITE);
                lblName.setForeground(Color.WHITE);
		lblName.setBounds(118, 11, 260, 53);
		l1.add(lblName);
                
                JLabel lblId = new JLabel("ID :");
                lblId.setFont(new Font("serif",Font.BOLD,20));
                lblId.setBackground(Color.WHITE);
                lblId.setForeground(Color.WHITE);
		lblId.setBounds(35, 76, 200, 14);
		l1.add(lblId);
                
                comboBox = new JComboBox(new String[] {"Passport", "Cnic Card", "Voter Id", "Driving license"});
		comboBox.setBounds(271, 73, 150, 20);
		l1.add(comboBox);
                
                JLabel l2 = new JLabel("Number :");
                l2.setFont(new Font("serif",Font.BOLD,15));
        l2.setBackground(Color.WHITE);
        l2.setForeground(Color.WHITE);
       
		l2.setBounds(35, 111, 200, 14);
		l1.add(l2);
                
                t1 = new JTextField();
		t1.setBounds(271, 111, 150, 20);
		l1.add(t1);
		t1.setColumns(10);
		
		JLabel lblName_1 = new JLabel("Name :");
                lblName_1.setFont(new Font("serif",Font.BOLD,15));
        lblName_1.setBackground(Color.WHITE);
        lblName_1.setForeground(Color.WHITE);
		lblName_1.setBounds(35, 151, 200, 14);
		l1.add(lblName_1);
		
		t2 = new JTextField();
		t2.setBounds(271, 151, 150, 20);
		l1.add(t2);
		t2.setColumns(10);

                
		JLabel lblGender = new JLabel("Gender :");
                lblGender.setFont(new Font("serif",Font.BOLD,15));
        lblGender.setBackground(Color.white);
        lblGender.setForeground(Color.WHITE);
		lblGender.setBounds(35, 191, 200, 14);
		l1.add(lblGender);
                
                r1 = new JRadioButton("Male");
                r1.setFont(new Font("Raleway", Font.BOLD, 12));
                r1.setBackground(Color.WHITE);
                r1.setBackground(Color.RED);
                r1.setBounds(271, 191, 80, 12);
                l1.add(r1);
                
                r2 = new JRadioButton("Female");
                r2.setFont(new Font("Raleway", Font.BOLD, 12));
                r2.setBackground(Color.WHITE);        
                r2.setBackground(Color.RED);
                r2.setBounds(350, 191, 100, 12);
		l1.add(r2);
                
		JLabel lblCountry = new JLabel("Country :");
                lblCountry.setFont(new Font("serif",Font.BOLD,15));
        lblCountry.setBackground(Color.WHITE);
        lblCountry.setForeground(Color.WHITE);
		lblCountry.setBounds(35, 231, 200, 14);
		l1.add(lblCountry);
		
		JLabel lblReserveRoomNumber = new JLabel("Allocated Room Number :");
                lblReserveRoomNumber.setFont(new Font("serif",Font.BOLD,15));
        lblReserveRoomNumber.setBackground(Color.WHITE);
        lblReserveRoomNumber.setForeground(Color.WHITE);
		lblReserveRoomNumber.setBounds(35, 274, 200, 14);
		l1.add(lblReserveRoomNumber);
                
                c1 = new Choice();
                try{
                    conn c = new conn();
                    ResultSet rs = c.s.executeQuery("select * from room");
                    while(rs.next()){
                        c1.add(rs.getString("room_number"));    
                    }
                }catch(Exception e){ }
                c1.setBounds(271, 274, 150, 20);
		l1.add(c1);
		
		JLabel lblCheckInStatus = new JLabel("Checked-In :");
                lblCheckInStatus.setFont(new Font("serif",Font.BOLD,15));
        lblCheckInStatus.setBackground(Color.WHITE);
        lblCheckInStatus.setForeground(Color.WHITE);
		lblCheckInStatus.setBounds(35, 316, 200, 14);
		l1.add(lblCheckInStatus);
		
		JLabel lblDeposite = new JLabel("Check-Out :");
                lblDeposite.setFont(new Font("serif",Font.BOLD,15));
        lblDeposite.setBackground(Color.WHITE);
        lblDeposite.setForeground(Color.WHITE);
		lblDeposite.setBounds(35, 359, 200, 14);
		l1.add(lblDeposite);
		
		
		
		
		
		t3 = new JTextField();
		t3.setBounds(271, 231, 150, 20);
		l1.add(t3);
		t3.setColumns(10);
		
		
		t5 = new JTextField();
		t5.setBounds(271, 316, 150, 20);
		l1.add(t5);
		t5.setColumns(10);
		
		t6 = new JTextField();
		t6.setBounds(271, 359, 150, 20);
		l1.add(t6);
		t6.setColumns(10);

		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            conn c = new conn();
                            String radio = null;
                            
                            if(r1.isSelected()){ 
                                radio = "Male";
                            }
                            if(r2.isSelected()){ 
                                radio = "Female";
                            }
                            
                            String s6 = c1.getSelectedItem();
                          
                            try{
	    			
                                String s1 = (String)comboBox.getSelectedItem(); 
	    			String s2 =  t1.getText();
	    			String s3 =  t2.getText();
                                String s4 =  radio;
	    			String s5 =  t3.getText();
	    			String s7 =  t5.getText();
                                String s8 =  t6.getText();
                                
                              
                                
                                
                                String q1 = "insert into customer values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"')";
                                String q2 = "update room set availability = 'Occupied' where room_number = "+s6;
                                c.s.executeUpdate(q1);
                                c.s.executeUpdate(q2);
	    			
	    			
	    			JOptionPane.showMessageDialog(null, "Data Inserted Successfully");
                                new first().setVisible(true);
                                setVisible(false);
	    		}catch(SQLException e1){
	    			System.out.println(e1.getMessage());
	    		}
		    		catch(NumberFormatException s){
		    			JOptionPane.showMessageDialog(null, "Please enter a valid Number");
			}
			}
		});
		btnNewButton.setBounds(100, 430, 120, 30);
                btnNewButton.setBackground(Color.BLACK);
                btnNewButton.setForeground(Color.WHITE);
		l1.add(btnNewButton);
		
		JButton btnExit = new JButton("Back");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            new first().setVisible(true);
                            setVisible(false);
			}
		}); 
		btnExit.setBounds(260, 430, 120, 30);
                btnExit.setBackground(Color.BLACK);
                btnExit.setForeground(Color.WHITE);
                l1.add(btnExit);
                
                getContentPane().setBackground(Color.WHITE);
	}
}