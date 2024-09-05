package fool.game;

public class Card {
    // [0-5][0-3][6-13]
    // [card num][type][rank]
    private String value;
    private String representation;
    private CardType type;

    public Card(String value, String representation, CardType type) {
        this.value = value;
        this.representation = representation;
        this.type = type;
    }
}