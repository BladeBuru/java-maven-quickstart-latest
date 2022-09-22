package fr.pantheonsorbonne.cri;

public class Player {
    private String name;
    private Card[] cards;

    public Player(String name){
        this.name = name;
    }

    public void setHand(Card[] cards){
        this.cards = cards;
    }

    public boolean beats(Player player1){

        return;
    }
}
