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
    public void Initialisation32CardsTest() {
        Deck deck = new Deck();
        deck.Initialisation32Cards();
        Player p1 = new Player("Nicolas");
        assertEquals(32, deck.size());
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
        {
        Deck deck = new Deck();
        int[] occurence = { 2, 1, 1, 1, 1 };

        deck.ajout(new Card(Card.Value.NINE, Card.Color.HEARTS));
        deck.ajout(new Card(Card.Value.FOUR, Card.Color.CLUBS));
        deck.ajout(new Card(Card.Value.QUEEN, Card.Color.HEARTS));
        deck.ajout(new Card(Card.Value.TEN, Card.Color.HEARTS));
        deck.ajout(new Card(Card.Value.NINE, Card.Color.CLUBS));

        int[] occurenceDeck = deck.occurenceTable();
        assertEquals(occurence[0], occurenceDeck[0]);
        assertEquals( occurence[1] , occurenceDeck[1]);
        assertEquals( occurence[2] , occurenceDeck[2]);
        assertEquals( occurence[3] , occurenceDeck[3]);
        assertEquals( occurence[4] , occurenceDeck[4]);
        }

        {
            Deck deck = new Deck();
        int[] occurence = { 3, 1, 2, 1, 1 };

        deck.ajout(new Card(Card.Value.NINE, Card.Color.HEARTS));
        deck.ajout(new Card(Card.Value.FOUR, Card.Color.CLUBS));
        deck.ajout(new Card(Card.Value.NINE, Card.Color.HEARTS));
        deck.ajout(new Card(Card.Value.TEN, Card.Color.HEARTS));
        deck.ajout(new Card(Card.Value.NINE, Card.Color.CLUBS));

        int[] occurenceDeck = deck.occurenceTable();
        assertEquals(occurence[0], occurenceDeck[0]);
        assertEquals( occurence[1] , occurenceDeck[1]);
        assertEquals( occurence[2] , occurenceDeck[2]);
        assertEquals( occurence[3] , occurenceDeck[3]);
        assertEquals( occurence[4] , occurenceDeck[4]);
        }
    }
}
