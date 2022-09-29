package fr.pantheonsorbonne.cri;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PlayerTest {
    
    @Test
    public void newRandomHandTest() {
        Player p1 = new Player("Nicolas");
        Player p2 = new Player("TOTO");
        Deck deck = new Deck();
        deck.Initialisation52Cards();
        p1.setHand(deck.newRandomHand());
        assertEquals(5, p1.getDeck().size());
        assertNotEquals(5, p2.getDeck().size());
    }

    
}
