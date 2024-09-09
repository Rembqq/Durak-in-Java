package fool.game;

import java.util.Objects;

public class Card {
    // [0-5][0-3][6-13]
    // [card num][type][rank]
    private int value;
    private String representation;
    private CardType type;

    public Card(int value, CardType type) {
        this.value = value;
        switch (value) {
            case 11:
                representation = "J";
                break;
            case 12:
                representation = "Q";
                break;
            case 13:
                representation = "K";
                break;
            case 14:
                representation = "A";
                break;
        }

        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return value == card.value && type == card.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, type);
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(representation)
                .append(" ")
                .append(type)
                .toString();
    }

    public int compareTo(Card other) {
        if (this.value > other.value) {
            return 1;
        } else if (this.value < other.value) {
            return -1;
        }
        return 0;
    }

    public boolean areSameSuit(Card other) {
        return this.type == other.type;
    }


}