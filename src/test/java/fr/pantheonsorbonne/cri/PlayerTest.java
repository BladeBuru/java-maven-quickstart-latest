package fr.pantheonsorbonne.cri;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

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


    @Test
    public void addCardTest() {
        Player p1 = new Player("Nicolas");
        ArrayList<Card> cards = new ArrayList<Card>();
        cards.add(new Card());
        cards.add(new Card());
        Deck deck = new Deck(cards);
        assertEquals(0, p1.getDeck().size());
        p1.addCard(deck);
        assertEquals(2, p1.getDeck().size());
        for (int index = 0; index < 3; index++) {
            cards.add(new Card());
        }
        p1.addCard(deck);
        assertEquals(7, p1.getDeck().size());
        
    }
    
}
