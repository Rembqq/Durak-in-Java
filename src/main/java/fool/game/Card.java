package fool.game;

public class Card {
    // [0-5][0-3][6-13]
    // [card num][type][rank]
    private int value;
    private CardType type;

    public Card(int value, CardType type) {
        this.value = value;
        this.type = type;
    }
}