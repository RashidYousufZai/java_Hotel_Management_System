package TOA;


import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import static javax.swing.JSplitPane.*;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Chatbot extends JFrame {

    /**
     *
     */
//	private static final long serialVersionUID = 1L;
    private JTextArea TextArea = new JTextArea();
    private JTextField cf = new JTextField();
    private JButton b = new JButton();
    private JLabel l = new JLabel();

    Chatbot() {                                                // Layout and Properties defined in Constructer                                         

        JFrame f = new JFrame();
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setVisible(true);
//        f.setResizable(true);
        f.setLayout(null);
        f.setSize(820, 800);
        f.getContentPane().setBackground(Color.cyan);
        f.setTitle("ChatBot");
        f.add(TextArea);
        f.add(cf);
        TextArea.setSize(800, 720);
        TextArea.setLocation(1, 1);
        TextArea.setBackground(Color.BLACK);
        TextArea.setFont(new Font("Tahoma", Font.PLAIN, 17));
        cf.setSize(700, 40);
        cf.setLocation(0, 720);
        f.add(b);
        l.setText("SEND");
        b.add(l);
        b.setSize(700, 40);
        b.setLocation(700, 720);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b) {                           // Message sents on Click button

                    String text = cf.getText().toLowerCase();
                    TextArea.setForeground(Color.GREEN);
                    TextArea.append("You-->" + text + "\n");
                    cf.setText("");

                    if (text.contains("hi")) {                         // input Checking
                        replyByServer("Hi there");
                    }else if(text.contains("how are you")) {
						replyByServer("I'm Good :).Thankyou for asking");
					}
                                        else if(text.contains("is the room is available")) {
						replyByServer("Yes rooms are available Please contact us");
					}
                                        else if(text.contains("how many rooms in hotel")) {
						replyByServer("there are 40 room in hotel");
					}
                                        else if(text.contains("rent of room")) {
						replyByServer("single or double");
					}
                                        else if(text.contains("single")) {
						replyByServer("yes available right now");
					}
                                        else if(text.contains("double")) {
						replyByServer("yes available right now");
					}
					else if(text.contains("what is your name")) {
						replyByServer("I'm the Trending BINOD");
					}
					else if(text.contains("gender")) {
						replyByServer("I'm Female.Don't Try to Flirt with me"+"\n"+"you Fell in love :)");
					}
					else if(text.contains("love you")) {
						replyByServer("I'm Feeling Shy :) Love you to");
					}
					else if(text.contains("bye")) {
						replyByServer("Too Soon :( AnyWays"+"\n"+"STAY HOME STAY SAFE ");
					} else {
                        replyByServer("I Can't Understand");
                    }

                }

            }

        });

    }

    public void replyByServer(String s) {                          // Reply Method
        TextArea.append("ChatBot-->" + s + "\n");
    }

}

public class ChatBotDemo {                                     //Driver Class

    public static void main(String[] args) {             //main class

        new Chatbot();                                  // instantiation 
    }

}
