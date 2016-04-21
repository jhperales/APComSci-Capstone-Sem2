import javax.swing.*;
import java.awt.event.*;

public class Controls extends JPanel
{
    private JButton hit;
    private JButton stay;
    private Blackjack control;
    
    public Controls(Blackjack c)
    {
        this.hit = new JButton("Hit");
        this.stay = new JButton("Stay");
        this.control = c;
        this.add(hit);
        this.add(stay);
        
        ClickListener listener = new ClickListener();
        this.hit.addActionListener(listener);
        this.stay.addActionListener(listener);
        
    }
    
    public class ClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if (event.getActionCommand() == "Hit")
            {
                control.hit();
            }
            if (event.getActionCommand() == "Stay")
            {
                control.stay();
            }
        }
    }
}