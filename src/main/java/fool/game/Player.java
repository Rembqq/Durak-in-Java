package fool.game;

import java.util.LinkedList;
import java.util.Random;

public class Player implements PlayerActions{
    protected final String playerName;
    protected LinkedList<Card> cards = new LinkedList<>();
    public Player(String name) {
        playerName = name;
    }

    @Override
    public LinkedList<Card> turn() {
        System.out.println(playerName + " moves: ");
        return cards;
    }

    @Override
    public LinkedList<Card> defence(LinkedList<Card> opponentCards) {
        return null;
    }

}
