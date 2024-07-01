package org.example;

public class Card {
    private CardSuit cardSuit;
    private int value;

    public Card(CardSuit cardSuit, int value) {
        this.cardSuit = cardSuit;
        this.value = value;
    }

    public CardSuit getCardSuit() {
        return cardSuit;
    }

    public void setCardSuit(CardSuit cardSuit) {
        this.cardSuit = cardSuit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
