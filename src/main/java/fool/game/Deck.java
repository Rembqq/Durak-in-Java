package fool.game;

import java.util.Collections;
import java.util.LinkedList;

public class Deck {
    private LinkedList<Card> cards;

    public Deck() {
        // fill deck
        CardType[] types = CardType.values();
        for(int i = 6; i <= 14; ++i) {
            for(int j = 0; j < 4; ++j) {
                cards.add(new Card(i, types[i]));
            }
        }
        Collections.shuffle(cards);
    }

    public void takeCard() {
        cards.pop();
    }

}
