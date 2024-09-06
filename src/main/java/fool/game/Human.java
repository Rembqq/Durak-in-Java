package fool.game;

import java.util.LinkedList;
import java.util.Scanner;

public class Human extends Player implements PlayerActions {

    private Scanner scanner = new Scanner(System.in);

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
            cards.remove(selectedCard - 1);

            boolean endOfSelection = false;
            while(!endOfSelection) {
                System.out.println("Do you want to select one more?");
                System.out.println("(0 - no, 1 - yes) ");
                selectedCard = scanner.nextInt();
                switch(selectedCard) {
                    case 0:
                        endOfMove = true;
                        break;
                    case 1:
                        endOfSelection = true;
                        break;
                    default:
                        System.out.println("Incorrect input");

                }

            }
        }
        return selected;
    }

    public Card defense(Card opponentCard) {
        getCards();

    }

    private void getCards() {
        System.out.println("Your cards: ");
        for(int i = 0; i < cards.size(); ++i) {
            System.out.print(i + " -> " + cards.get(i));
        }
        System.out.println();
    }


}
