package com.example.cards;

import java.util.Objects;

public class Card {

    private Suit suit;
    private FaceValues faceValues;

    private Card(){
    }


    public void setFaceValues(FaceValues faceValues) {
        this.faceValues = faceValues;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public FaceValues getFaceValues() {
        return faceValues;
    }

    public Suit getSuit() {
        return suit;
    }

    public Card(Suit suit, FaceValues faceValue) {
        this.suit = suit;
        this.faceValues = faceValue;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return suit == card.suit && faceValues == card.faceValues;
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, faceValues);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Card{");
        sb.append("suit=").append(suit);
        sb.append(", faceValues=").append(faceValues);
        sb.append('}');
        return sb.toString();
    }
}
