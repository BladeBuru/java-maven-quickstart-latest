package fr.pantheonsorbonne.cri;

import java.util.Random;

public class Card {
    private Valeur valeur;
    private Couleur couleur;

    enum Couleur {
        SPADES,
        HEARTS,
        DIAMONDS,
        CLUBS;

        private static Random rand = new Random();

        public static Couleur drawRandom() {

            return (Couleur) (Couleur.class.getEnumConstants()[rand.nextInt(Couleur.class.getEnumConstants().length)]);
        }
    }

    enum Valeur {
        ACE,
        KING,
        QUEEN,
        JACK,
        TEN,
        NINE,
        EIGHT,
        SEVEN,
        SIX,
        FIVE,
        FOUR,
        THREE,
        TWO,
        ONE;

        private static Random rand = new Random();

        public static Valeur drawRandom() {

            return (Valeur) (Valeur.class.getEnumConstants()[rand.nextInt(Valeur.class.getEnumConstants().length)]);
        }

    }

    public Card() {
        this(Valeur.drawRandom(), Couleur.drawRandom());
    }

    public Card(Valeur valeur, Couleur couleur) {
        this.valeur = valeur;
        this.couleur = couleur;
    }


    public String toString(){

        return valeur + " " + couleur + "\n" ;
    }
}


