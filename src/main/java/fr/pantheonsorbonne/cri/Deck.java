package fr.pantheonsorbonne.cri;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private ArrayList<Card> cards;
    private Random random = new Random();

    public Deck(ArrayList<Card> cards) {

        this.cards = cards;
    }

    public Deck() {
        cards = new ArrayList<Card>();

    }

    public void Initialisation52Cards() {
        ArrayList<Card> cards = new ArrayList<Card>();
        for (Card.Color color : Card.Color.class.getEnumConstants()) {
            for (Card.Value value : Card.Value.class.getEnumConstants()) {
                cards.add(new Card(value, color));
            }
        }
        this.cards = cards;
    }

    public Deck newRandomHand() {
        Deck cards = new Deck();
        for (int i = 0; i < 5 && this.cards.size() >= 1; i++) {
            int nextIndex = random.nextInt(this.cards.size());
            cards.ajout(this.cards.get(nextIndex));
            this.cards.remove(nextIndex);
        }

        return cards;
    }

    public void ajout(Card card) {
        this.cards.add(card);

    }

    public int size() {

        return cards.size();
    }

    public String toString() {
        ArrayList<String> string = new ArrayList<String>();

        for (Card card : cards) {
            string.add(card.toString());
        }
        return "" + string;
    }

    public Deck getRandomCards(int length) {
        Deck cards = new Deck();
        for (int i = 0; i < length && this.cards.size() >= 1; i++) {
            int nextIndex = random.nextInt(this.cards.size());
            cards.ajout(this.cards.get(nextIndex));
            this.cards.remove(nextIndex);
        }
        return cards;

    }

    public ArrayList<Card> getCard() {
        return this.cards;
    }

}

/*
 * 
 * for (int i = 0; i < 5 && this.Cards.size() >= 1; i++) {
 * int random = new Random().nextInt(Cards.size());
 * cards.ajout(this.Cards.get(random));
 * this.Cards.remove(random);
 * }
 */