package fr.pantheonsorbonne.cri;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args )
    {
        //Card card = new Card();
        //Card card1 = new Card(Card.Value.FIVE,Card.Color.CLUBS);
        //Card card2 = new Card(Card.Value.ACE,Card.Color.CLUBS);
        Deck deck = new Deck();
        Player p1 = new Player("Nicolas");
        p1.setHand(deck.newRandomHand());
        System.out.println(deck);
        System.out.println(p1);

    }
}
