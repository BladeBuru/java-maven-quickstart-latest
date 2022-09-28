package fr.pantheonsorbonne.cri;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private ArrayList<Card> deck;

    public Deck(ArrayList<Card> deck) {

        this.deck = deck;
    }

    public Deck() {
        ArrayList<Card> cards = new ArrayList<Card>();
        for (Card.Color color : Card.Color.class.getEnumConstants()) {
            for (Card.Value value : Card.Value.class.getEnumConstants()) {
                cards.add(new Card(value, color));
            }
        }
        this.deck = cards;
    }

    public ArrayList<Card> newRandomHand() {
       ArrayList<Card> cards= new ArrayList<>();
        for (int i = 0; i < 5 && this.deck.size() >= 1; i++) {
            int random = new Random().nextInt(deck.size())  ;
            cards.add(this.deck.get(random));
            this.deck.remove(random);
        }
        

        return cards;
    }

    public String toString(){
        ArrayList<String> string = new ArrayList<String>();

        for (Card card : deck) {
            string.add(card.toString() );
        }
        return "" + string;
    }

}
