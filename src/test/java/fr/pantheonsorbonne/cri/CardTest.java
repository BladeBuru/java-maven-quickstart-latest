package fr.pantheonsorbonne.cri;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

public class CardTest {
    
    
    @Test
    public void SameColorTest() {

        Card card1 = new Card(Card.Value.FIVE, Card.Color.CLUBS);
        Card card2 = new Card(Card.Value.ACE, Card.Color.CLUBS);

        assertTrue(Card.SameColor(card1, card2));

    }

    
    @Test
    public void SameValueTest() {

        Card card1 = new Card(Card.Value.ACE, Card.Color.DIAMONDS);
        Card card2 = new Card(Card.Value.ACE, Card.Color.CLUBS);
        Card card3 = new Card(Card.Value.NINE, Card.Color.HEARTS);

        assertTrue(Card.SameValue(card1, card2));
        assertFalse(Card.SameValue(card1, card3));

    }

}
