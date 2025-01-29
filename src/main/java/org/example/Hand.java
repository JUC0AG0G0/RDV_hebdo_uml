package org.example;

import java.util.ArrayList;
import java.util.List;

class Hand {
    private final List<Card> cards = new ArrayList<>();

    public void pickedACard(Card c) {
        cards.add(c);
    }

    public void playCard(Card c) {
        cards.remove(c);
    }

    public boolean holdsCard(Card c) {
        return this.cards.contains(c);
    }

    public int nbrOfCards() {
        return this.cards.size();
    }
}