import javax.swing.*;
import java.util.*;

public class GameViewer extends JFrame
{
    private Blackjack game;
    private Controls control;
    
    public GameViewer()
    {
        super.setTitle("Blackjack");
        super.setSize(500, 500);
        this.game = new Blackjack();
        this.control = new Controls(game);
        setLayout(new BorderLayout());
        this.add(game, BorderLayout.CENTER);
        this.add(control, BorderLayout.SOUTH);
    }
    
    public static void main(String[] args)
    {
        GameViewer f = new GameViewer();
        this.setVisible(true);
    }
}
        