package fr.pantheonsorbonne.cri;


public class App {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.Initialisation52Cards();
        Player p = new Player("test");
        p.setHand(deck.newRandomHand());
        Deck deck2 = deck.getRandomCards(6);
        System.out.println(deck2.size());
        /*/
        Deck deck = new Deck();
        deck.Initialisation52Cards();
        System.out.println(deck);
        Player p1 = new Player("Nicolas");
        p1.setHand(deck.newRandomHand());
        System.out.println(deck);
        System.out.println(p1);
*/
    }
}
