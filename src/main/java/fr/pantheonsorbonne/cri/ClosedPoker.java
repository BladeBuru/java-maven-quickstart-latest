package fr.pantheonsorbonne.cri;

public class ClosedPoker {
    public static void main(String... args) {
        Player p1 = new Player("Nicolas");
        Player p2 = new Player("Elio");
        Player p3 = new Player("Flavio");

        // give the players some cards
        Deck deck = new Deck();
        deck.Initialisation52Cards();
        p1.setHand(deck.newRandomHand());
        p2.setHand(deck.newRandomHand());
        p3.setHand(deck.newRandomHand());

        // returns the cards the players want to discard and get new ones
        Card[] cardsP1 = p1.getCardsToDiscard();
        p1.addCard(Deck.getRandomCards(cardsP1.length));

        Card[] cardsP2 = p2.getCardsToDiscard();
        p2.addCard(Deck.getRandomCards(cardsP2.length));

        Card[] cardsP3 = p3.getCardsToDiscard();
        p3.addCard(Deck.getRandomCards(cardsP3.length));

        // check who wins
        if (p1.beats(p2) && p1.beats(p3)) {
            System.out.println("P1 wins with hand" + p1.getHandString());
        }

        else if (p2.beats(p1) && p2.beats(p3)) {
            System.out.println("P2 wins with hand" + p2.getHandString());
        }

        else if (p3.beats(p1) && p3.beats(p3)) {
            System.out.println("P3 wins with hand" + p2.getHandString());
        } else {
            System.out.println("there is a draw");
        }
    }
}
