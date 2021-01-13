import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class IntakeQ1 extends JFrame implements ActionListener
{
    private JLabel Q1; //question 1 
    private JRadioButton ans1, ans2, ans3, ans4; //selected answers
    private ButtonGroup bg; //button yg kau bole select 1 je
    private JButton click; //confirm button
    
    public IntakeQ1() {
        windowSize();
        
        //declaration
        Q1 = new JLabel ("how long your working experience?");
        ans1 = new JRadioButton ("<5 years");
        ans2 = new JRadioButton ("6-10 years");
        ans3 = new JRadioButton ("10-15 years");
        ans4 = new JRadioButton (">15 years");
        bg = new ButtonGroup ();
        click = new JButton ("Confirm");
        //size & position
        Q1.setBounds(250,250,200,30);
        ans1.setBounds(250,300,200,30);
        ans2.setBounds(250,350,200,30);
        ans3.setBounds(250,400,200,30);
        ans4.setBounds(250,450,200,30);
        click.setBounds(250,500,100,30);
        //actionListener
        click.addActionListener (this);
        //add variable
        add(Q1);
        add(ans1);
        add(ans2);
        add(ans3);
        add(ans4);
        add(click);
        //grp button
        bg.add(ans1);
        bg.add(ans2);
        bg.add(ans3);
        bg.add(ans4);
        
        icon();
        backImage();
    }
    
    public void actionPerformed (ActionEvent e) {
        if (ans1.isSelected()){
            JOptionPane.showMessageDialog(this,"UNFORTUNATELY YOU DO NOT FULLFILL OUR CRITERIA");
            System.exit(0); //execute
        }
        if (ans2.isSelected()){
             JOptionPane.showMessageDialog(this,"UNFORTUNATELY YOU DO NOT FULLFILL OUR CRITERIA");
                System.exit(0);
        }
        if (ans3.isSelected()){
            JOptionPane.showMessageDialog(this,"UNFORTUNATELY YOU DO NOT FULLFILL OUR CRITERIA");
                System.exit(0);
        }
        if (ans4.isSelected()){
            //JOptionPane.showMessageDialog(this,"Correct! click okey for the next question");
                //next class question
            IntakeQ2 q2 = new IntakeQ2 ();
            setVisible(false);
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
