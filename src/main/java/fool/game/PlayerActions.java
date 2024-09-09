package fool.game;

import java.util.LinkedList;

public interface PlayerActions {
    LinkedList<Card> turn();
    LinkedList<Card> defence(LinkedList<Card> opponentCards);
}
