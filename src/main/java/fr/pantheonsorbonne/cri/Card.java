package fr.pantheonsorbonne.cri;

import java.util.Random;

public class Card {
    private Value value;
    private Color color;

    enum Color {
        SPADES,
        HEARTS,
        DIAMONDS,
        CLUBS;

        private static Random rand = new Random();

        public static Color drawRandom() {

            return (Color) (Color.class.getEnumConstants()[rand.nextInt(Color.class.getEnumConstants().length)]);
        }
    }

    enum Value {
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
        TWO;

        private static Random rand = new Random();

        public static Value drawRandom() {

            return (Value) (Value.class.getEnumConstants()[rand.nextInt(Value.class.getEnumConstants().length)]);
        }

    }

    public Card() {
        this(Value.drawRandom(), Color.drawRandom());
    }

    public Card(Value value, Color color) {
        this.value = value;
        this.color = color;
    }

    public boolean SameColor(Card card) {

        return (this.color == card.color);
    }

    public boolean SameValue(Card card) {

        return (this.value == card.value);
    }

    public String toString() {

        return value + " " + color + "\n";
    }
}
