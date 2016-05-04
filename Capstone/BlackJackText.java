import javax.swing.*;

public class BlackJackText extends JTextArea
{
    private BlackJack controller;
    
    public BlackJackText()
    {
        super(10, 10);
        this.controller = new BlackJack();
    }
}