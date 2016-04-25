import java.util.*;
import javax.swing.*;
public class Deck
{
    private static ArrayList<String> cards = new ArrayList<String>();
    private Random ran;
    public Deck()
    {
        this.ran = new Random();
        cards.add("A");
        cards.add("2");
        cards.add("3");
        cards.add("4");
        cards.add("5");
        cards.add("6");
        cards.add("7");
        cards.add("8");
        cards.add("9");
        cards.add("10");
        cards.add("K");
        cards.add("Q");
        cards.add("J");
    }
    
    public int oneOrEleven()
    {
        return JOptionPane.showConfirmDialog(null, "Would you like the Ace to have the valuie of 11?", null, JOptionPane.YES_NO_OPTION);
    }
    
    public String getCard()
    {
        int index = ran.nextInt(cards.size());
        return cards.get(index);
    }
}