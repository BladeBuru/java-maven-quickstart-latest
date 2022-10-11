package fr.pantheonsorbonne.cri;

import java.util.Collections;
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

    public void Initialisation32Cards() {
        ArrayList<Card> cards = new ArrayList<Card>();
        for (Card.Color color : Card.Color.class.getEnumConstants()) {
            for (Card.Value value : Card.Value.class.getEnumConstants()) {
                if (value.ordinal() >= 5)
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

    public void sortCard() {

        for (int i = 0; i < cards.size(); i++) {
            int valueMin = i;
            for (int j = i + 1; j < cards.size(); j++) {

                if (cards.get(j).getValue().ordinal() < cards.get(valueMin).getValue().ordinal()) {
                    valueMin = j;
                }
            }
            if (valueMin != i) {
                Collections.swap(cards, i, valueMin);
            }
        }

    }

    public int occurenceMax() {
        int[] occurence = occurenceTable();
        int occurencemax = 0;
        for (int i : occurence) {
            if (i > occurencemax)
                occurencemax = i;
        }

        return  occurencemax;
    }

    public Card.Value cardToKeep() {
        int[] occurence = occurenceTable();
        int indexOccurencemax = 0;
        int occurencemax = 0;
        for (int i = 0; i < occurence.length; i++) {
            if (occurence[i] > occurencemax || ((occurence[i]== occurencemax) && cards.get(i).getValue().ordinal() > cards.get(indexOccurencemax).getValue().ordinal())) {
                occurencemax = occurence[i];
                indexOccurencemax = i;
            } 
        }
        return cards.get(indexOccurencemax).getValue();
    }

    public Deck discarDeck() {
        Deck deck = new Deck();
        int numberDicardCard = 5 - occurenceMax();
        Card.Value cardToKeep = cardToKeep();
        int compterCardDiscard = 0;
        for (int i = 0; i < cards.size() && numberDicardCard > compterCardDiscard; i++) {
            if (cards.get(i).getValue() != cardToKeep) {
                deck.ajout(null);
                compterCardDiscard++;
                cards.remove(i);
                i--;
            }
        }

        return deck;
    }

    public int[] occurenceTable() {
        int[] occurence = { 1, 1, 1, 1, 1 };
        for (int i = 0; i < this.cards.size(); i++) {
            for (int j = i + 1; j < this.cards.size(); j++) {
                if (this.cards.get(i).SameValue(this.cards.get(j)))
                    occurence[i] = occurence[i] + 1;
            }
        }

        return occurence;
    }

    public ArrayList<Card> getCard() {
        return this.cards;
    }

}
