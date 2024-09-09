package fool.game;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class Human extends Player implements PlayerActions {

    private Scanner scanner = new Scanner(System.in);

    public Human(String name) {
        super(name);
    }

    public LinkedList<Card> turn() {

        getCards();

        int selectedCard;
        boolean endOfMove = false;
        LinkedList<Card> selected = new LinkedList<>();

        while(!endOfMove) {
            System.out.println("\nSelect Card: ");
            selectedCard = scanner.nextInt();
            if(selectedCard < 0 || selectedCard >= cards.size()) {
                continue;
            }

            selected.add(cards.get(selectedCard - 1));

            boolean endOfSelection = false;
            while(!endOfSelection) {
                System.out.println("Do you want to select one more?");
                System.out.println("(0 - no, 1 - yes) ");
                selectedCard = scanner.nextInt();
                switch(selectedCard) {
                    case 0:
                        endOfMove = true;
                        endOfSelection = true;
                        break;
                    case 1:
                        endOfSelection = true;
                        break;
                    default:
                        System.out.println("Incorrect input");

                }

            }
        }

        for (Card card : selected) {
            removeBy(card);
        }

        return selected;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//         human = (Human) o;
//        return Objects.equals(scanner, human.scanner);
//    }


    public LinkedList<Card> defence(LinkedList<Card> opponentCards) {

        System.out.println("Opponent's cards: ");
        for (int i = 0; i < opponentCards.size(); ++i) {
            System.out.print(i + 1 + " -> " + opponentCards.get(i));
        }

        //getCards();
        LinkedList<Card> selected = turn();
        for (int i = 0; i < opponentCards.size(); ++i) {
            Card c = opponentCards.get(i);
            for(int j = 0; j < selected.size(); j++) {
                Card defenceCard = selected.get(j);
                if(c )
            }
        }

        return cards;
    }

    public void removeBy(Card card) {
        for(int i = 0; i < cards.size(); ++i) {
            if(card == cards.get(i)) {
                cards.remove(i);
                break;
            }
        }
    }

    private void getCards() {
        System.out.println("Your cards: ");
        for(int i = 0; i < cards.size(); ++i) {
            System.out.print(i + 1 + " -> " + cards.get(i));
        }
        System.out.println();
    }


}
