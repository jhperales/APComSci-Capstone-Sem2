import java.util.Random;
import javax.swing.*;

public class BlackJack extends JComponent
{
    private Player user;
    private Player opponent;
    private Deck deck;
    private int turn;
    
    public BlackJack()
    {
        this.user = new Player();
        this.opponent = new Player();
        this.deck = new Deck();
        this.turn = 1;
    }
    
    
}