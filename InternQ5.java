import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class InternQ5 extends JFrame implements ActionListener 
{
    private JLabel Q5; //question 5 
    private JRadioButton ans1, ans2, ans3, ans4; //selected answers
    private ButtonGroup bg; //button yg kau bole select 1 je
    private JButton click; //confirm button
    public InternQ5() {
        windowSize();
        //declaration
        Q5 = new JLabel ("Do you agree if we not giving any allowance to you during your internship?");
        ans1 = new JRadioButton ("Agree");
        ans2 = new JRadioButton ("Not Agree");
        bg = new ButtonGroup ();
        click = new JButton ("Confirm");
        //size & position
        Q5.setBounds(150,250,450,30);
        ans1.setBounds(250,300,200,30);
        ans2.setBounds(250,350,200,30);
        
        click.setBounds(250,500,100,30);
        
        
        
        //actionListener
        click.addActionListener (this);
        //add variable
        add(Q5);
        add(ans1);
        add(ans2);
        
        add(click);
        //grp button
        bg.add(ans1);
        bg.add(ans2);
        
        
        icon();
        backImage();
    }
    
    public void actionPerformed (ActionEvent e) {
        if (ans1.isSelected()){
            //JOptionPane.showMessageDialog(this,"Correct! click okey for the next question");
                //next class question
                //InternQ6 q6 = new InternQ6 ();
                EndPage ep = new EndPage ();
                setVisible(false);
            
        }
        if (ans2.isSelected()){
            JOptionPane.showMessageDialog(this,"UNFORTUNATELY YOU DO NOT FULLFILL OUR CRITERIA");
                System.exit(0); //execute
            
        }
        
    }
    
    public void windowSize() {
        setLayout(new BorderLayout());
        setSize(700,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
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
