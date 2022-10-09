package fr.pantheonsorbonne.cri;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

public class CardTest {
    
    
    @Test
    public void SameColorTest() {

        Card card1 = new Card(Card.Value.FIVE, Card.Color.CLUBS);
        Card card2 = new Card(Card.Value.ACE, Card.Color.CLUBS);

        assertTrue(card1.SameColor( card2));

    }

    
    @Test
    public void SameValueTest() {

        Card card1 = new Card(Card.Value.ACE, Card.Color.DIAMONDS);
        Card card2 = new Card(Card.Value.ACE, Card.Color.CLUBS);
        Card card3 = new Card(Card.Value.NINE, Card.Color.HEARTS);

        assertTrue(card1.SameValue( card2));
        assertFalse(card1.SameValue( card3));

    }




}
