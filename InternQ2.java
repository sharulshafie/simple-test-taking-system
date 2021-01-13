import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class InternQ2 extends JFrame implements ActionListener 
{
    private JLabel Q2; //question 2 
    private JRadioButton ans1, ans2; //selected answers
    private ButtonGroup bg; //button yg kau bole select 1 je
    private JButton click; //confirm button
    public InternQ2() {
        windowSize();
         //declaration
        Q2 = new JLabel ("Are you a Book smart or Self learner?");
        ans1 = new JRadioButton ("Book smart");
        ans2 = new JRadioButton ("Self learner");
       
        
        bg = new ButtonGroup ();
        click = new JButton ("Confirm");
        //size & position
        Q2.setBounds(250,250,200,30);
        ans1.setBounds(250,300,200,30);
        ans2.setBounds(250,350,200,30);
        
        click.setBounds(250,500,100,30);
        
        
        //actionListener
        click.addActionListener (this);
        //add variable
        add(Q2);
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
            JOptionPane.showMessageDialog(this,"UNFORTUNATELY YOU DO NOT FULLFILL OUR CRITERIA");
                System.exit(0); //execute
        }
        if (ans2.isSelected()){
            //JOptionPane.showMessageDialog(this,"Correct! click okey for the next question");
                //next class question
                InternQ3 q3 = new InternQ3 ();
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
