package fr.pantheonsorbonne.cri;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void SameColorTest(){

        Card card1 = new Card(Card.Value.FIVE,Card.Color.CLUBS);
        Card card2 = new Card(Card.Value.ACE,Card.Color.CLUBS);
        
        assertTrue(Card.SameColor(card1,card2));
        
    }
    @Test
    public void SameValueTest(){

        Card card1 = new Card(Card.Value.ACE,Card.Color.DIAMONDS);
        Card card2 = new Card(Card.Value.ACE,Card.Color.CLUBS);
        Card card3 = new Card(Card.Value.NINE,Card.Color.HEARTS);
        
        assertTrue(Card.SameValue(card1,card2));
        assertFalse(Card.SameValue(card1,card3));
        
    }
    @Test
    public void newRandomHandTest(){
        Player p1 = new Player("Nicolas");
        Deck deck = new Deck();
        p1.setHand(deck.newRandomHand());
        ///
        //
        //
        
        assertTrue(p1.cards.size()==5);
    }

}
