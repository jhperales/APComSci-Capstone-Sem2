import javax.swing.*;
import java.awt.event.*;

public class ControlsPanel extends JPanel
{
    private JButton hit;
    private JButton stay;
    private BlackJack control;
    private TextDisplay textControl;
    
    public ControlsPanel(BlackJack c)
    {
        this.hit = new JButton("Hit");
        this.stay = new JButton("Stay");
        this.textControl = new TextDisplay();
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
                //control.hit();
                textControl.changeText(event.getActionCommand());
            }
            if (event.getActionCommand() == "Stay")
            {
                //control.stay();
                textControl.changeText(event.getActionCommand());
            }
        }
    }
}
