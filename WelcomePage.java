import java.lang.*;
import javax.swing.*;
import javax.swing.ImageIcon.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.ChangeListener.*;

public class WelcomePage extends JFrame implements ActionListener
{
    private JLabel welText; //display welcome text 
    private JLabel logo; //display logo
    private JLabel companyName; //display company name
    private JLabel textName; //label name
    private JLabel textIc;
    private JTextField insertName; //insert name
    private JTextField insertIc;
    private JButton enterButton; //click button
   
    public WelcomePage () {
        windowSize();
        
        //declaration
        companyName = new JLabel ("BELIA ACADEMY");
        logo = new JLabel (new ImageIcon("Layer 3.png"));
        welText = new JLabel ("WELCOME TO THE ADMISSION ACCEPTANCE TEST");
        textName = new JLabel ("Enter your Name :");
        insertName = new JTextField ();
        textIc = new JLabel ("Enter your IC :");
        insertIc = new JTextField ();
        enterButton = new JButton ("Enter");
        
        //variable size
        companyName.setBounds(300,50,200,30); //x, y lenght, height
        logo.setBounds(250,80,200,200);
        welText.setBounds(200,300,700,30);
        textName.setBounds(200,400,200,30);
        insertName.setBounds(310,400,200,30);
        textIc.setBounds(200,450,200,30);
        insertIc.setBounds(310,450,200,30);
        enterButton.setBounds(310,500,100,35);
        enterButton.addActionListener(this);
        
        //added variable 
        add(companyName);
        add(logo);
        add(welText);
        add(textName);
        add(insertName);
        add(textIc);
        add(insertIc);
        add(enterButton);
        
        icon();
        backImage();
        
        
    }
    
    public void actionPerformed (ActionEvent wp) {
        String name = insertName.getText();
        String ic = insertIc.getText();
        if (wp.getSource () == enterButton && (name.length() != 0
            && ic.length() != 0)
            ){
            Admission ad = new Admission ();
                setVisible(false);
        }
        else if(wp.getSource () == enterButton && (name.length() == 0
            || ic.length() == 0)
            ){
            JOptionPane.showMessageDialog(this,"Please enter your name and IC");
        }
    }
    
    public void windowSize() {
        setLayout(new BorderLayout());
        setSize(700,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    public void icon () {
        ImageIcon ImageIcon = new ImageIcon("Layer 3.png");
        Image Image = ImageIcon.getImage();
        this.setIconImage(Image);
    }
    
    public void backImage() {
        JLabel background;
        background = new JLabel(new ImageIcon("interview_2.jpg"));
        background.setLayout(new FlowLayout());
        add(background);
    }
}
