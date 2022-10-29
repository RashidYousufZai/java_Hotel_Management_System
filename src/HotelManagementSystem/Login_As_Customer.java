package HotelManagementSystem;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Login_As_Customer extends JFrame implements ActionListener {
    
    
     
        JLabel l1,l2;
    JTextField t3;
    JPasswordField t4;
    JButton b1,b2,b3;

    Login_As_Customer(){

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
       l2.setFont(new Font("serif",Font.PLAIN,36));
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
        b2.addActionListener(this);
        l3.add(b2);
        
        b3 = new JButton("Create New Account");
        b3.setBounds(150,500,270,30);
        b3.setFont(new Font("serif",Font.BOLD,15));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
        l3.add(b3);
        
        
        
        getContentPane().setBackground(Color.WHITE);

        setVisible(true);
        setBounds(520,170,610,610);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
        try{
            conn c1 = new conn();
            String u = t3.getText();
            String p = t4.getText();
            
            String l = "select Name Password from Login_Cust_Info where Name='"+u+"' and Password='"+p+"'";
            
            ResultSet r = c1.s.executeQuery(l); 
            if(r.next()){ 
                new dashboard_reception().setVisible(true);
                setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "Invalid login");
                setVisible(true);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        }else if(ae.getSource()==b2){
            new first().setVisible(true);
                setVisible(false);
        }else if(ae.getSource()==b3){
            try {
                new Custumer_login_info().setVisible(true);
                setVisible(false);
            } catch (SQLException ex) {
                Logger.getLogger(Login_As_Customer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public static void main(String[] arg){
        new Login_As_Customer();
    }
}
        
        
    
    
