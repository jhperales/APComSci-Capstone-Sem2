import javax.swing.*;

public class TextDisplay extends JTextArea
{
    public TextDisplay()
    {
        super("Welcome to Blackjack");
        setLineWrap(true);
    }
   
    public void changeText(String str)
    {
        this.append("\n" + str);
    }
}
