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
}
