package fr.pantheonsorbonne.cri;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DeckTest {
    @Test
    public void Initialisation52CardsTest() {
        Deck deck = new Deck();
        deck.Initialisation52Cards();
        Player p1 = new Player("Nicolas");
        assertEquals(52, deck.size());
        p1.setHand(deck.newRandomHand());
        assertNotEquals(52, deck.size());
    }

    @Test
    public void getRandomCardsTest() {
        Deck deck = new Deck();
        deck.Initialisation52Cards();
        Deck deck2 = deck.getRandomCards(6);
        assertEquals(6, deck2.size());

    }

    @Test

    public void occurenceTbalbleTest() {

        Deck deck = new Deck();
        int[] occurence = { 2, 1, 1, 1, 1 };

        deck.ajout(new Card(Card.Value.NINE, Card.Color.HEARTS));

        int[] occurenceDeck = deck.occurenceTable();
        //
        //

    }
}
