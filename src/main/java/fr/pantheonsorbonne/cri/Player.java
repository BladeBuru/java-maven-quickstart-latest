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
        //
        //
        //
        return false;

    }

    public Deck getCardsToDiscard() {
        Deck cardsToDiscard = new Deck();

        
        //
        //
        //
        return null;
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
