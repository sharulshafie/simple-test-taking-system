import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class EndPage extends JFrame implements ActionListener
{
    private JLabel label;
    private JButton button;
    
    public EndPage () {
        windowSize();
        
        label = new JLabel ("CONGRATULATIONS, YOU HAVE BEEN ACCEPTED");
        button = new JButton ("Exit");
        
        label.setBounds(200,300,500,30);
        button.setBounds(300,350,100,30);
        
        add(label);
        add(button);
        
        button.addActionListener(this);
        
        icon();
        backImage();
    }
    
    public void actionPerformed (ActionEvent e) {
        if (e.getSource() == button ) {
            System.exit(0);
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
