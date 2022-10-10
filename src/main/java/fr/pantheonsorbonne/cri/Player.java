package fr.pantheonsorbonne.cri;

import java.util.ArrayList;

public class Player {
    private String name;
    Deck cards;

    public Player(String name) {
        this.name = name;
        cards = new Deck();
    }

    public void setHand(Deck cards) {
        this.cards = cards;
    }

    public boolean beats(Player player1) {
        int HandOccurenceJ0 = cards.occurenceMax();
        int HandOccurenceJ1 = player1.getDeck().occurenceMax();
        return HandOccurenceJ0 > HandOccurenceJ1 ;

    }

    public Deck getCardsToDiscard() {
       
        return cards.discarDeck();
    }

    public Deck getDeck() {
        return cards;
    }

    public String toString() {

        return name + "   " + cards.toString();
    }

    public String getHandString() {

        return cards.toString();
    }

    public void addCard(Deck deck) {
        for (Card card : deck.getCard()) {
            this.cards.ajout(card);
        }
    }

}
