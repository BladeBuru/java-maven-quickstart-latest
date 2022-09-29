package fr.pantheonsorbonne.cri;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private ArrayList<Card> Cards;
    private Random random = new Random();
    
    public Deck(ArrayList<Card> deck) {

        this.Cards = deck;
    }

    public Deck() {
        Cards = new ArrayList<Card>();

    }

    public void Initialisation52Cards() {
        ArrayList<Card> cards = new ArrayList<Card>();
        for (Card.Color color : Card.Color.class.getEnumConstants()) {
            for (Card.Value value : Card.Value.class.getEnumConstants()) {
                cards.add(new Card(value, color));
            }
        }
        this.Cards = cards;
    }

    public Deck newRandomHand() {
        Deck cards = new Deck();
        for (int i = 0; i < 5 && this.Cards.size() >= 1; i++) {
            int nextIndex = random.nextInt(Cards.size());
            cards.ajout(this.Cards.get(nextIndex));
            this.Cards.remove(nextIndex);
        }

        return cards;
    }

    public void ajout(Card card) {
        this.Cards.add(card);

    }

    public int size() {

        return Cards.size();
    }

    public String toString() {
        ArrayList<String> string = new ArrayList<String>();

        for (Card card : Cards) {
            string.add(card.toString());
        }
        return "" + string;
    }

}

/*

for (int i = 0; i < 5 && this.Cards.size() >= 1; i++) {
            int random = new Random().nextInt(Cards.size());
            cards.ajout(this.Cards.get(random));
            this.Cards.remove(random);
        }
*/