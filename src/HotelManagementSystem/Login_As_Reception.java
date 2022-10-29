package HotelManagementSystem;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;


public class Login_As_Reception extends JFrame implements ActionListener {
    
    
     
        JLabel l1,l2;
    JTextField t3;
    JPasswordField t4;
    JButton b1,b2;

    Login_As_Reception(){

        super("Login1");
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("newwhms/Icons/login.jpg"));
        Image i2 = i1.getImage().getScaledInstance(610,610,Image.SCALE_DEFAULT);
        ImageIcon i3 =  new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,610,610);
        add(l3);
        
        // font of hotel management systemm
       JLabel l2 =new JLabel("HOTEL OPERATIONS CONTROLER");
       l2.setBounds(0,4,1500,100);
       l2.setFont(new Font("serif",Font.PLAIN,40));
       l2.setForeground(Color.red);
       l3.add(l2);
        JLabel l4 =new JLabel("Login");
       l4.setBounds(230,120,1500,100);
       l4.setFont(new Font("serif",Font.PLAIN,40));
       l4.setForeground(Color.red);
       l3.add(l4);
       

        setLayout(null);

        l1 = new JLabel("Username");
         l1.setFont(new Font("serif",Font.BOLD,22));
        l1.setBackground(Color.white);
        l1.setForeground(Color.white);
        l1.setBounds(120,250,100,30);
        l3.add(l1);
        
        l2 = new JLabel("Password");
        l2.setFont(new Font("serif",Font.BOLD,22));
        l2.setBackground(Color.white);
        l2.setForeground(Color.white);
        l2.setBounds(120,250,100,30);
        l2.setBounds(120,320,100,30);
        l3.add(l2);
 
        t3=new JTextField();
        t3.setBounds(250,250,150,30);
        l3.add(t3);

        t4=new JPasswordField();
        t4.setBounds(250,320,150,30);
        l3.add(t4);
        
        
        


        b1 = new JButton("Login");
        b1.setBounds(150,450,120,30);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        b2=new JButton("Cancel");
        b2.setBounds(300,450,120,30);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        l3.add(b2);

        b2.addActionListener(this);
        
        
        getContentPane().setBackground(Color.WHITE);

        setVisible(true);
        setBounds(500,170,610,610);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
        try{
            conn c1 = new conn();
            String u = t3.getText();
            String p = t4.getText();
            
            String l = "select * from login1 where username1='"+u+"' and password1='"+p+"'";
            
            ResultSet r = c1.s.executeQuery(l); 
            if(r.next()){ 
                new dashboard_reception().setVisible(true);
                setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "Invalid login");
                setVisible(false);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        }else if(ae.getSource()==b2){
            new first().setVisible(true);
                setVisible(false);
        
        }
    }
    public static void main(String[] arg){
        new Login_As_Reception();
    }
}
        
        
    
    
