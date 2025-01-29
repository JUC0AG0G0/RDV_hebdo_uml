package org.example;

import java.util.ArrayList;
import java.util.List;

public class Deck implements LastPlayedCardProviderITF {
    private final List<Card> drawPile;
    private final List<Card> playedCards = new ArrayList<>();

    public Deck(List<Card> cards) {
        this.drawPile = new ArrayList<>(cards);
    }

    public Card drawACard() {
        return drawPile.isEmpty() ? null : drawPile.remove(0);
    }

    public void addCardToPlayed(Card c) {
        playedCards.add(c);
    }

    @Override
    public Card getLastPlayedCard() {
        return playedCards.isEmpty() ? null : playedCards.get(playedCards.size() - 1);
    }
}
