import java.util.*;

public class Player
{
    //Players points
    private static int total_points;
    
    //Players hand of cards
    private static ArrayList<String> hand = new ArrayList<String>();
    
    //Players "state" (as in, if it is the players turn. false for it is not the players turn and true otherwise)
    private static boolean state = true;

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

    public void addScore(int s)
    {
        this.total_points += s;
    }

    public void changeState(boolean b)
    {
        this.state = b;
    }
}
