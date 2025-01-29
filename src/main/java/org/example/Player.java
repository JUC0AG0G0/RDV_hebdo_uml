package org.example;

public class Player {
    private final String name;
    private final Hand hand = new Hand();
    private final Table table;

    public Player(String name, Table t) {
        this.name = name;
        this.table = t;
    }

    public Hand getHand() {
        return hand;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfCards() {
        return hand.nbrOfCards();
    }
}
