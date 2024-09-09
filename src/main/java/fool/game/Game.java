package fool.game;

public class Game {
    public static void start(String name) {
        Human h1 = new Human("Miquella");
        Player p1 = new Player("Bot Austin");
        //Deck deck = new Deck();

        Card c1 = new Card(12, CardType.SPADES);
        Card c2 = new Card(8, CardType.DIAMONDS);
//        Card c3 = new Card(13, CardType.HEARTS);
//        Card c4 = new Card(6, CardType.CLUBS);
//        Card c5 = new Card(10, CardType.SPADES);
//        Card c6 = new Card(7, CardType.DIAMONDS);
        System.out.println(c1.compareTo(c2));

    }
}
