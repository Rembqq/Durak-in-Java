package fool.game;

public enum CardType {
    DIAMONDS("♦"),
    HEARTS("♥"),
    CLUBS("♣"),
    SPADES("♠");

    private final String representation;

    CardType(String representation) {
        this.representation = representation;
    }

    public String getRepresentation() {
        return representation;
    }

    @Override
    public String toString() {
        return representation;
    }
}
