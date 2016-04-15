import java.util.*;
import javax.swing.*;
public class Card
{
    private static String[] card_lbl = new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    private static int[] card_vals = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
    
    public int oneOrEleven()
    {
        return JOptionPane.showConfirmDialog(null, "Would you like the Ace to count for a 1 or 11?", "Would you like the Ace to count for a 1 or 11?", JOptionPane.YES_NO_OPTION);
    }
    
}
        