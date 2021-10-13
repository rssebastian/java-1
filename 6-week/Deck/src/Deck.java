public class Deck {
    String[][] deckArr = new String[4][13];
    String[][] firstHalf = new String[2][13];
    String[][] secondHalf = new String[2][13];

    // Deck() constructor that creates an unshuffled deck.
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

    // A shuffle() method that does a perfect shuffle.
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

        int firstHalfRow = 0;
        int firstHalfCol = 0;
        int secondHalfRow = 0;
        int secondHalfCol = 0;
        boolean firstDeck = true;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                if (firstDeck) {
                    deckArr[i][j] = firstHalf[firstHalfRow][firstHalfCol];
                    firstHalfCol++;
                    firstDeck = false;
                    if (firstHalfCol == 13) {
                        firstHalfRow++;
                        firstHalfCol = 0;
                    }
                } else {
                    deckArr[i][j] = secondHalf[secondHalfRow][secondHalfCol];
                    secondHalfCol++;
                    firstDeck = true;
                    if (secondHalfCol == 13) {
                        secondHalfRow++;
                        secondHalfCol = 0;
                    }
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

    public boolean equals(Deck aDeck) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                if (!deckArr[i][j].equals(aDeck.deckArr[i][j])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String linebreak = "---------------";
        Deck deck = new Deck();
        System.out.println(linebreak);
        deck.printDeck();
        System.out.println(linebreak);
        deck.shuffle();
        deck.printDeck();
        System.out.println(linebreak);
        Deck deck2 = new Deck();
        deck2.printDeck();
        System.out.println(linebreak);
        System.out.println(deck.equals(deck2));
        Deck deck3 = new Deck();
        System.out.println(deck2.equals(deck3));
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
