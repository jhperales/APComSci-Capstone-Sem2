import javax.swing.*;
import java.util.*;

public class GameViewer extends JFrame
{
    private BlackJack game;
    private Controls control;
    
    public GameViewer()
    {
        super.setTitle("BlackJack");
        super.setSize(500, 500);
        this.game = new BlackJack();
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
        