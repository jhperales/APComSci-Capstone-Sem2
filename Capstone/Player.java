import java.util.*;

public class Player
{
    private static int total_points;
    private static ArrayList<String> hand = new ArrayList<String>();
    
    public int getTotal()
    {
        return this.total_points;
    }
    public String getHand()
    {
        return this.hand.toString();
    }
    public void addCard(String lbl)
    {
        hand.add(lbl);
    }
}
    