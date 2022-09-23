package fr.pantheonsorbonne.cri;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args )
    {
        //Card card = new Card();
        Card card1 = new Card(Card.Value.FIVE,Card.Color.CLUBS);
        Card card2 = new Card(Card.Value.ACE,Card.Color.CLUBS);
        
        if(Card.SameColor(card1,card2)){
        System.out.println("même couleur");
        }
    }
}
