import java.util.Random;
import javax.swing.*;

public class BlackJack extends JComponent
{
    //Human player
    private Player user;
    
    //Computer player
    private Player opponent;
    
    //Deck of cards
    private static Deck deck;
    public BlackJack()
    {
        this.user = new Player();
        this.opponent = new Player();
        this.deck = new Deck();
    }
    
    /**
     * Determains value of card and returns its value as int; retruns -1 if unable to determain
     * 
     * @param card   The card to be evaluated
     * @return  the value of the card as an int
     */
    public static int determainValue(String card)
    {
        if (card.equals("A"))
        {
            if (deck.oneOrEleven() == 0)
            {
                return 11;
            }
            else
            {
                return 1;
            }
        }
        else if (card.equals("2"))
        {
            return 2;
        }
        else if (card.equals("3"))
        {
            return 3;
        }
        else if (card.equals("4"))
        {
            return 4;
        }
        else if (card.equals("5"))
        {
            return 5;
        }
        else if (card.equals("6"))
        {
            return 6;
        }
        else if (card.equals("7"))
        {
            return 7;
        }
        else if (card.equals("8"))
        {
            return 8;
        }
        else if (card.equals("9"))
        {
            return 9;
        }
        else if (card.equals("10"))
        {
            return 10;
        }
        else if (card.equals("K"))
        {
            return 10;
        }
        else if (card.equals("Q"))
        {
            return 10;
        }
        else if (card.equals("J"))
        {
            return 10;
        }
        return -1;
    }
    
    /**
     * Adds card to Player hand and increments score depending on recieved card
     * 
     * @param p    The Player object to perform the change to
     */
    public void hit(Player p)
    {
        String newCard = deck.getCard();
        int newCardVal = determainValue(newCard);
        p.addCard(newCard);
        p.addScore(newCardVal);
        
    }
}