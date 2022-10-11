package fr.pantheonsorbonne.cri;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

public class ClosedPockerTest {

    @Test
    public void mainTest(){
        Player p1 = new Player("Nicolas");
        Player p2 = new Player("Elio");
        Player p3 = new Player("Flavio");

        // Deck player 1
        Deck deck1 = new Deck();
        deck1.ajout(new Card(Card.Value.ACE,Card.Color.CLUBS));
        deck1.ajout(new Card(Card.Value.ACE,Card.Color.DIAMONDS));
        deck1.ajout(new Card(Card.Value.ACE,Card.Color.HEARTS));
        deck1.ajout(new Card(Card.Value.TEN,Card.Color.CLUBS));
        deck1.ajout(new Card(Card.Value.SEVEN,Card.Color.HEARTS));

        // Deck player 2
        Deck deck2 = new Deck();
        deck2.ajout(new Card(Card.Value.QUEEN,Card.Color.CLUBS));
        deck2.ajout(new Card(Card.Value.QUEEN,Card.Color.DIAMONDS));
        deck2.ajout(new Card(Card.Value.JACK,Card.Color.HEARTS));
        deck2.ajout(new Card(Card.Value.KING,Card.Color.CLUBS));
        deck2.ajout(new Card(Card.Value.KING,Card.Color.HEARTS));

        // Deck player 3
        Deck deck3 = new Deck();
        deck3.ajout(new Card(Card.Value.JACK,Card.Color.CLUBS));
        deck3.ajout(new Card(Card.Value.KING,Card.Color.DIAMONDS));
        deck3.ajout(new Card(Card.Value.NINE,Card.Color.HEARTS));
        deck3.ajout(new Card(Card.Value.TEN,Card.Color.CLUBS));
        deck3.ajout(new Card(Card.Value.NINE,Card.Color.DIAMONDS));
        

        p1.setHand(deck1);
        p2.setHand(deck2);
        p3.setHand(deck3);

        assertTrue((p1.beats(p2) && p1.beats(p3)));
        assertFalse((p2.beats(p1) && p2.beats(p3)));
        assertFalse((p3.beats(p1) && p3.beats(p3)));
           

    }
    
}
