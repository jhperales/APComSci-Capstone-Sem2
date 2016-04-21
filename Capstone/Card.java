import java.util.*;
import javax.swing.*;
public class Card
{
    private static ArrayList<String> card_lbl = new ArrayList<String>();
    private static ArrayList<Integer> card_vals = new ArrayList<Integer>();
    
    public Card()
    {
        card_lbl.add("A");
        card_lbl.add("2");
        card_lbl.add("3");
        card_lbl.add("4");
        card_lbl.add("5");
        card_lbl.add("6");
        card_lbl.add("7");
        card_lbl.add("8");
        card_lbl.add("9");
        card_lbl.add("10");
        card_lbl.add("K");
        card_lbl.add("Q");
        card_lbl.add("J");
        card_vals.add(1);
        card_vals.add(2);
        card_vals.add(3);
        card_vals.add(4);
        card_vals.add(5);
        card_vals.add(6);
        card_vals.add(7);
        card_vals.add(8);
        card_vals.add(9);
        card_vals.add(10);
        card_vals.add(10);
        card_vals.add(10);
    }
    
    public int oneOrEleven()
    {
        return JOptionPane.showConfirmDialog(null, "Would you like the Ace to count for a 1 or 11?", null, JOptionPane.YES_NO_OPTION);
    }
}