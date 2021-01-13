import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Internship extends JFrame implements ActionListener 
{
    private JLabel label;
    private JLabel labeL;
    private JButton button;
    
    public Internship () {
        windowSize();
        
        label = new JLabel("Please be inform, if ONE question is answer incorrectly,");
        labeL = new JLabel("YOU WILL BE DISQUALIFIED, click 'Proceed' to continue");
        button = new JButton ("Proceed");
        
        label.setBounds(200,280,700,30);
        labeL.setBounds(200,310,700,30);
        button.setBounds(300,350,90,20);
        
        add(label);
        add(labeL);
        add(button);
        
        button.addActionListener(this);
        
        icon();
        backImage();
    }
    
    public void actionPerformed (ActionEvent is) {
        if(is.getSource() == button) {
            InternQ1 q1 = new InternQ1();
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
