package bank_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{

       JButton login,clear,signup;
       JPasswordField pinNoField;
       JTextField cardNoField;
       Login(){
        setLayout(null);
        setTitle("AUTOMATED TELLER MACHINE");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(350,30,100,100);
        add(icon);

        JLabel bankName = new JLabel("REPUBLIC BANK OF INDIA");
        bankName.setBounds(220,110,800,100);
        bankName.setFont(new Font("Arial",Font.CENTER_BASELINE,30));
        bankName.setForeground(Color.BLUE);
        add(bankName);

        JLabel banMoto = new JLabel("A Government of India Undertaking");
        banMoto.setBounds(435,136,400,100);
        banMoto.setFont(new Font("Arial",Font.ITALIC,12));
        banMoto.setForeground(Color.WHITE);
        add(banMoto);

        JLabel pageInfo = new JLabel("LOGIN CREDENTIALS");
        pageInfo.setBounds(280,170,400,100);
        pageInfo.setFont(new Font("Arial",Font.BOLD,25));
        pageInfo.setForeground(Color.WHITE);
        add(pageInfo);

        JLabel cardNo = new JLabel("Card No :");
        cardNo.setBounds(100,220,400,100);
        cardNo.setFont(new Font("Arial",Font.BOLD,20));
        cardNo.setForeground(Color.white);
        add(cardNo);

        cardNoField = new JTextField();
        cardNoField.setBounds(300,260,400,25);
        cardNoField.setFont(new Font("Arial",Font.BOLD,15));
        cardNoField.setForeground(Color.black);
        add(cardNoField);


        JLabel pinNo = new JLabel("PIN :");
        pinNo.setBounds(100,280,400,100);
        pinNo.setFont(new Font("Arial",Font.BOLD,20));
        pinNo.setForeground(Color.white);
        add(pinNo);

        pinNoField = new JPasswordField();
        pinNoField.setBounds(300,320,400,25);
        pinNoField.setFont(new Font("Arial",Font.BOLD,15));
        pinNoField.setForeground(Color.black);
        add(pinNoField);

        login = new JButton("LOGIN");
        login.setBounds(300,380,130,25);
        login.setFont(new Font("Tahmora",Font.BOLD,18));
        login.setForeground(Color.BLACK);
        login.setBackground(Color.white);
        login.addActionListener(this);
        add(login);

        clear = new JButton("CLEAR");
        clear.setBounds(570,380,130,25);
        clear.setFont(new Font("Tahmora",Font.BOLD,18));
        clear.setForeground(Color.BLACK);
        clear.setBackground(Color.white);
        clear.addActionListener(this);
        add(clear);

        signup = new JButton("SIGNUP");
        signup.setBounds(300,420,400,25);
        signup.setFont(new Font("Tahmora",Font.CENTER_BASELINE,18));
        signup.setForeground(Color.BLACK);
        signup.setBackground(Color.white);
        signup.addActionListener(this);
        add(signup);



        setLocation(500,200);
        setVisible(true);
        setSize(800,530);
        getContentPane().setBackground(Color.BLACK);

       }

       public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == login){
            
        }
        else if(ae.getSource() == clear){
            cardNoField.setText("");
            pinNoField.setText("");

        }
        else if(ae.getSource() == signup){

        }
       }

    public static void main(String[] args){
        new Login();
    }
}