public class Deck {
    String[][] deckArr = new String[4][13];
    String[][] firstHalf = new String[2][13];
    String[][] secondHalf = new String[2][13];

    public Deck() {
        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    deckArr[i] = generateCards("H");
                    break;
                case 1:
                    deckArr[i] = generateCards("C");
                    break;
                case 2:
                    deckArr[i] = generateCards("D");
                    break;
                case 3:
                    deckArr[i] = generateCards("S");
                    break;
                default:
                    return;
            }
        }
    }

    public void shuffle() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                if (i == 0 || i == 1) {
                    firstHalf[i][j] = deckArr[i][j];
                } else {
                    secondHalf[i - 2][j] = deckArr[i][j];
                }
            }
        }
    }

    public void printDeck() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                System.out.print(deckArr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.printDeck();
        deck.shuffle();
        deck.deckArr[0][0] = "HI";
        deck.printDeck();
        deck.printHalves();

    }

    // Utility Methods
    private String[] generateCards(String suit) {
        String[] cards = new String[13];
        for (int i = 0; i < 13; i++) {
            switch (i) {
                case 0:
                    cards[i] = "A" + suit;
                    break;
                case 10:
                    cards[i] = "J" + suit;
                    break;
                case 11:
                    cards[i] = "Q" + suit;
                    break;
                case 12:
                    cards[i] = "K" + suit;
                    break;
                default:
                    cards[i] = (i + 1) + suit;
                    break;
            }
        }
        return cards;
    }

    private void printHalves() {
        System.out.println("First Half: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 13; j++) {
                System.out.print(firstHalf[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Second Half: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 13; j++) {
                System.out.print(secondHalf[i][j] + " ");
            }
            System.out.println();
        }
    }
}
