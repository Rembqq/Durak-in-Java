package fool.game;

import java.util.LinkedList;

public interface PlayerActions {
    LinkedList<Card> turn();
    LinkedList<Card> defense(LinkedList<Card> opponentTurn);
}
