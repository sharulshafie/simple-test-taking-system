import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Admission extends JFrame implements ActionListener
{
    private JLabel adLabel;
    private JButton buttonIntern;
    private JButton buttonIntake;
    //private JLabel background;
    
    public Admission () {
        windowSize();
        
        adLabel = new JLabel ("SELECT YOUR ADMISSION");
        buttonIntern = new JButton ("INTERNSHIP");
        buttonIntake = new JButton ("INTAKE");
        
        adLabel.setBounds(275,250,200,30);
        buttonIntern.setBounds (250,300,200,30);
        buttonIntake.setBounds (250,350,200,30);
        
        buttonIntern.addActionListener(this);
        buttonIntake.addActionListener(this);
        
        add(adLabel);
        add(buttonIntern);
        add(buttonIntake);
        
        icon();
        backImage();
        
    }
    
    public void actionPerformed (ActionEvent am) {
        if (am.getSource() == buttonIntern){
            Internship a = new Internship();
                setVisible(false);
        }
        
        if (am.getSource() == buttonIntake) {
            Intake b = new Intake();
                setVisible(false);
        }
    }
    
    public void windowSize() {
        setLayout(new BorderLayout());
        setSize(700,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible (true);
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
