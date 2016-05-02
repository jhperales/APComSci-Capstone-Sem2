import javax.swing.*;
import java.util.*;
import java.awt.*;

public class GameViewer extends JFrame
{
    private BlackJack game;
    private Controls control;
    private Player human;
    private Player computer;
    private Deck cards;
    
    public GameViewer()
    {
        super.setTitle("BlackJack");
        super.setSize(500, 500);
        this.human = new Player();
        this.computer = new Player();
        this.game = new BlackJack(this.human, this.computer, this.cards);
        this.control = new Controls(game);
        setLayout(new BorderLayout());
        this.add(game, BorderLayout.CENTER);
        this.add(control, BorderLayout.SOUTH);
    }
    
    public static void main(String[] args)
    {
        GameViewer f = new GameViewer();
        f.setVisible(true);
    }
}
        