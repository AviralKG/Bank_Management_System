package bank_management_system;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;

public class SignupOne extends JFrame {
    SignupOne(){
        setTitle("AUTOMATED TELLER MACHINE");
        setLayout(null);

        Random rand = new Random();
        long random = (rand.nextLong() % 10000);

        
        JLabel details = new JLabel("Application Number: "+random);
        details.setBounds(200,-5,1000,100);
        details.setFont(new Font("Arial",Font.BOLD,29));
        details.setForeground(Color.BLACK);
        add(details);
        
        JLabel pageno = new JLabel("Page 1: Personal Details");
        pageno.setBounds(280,30,400,100);
        pageno.setFont(new Font("Arial",Font.CENTER_BASELINE,20));
        pageno.setForeground(Color.BLACK);
        add(pageno);

        JLabel name = new JLabel("Name:");
        name.setBounds(100,110,400,100);
        name.setFont(new Font("Arial",Font.CENTER_BASELINE,18));
        name.setForeground(Color.black);
        add(name);

        JTextField namefield = new JTextField();
        namefield.setBounds(300,150,350,25);
        namefield.setFont(new Font("Tahoma",Font.CENTER_BASELINE,15));
        namefield.setForeground(Color.darkGray);
        add(namefield);

        JLabel father = new JLabel("Father's Name:");
        father.setBounds(100,160,400,100);
        father.setFont(new Font("Arial",Font.CENTER_BASELINE,18));
        father.setForeground(Color.BLACK);
        add(father);

        JTextField fatherfield = new JTextField();
        fatherfield.setBounds(300,200,350,25);
        fatherfield.setFont(new Font("Arial",Font.CENTER_BASELINE,15));
        fatherfield.setForeground(Color.darkGray);
        add(fatherfield);

        JLabel dob = new JLabel("Date of Birth:");
        dob.setBounds(100,210,400,100);
        dob.setFont(new Font("Arial",Font.CENTER_BASELINE,18));
        dob.setForeground(Color.BLACK);
        add(dob);

        JDateChooser datefield = new JDateChooser();
        datefield.setBounds(300,250,350,25);
        datefield.setFont(new Font("Arial",Font.CENTER_BASELINE,15));
        datefield.setForeground(Color.DARK_GRAY);
        add(datefield);

        JLabel gender = new JLabel("Gender");
        gender.setBounds(100,260,400,100);
        gender.setFont(new Font("Arial",Font.CENTER_BASELINE,18));
        gender.setForeground(Color.BLACK);
        add(gender);


        JRadioButton male = new JRadioButton("Male");
        male.setBounds(300,300,80,25);
        male.setBackground(Color.white);
        male.setFont(new Font("Arial",Font.CENTER_BASELINE,15));
        add(male);

        JRadioButton female = new JRadioButton("Female");
        female.setBounds(420,300,90,25);
        female.setBackground(Color.white);
        female.setFont(new Font("Arial",Font.CENTER_BASELINE,15));
        add(female);

        JRadioButton other = new JRadioButton("Other");
        other.setBounds(580,300,80,25);
        other.setBackground(Color.white);
        other.setFont(new Font("Arial",Font.CENTER_BASELINE,15));
        add(other);

        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        gendergroup.add(other);
 
    

        JLabel email = new JLabel("Email:");
        email.setBounds(100,310,400,100);
        email.setFont(new Font("Arial",Font.CENTER_BASELINE,18));
        email.setForeground(Color.black);
        add(email);

        JTextField emailfield = new JTextField();
        emailfield.setBounds(300,350,350,25);
        emailfield.setFont(new Font("Arial",Font.CENTER_BASELINE,15));
        emailfield.setForeground(Color.darkGray);
        add(emailfield);

        JLabel marital = new JLabel("Marital Status:");
        marital.setBounds(100,360,400,100);
        marital.setFont(new Font("Arial",Font.CENTER_BASELINE,18));
        marital.setForeground(Color.BLACK);
        add(marital);
        
        JLabel address = new JLabel("Address:");
        address.setBounds(100,410,400,100);
        address.setFont(new Font("Arial",Font.CENTER_BASELINE,18));
        address.setForeground(Color.BLACK);
        add(address);

        JTextField addressfield = new JTextField();
        addressfield.setBounds(300,450,350,25);
        addressfield.setFont(new Font("Arial",Font.CENTER_BASELINE,15));
        addressfield.setForeground(Color.darkGray);
        add(addressfield);

        JLabel city = new JLabel("City:");
        city.setBounds(100,460,400,100);
        city.setFont(new Font("Arial",Font.CENTER_BASELINE,18));
        city.setForeground(Color.black);
        add(city);

        JTextField cityfield = new JTextField();
        cityfield.setBounds(300,500,350,25);
        cityfield.setFont(new Font("Arial",Font.CENTER_BASELINE,15));
        cityfield.setForeground(Color.darkGray);
        add(cityfield);

        JLabel state = new JLabel("State:");
        state.setBounds(100,510,400,100);
        state.setFont(new Font("Arial",Font.CENTER_BASELINE,18));
        state.setForeground(Color.BLACK);
        add(state);

        JTextField statefield = new JTextField();
        statefield.setBounds(300,550,350,25);
        statefield.setFont(new Font("Arial",Font.CENTER_BASELINE,15));
        statefield.setForeground(Color.darkGray);
        add(statefield);
   

        JLabel pincode = new JLabel("Pincode:");
        pincode.setBounds(100,560,400,100);
        pincode.setFont(new Font("Arial",Font.CENTER_BASELINE,18));
        pincode.setForeground(Color.BLACK);
        add(pincode);

        JTextField pincodefield = new JTextField();
        pincodefield.setBounds(300,600,350,25);
        pincodefield.setFont(new Font("Arial",Font.CENTER_BASELINE,15));
        pincodefield.setForeground(Color.darkGray);
        add(pincodefield);



        getContentPane().setBackground(Color.white);
        setVisible(true);
        setLocation(500,100);
        setSize(800,800);
    }

    public static void main(String[] args) {
        new SignupOne();
    }
}
