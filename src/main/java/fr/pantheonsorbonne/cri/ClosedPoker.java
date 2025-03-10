package fr.pantheonsorbonne.cri;

public class ClosedPoker {
    public static void main(String... args) {
        Player p1 = new Player("Nicolas");
        Player p2 = new Player("Elio");
        Player p3 = new Player("Flavio");

        // give the players some cards
        Deck deck = new Deck();
        deck.Initialisation32Cards();
        p1.setHand(deck.newRandomHand());
        p2.setHand(deck.newRandomHand());
        p3.setHand(deck.newRandomHand());

        // returns the cards the players want to discard and get new ones
        Deck cardsP1 = p1.getCardsToDiscard();
        p1.addCard(deck.getRandomCards(cardsP1.size()));
        p1.cards.sortCard();//Only for display

        Deck cardsP2 = p2.getCardsToDiscard();
        p2.addCard(deck.getRandomCards(cardsP2.size()));
        p2.cards.sortCard();//Only for display

        Deck cardsP3 = p3.getCardsToDiscard();
        p3.addCard(deck.getRandomCards(cardsP3.size()));
        p3.cards.sortCard();//Only for display
       
        // check who wins
        if (p1.beats(p2) && p1.beats(p3)) {
            System.out.println("P1 wins with hand" + p1.getHandString());
            //Only for display
            {
            System.out.println("-----------------------------------");
            System.out.println("Player 2 deck " + p2.getHandString());
            System.out.println("Player 3 deck " + p3.getHandString());
            }
        }

        else if (p2.beats(p1) && p2.beats(p3)) {
            System.out.println("P2 wins with hand" + p2.getHandString());
            //Only for display
            {
            System.out.println("-----------------------------------");
            System.out.println("Player 1 deck " + p1.getHandString());
            System.out.println("Player 3 deck " + p3.getHandString());
            }
        }

        else if (p3.beats(p1) && p3.beats(p2)) {
            System.out.println("P3 wins with hand" + p2.getHandString());
            //Only for display
            {
            System.out.println("-----------------------------------");
            System.out.println("Player 1 deck " + p1.getHandString());
            System.out.println("Player 2 deck " + p2.getHandString());
        }
            
        } else {
            System.out.println("there is a draw");
            //Only for display
            System.out.println("Player 1 deck " + p1.getHandString());
            System.out.println("Player 2 deck " + p2.getHandString());
            System.out.println("Player 3 deck " + p3.getHandString());
        }
    }
}
