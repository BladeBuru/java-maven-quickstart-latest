package fr.pantheonsorbonne.cri;

import java.util.ArrayList;

public class Player {
    private String name;
    Deck cards;

    public Player(String name) {
        this.name = name;
    }

    public void setHand(Deck cards) {
        this.cards = cards;
    }

    public boolean beats(Player player1) {
        //
        //
        //
        return false;

    }


    public String toString(){
       
        return cards.toString();
    }
}
