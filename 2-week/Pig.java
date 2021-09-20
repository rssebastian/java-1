import java.util.Scanner;

public class Pig {

    // Instance Variables
    Scanner keyboard = new Scanner(System.in);
    private int playerScore = 0;
    private int compScore = 0;
    private int diceRoll = 0;
    private int turnTotal = 0;
    private boolean myTurn = true;
    private boolean turnOver = false;
    private boolean gameOver = false;
    private String lineBreak = "--------------------------------------------";

    // Constructor
    public Pig() {
    }

    public static void main(String[] args) {
        Pig game = new Pig();
        game.playGame();
    }

    // Starts the Game
    // Resets the turn total every new turn
    // Check each round if a player has won
    public void playGame() {
        while (!gameOver) {
            turnTotal = 0;
            startTurn(myTurn);
            checkGameOver();
        }
        keyboard.close();
    }

    // Decides whose turn it is
    private void startTurn(boolean myTurn) {
        if (myTurn) {
            System.out.println("Starting your turn: ");
            playerTurn();
        } else {
            System.out.println("Starting the computer's turn: ");
            compTurn();
        }
    }

    // Roll dice, if 2-6, prompt user to roll again or hold
    private void playerTurn() {
        turnOver = false;

        // First Roll for Turn
        setDiceRoll();

        while (!turnOver) {

            // Print Scores & Last Dice Roll
            System.out.println(lineBreak);
            System.out.printf("Your score is currently: %d%n", playerScore);
            System.out.printf("The computer's score is currently: %d%n", compScore);
            System.out.printf("The last roll was a: %d%n", diceRoll);
            int tempTotal = (diceRoll == 1) ? 0 : turnTotal + diceRoll;
            System.out.printf("The current turn's total is: %d%n", tempTotal);
            System.out.println(lineBreak);

            checkDiceRoll();

            if (!turnOver) {
                boolean validChoice = false;
                String playerChoice = "";

                // Validate the user's input
                while (!validChoice) {
                    System.out.print("What would you like to do? (r = roll, h = hold): ");
                    playerChoice = keyboard.next();
                    if (!playerChoice.equals("r") && !playerChoice.equals("h")) {
                        System.out.println("Please type only 'r' or 'h'");
                    } else {
                        validChoice = true;
                    }
                }

                switch (playerChoice) {
                    case "r":
                        System.out.println("You chose to reroll!");
                        setTurnTotal();
                        setDiceRoll();
                        break;
                    case "h":
                        System.out.println("You chose to hold!");
                        setTurnTotal();
                        endTurn();
                        break;
                }
            }
        }
    }

    // Computer will roll until it hits >=20, or rolls a 1
    private void compTurn() {
        turnOver = false;
        setDiceRoll();
        System.out.println(lineBreak);
        System.out.printf("The computer rolled a %d!%n", diceRoll);
        checkDiceRoll();
        while (!turnOver) {
            if (turnTotal >= 20) {
                System.out.printf("The computer ends their turn with %d points!%n", turnTotal);
                endTurn();
            } else {
                setTurnTotal();
                setDiceRoll();
                System.out.printf("The computer rolled a %d!%n", diceRoll);
                checkDiceRoll();
            }
        }
    }

    // Method to roll the dice
    private void setDiceRoll() {
        diceRoll = (int) Math.floor(Math.random() * 6 + 1);
    }

    // Method to keep track of turn's total
    private void setTurnTotal() {
        turnTotal += diceRoll;
    }

    // Decide if the turn should end if a player rolls a 1
    private void checkDiceRoll() {
        if (diceRoll == 1) {
            turnTotal = 0;
            if (myTurn) {
                System.out.println("You rolled a 1! You lose this round's points. The computer goes next.");
                System.out.println(lineBreak);
            } else {
                System.out.println("The computer rolled a 1! It loses this round's points. You go next.");
                System.out.println(lineBreak);
            }
            endTurn();
        }
    }

    // Determines who gets the points for the turn and changes the player
    private void endTurn() {
        if (myTurn) {
            playerScore += turnTotal;
        } else {
            compScore += turnTotal;
        }

        myTurn = !myTurn;
        turnOver = true;
    }

    // Checks if a player has reached the end
    private void checkGameOver() {
        if (playerScore >= 100) {
            gameOver = true;
            System.out.println(lineBreak);
            System.out.println("Congratulations, you've won!");
            System.out.printf("Your final score was: %d%n", playerScore);
            System.out.printf("The computer's final score was: %d%n", compScore);
            System.out.println("Thanks for playing!");
            System.out.println(lineBreak);
        } else if (compScore >= 100) {
            gameOver = true;
            System.out.println(lineBreak);
            System.out.println("Sorry, you've lost!");
            System.out.printf("Your final score was: %d%n", playerScore);
            System.out.printf("The computer's final score was: %d%n", compScore);
            System.out.println("Thanks for playing!");
            System.out.println(lineBreak);
        }
    }
}

// TEST CASE OUTPUT
// Starting your turn:
// --------------------------------------------
// Your score is currently: 0
// The computer's score is currently: 0
// The last roll was a: 1
// The current turn's total is: 0
// --------------------------------------------
// You rolled a 1! You lose this round's points. The computer goes next.
// --------------------------------------------
// Starting the computer's turn:
// --------------------------------------------
// The computer rolled a 1!
// The computer rolled a 1! It loses this round's points. You go next.
// --------------------------------------------
// Starting your turn:
// --------------------------------------------
// Your score is currently: 0
// The computer's score is currently: 0
// The last roll was a: 3
// The current turn's total is: 3
// --------------------------------------------
// What would you like to do? (r = roll, h = hold): r
// You chose to reroll!
// --------------------------------------------
// Your score is currently: 0
// The computer's score is currently: 0
// The last roll was a: 3
// The current turn's total is: 6
// --------------------------------------------
// What would you like to do? (r = roll, h = hold): r
// You chose to reroll!
// --------------------------------------------
// Your score is currently: 0
// The computer's score is currently: 0
// The last roll was a: 2
// The current turn's total is: 8
// --------------------------------------------
// What would you like to do? (r = roll, h = hold): r
// You chose to reroll!
// --------------------------------------------
// Your score is currently: 0
// The computer's score is currently: 0
// The last roll was a: 3
// The current turn's total is: 11
// --------------------------------------------
// What would you like to do? (r = roll, h = hold): r
// You chose to reroll!
// --------------------------------------------
// Your score is currently: 0
// The computer's score is currently: 0
// The last roll was a: 6
// The current turn's total is: 17
// --------------------------------------------
// What would you like to do? (r = roll, h = hold): r
// You chose to reroll!
// --------------------------------------------
// Your score is currently: 0
// The computer's score is currently: 0
// The last roll was a: 3
// The current turn's total is: 20
// --------------------------------------------
// What would you like to do? (r = roll, h = hold): r
// You chose to reroll!
// --------------------------------------------
// Your score is currently: 0
// The computer's score is currently: 0
// The last roll was a: 3
// The current turn's total is: 23
// --------------------------------------------
// What would you like to do? (r = roll, h = hold): r
// You chose to reroll!
// --------------------------------------------
// Your score is currently: 0
// The computer's score is currently: 0
// The last roll was a: 5
// The current turn's total is: 28
// --------------------------------------------
// What would you like to do? (r = roll, h = hold): h
// You chose to hold!
// Starting the computer's turn:
// --------------------------------------------
// The computer rolled a 2!
// The computer rolled a 2!
// The computer rolled a 6!
// The computer rolled a 6!
// The computer rolled a 3!
// The computer rolled a 1!
// The computer rolled a 1! It loses this round's points. You go next.
// --------------------------------------------
// Starting your turn:
// --------------------------------------------
// Your score is currently: 28
// The computer's score is currently: 0
// The last roll was a: 4
// The current turn's total is: 4
// --------------------------------------------
// What would you like to do? (r = roll, h = hold): r
// You chose to reroll!
// --------------------------------------------
// Your score is currently: 28
// The computer's score is currently: 0
// The last roll was a: 4
// The current turn's total is: 8
// --------------------------------------------
// What would you like to do? (r = roll, h = hold): r
// You chose to reroll!
// --------------------------------------------
// Your score is currently: 28
// The computer's score is currently: 0
// The last roll was a: 2
// The current turn's total is: 10
// --------------------------------------------
// What would you like to do? (r = roll, h = hold): r
// You chose to reroll!
// --------------------------------------------
// Your score is currently: 28
// The computer's score is currently: 0
// The last roll was a: 5
// The current turn's total is: 15
// --------------------------------------------
// What would you like to do? (r = roll, h = hold): r
// You chose to reroll!
// --------------------------------------------
// Your score is currently: 28
// The computer's score is currently: 0
// The last roll was a: 4
// The current turn's total is: 19
// --------------------------------------------
// What would you like to do? (r = roll, h = hold): r
// You chose to reroll!
// --------------------------------------------
// Your score is currently: 28
// The computer's score is currently: 0
// The last roll was a: 6
// The current turn's total is: 25
// --------------------------------------------
// What would you like to do? (r = roll, h = hold): r
// You chose to reroll!
// --------------------------------------------
// Your score is currently: 28
// The computer's score is currently: 0
// The last roll was a: 3
// The current turn's total is: 28
// --------------------------------------------
// What would you like to do? (r = roll, h = hold): h
// You chose to hold!
// Starting the computer's turn:
// --------------------------------------------
// The computer rolled a 1!
// The computer rolled a 1! It loses this round's points. You go next.
// --------------------------------------------
// Starting your turn:
// --------------------------------------------
// Your score is currently: 56
// The computer's score is currently: 0
// The last roll was a: 3
// The current turn's total is: 3
// --------------------------------------------
// What would you like to do? (r = roll, h = hold): r
// You chose to reroll!
// --------------------------------------------
// Your score is currently: 56
// The computer's score is currently: 0
// The last roll was a: 4
// The current turn's total is: 7
// --------------------------------------------
// What would you like to do? (r = roll, h = hold): r
// You chose to reroll!
// --------------------------------------------
// Your score is currently: 56
// The computer's score is currently: 0
// The last roll was a: 2
// The current turn's total is: 9
// --------------------------------------------
// What would you like to do? (r = roll, h = hold): r
// You chose to reroll!
// --------------------------------------------
// Your score is currently: 56
// The computer's score is currently: 0
// The last roll was a: 2
// The current turn's total is: 11
// --------------------------------------------
// What would you like to do? (r = roll, h = hold): r
// You chose to reroll!
// --------------------------------------------
// Your score is currently: 56
// The computer's score is currently: 0
// The last roll was a: 5
// The current turn's total is: 16
// --------------------------------------------
// What would you like to do? (r = roll, h = hold): r
// You chose to reroll!
// --------------------------------------------
// Your score is currently: 56
// The computer's score is currently: 0
// The last roll was a: 3
// The current turn's total is: 19
// --------------------------------------------
// What would you like to do? (r = roll, h = hold): h
// You chose to hold!
// Starting the computer's turn:
// --------------------------------------------
// The computer rolled a 6!
// The computer rolled a 6!
// The computer rolled a 6!
// The computer rolled a 6!
// The computer rolled a 1!
// The computer rolled a 1! It loses this round's points. You go next.
// --------------------------------------------
// Starting your turn:
// --------------------------------------------
// Your score is currently: 75
// The computer's score is currently: 0
// The last roll was a: 1
// The current turn's total is: 0
// --------------------------------------------
// You rolled a 1! You lose this round's points. The computer goes next.
// --------------------------------------------
// Starting the computer's turn:
// --------------------------------------------
// The computer rolled a 4!
// The computer rolled a 3!
// The computer rolled a 1!
// The computer rolled a 1! It loses this round's points. You go next.
// --------------------------------------------
// Starting your turn:
// --------------------------------------------
// Your score is currently: 75
// The computer's score is currently: 0
// The last roll was a: 2
// The current turn's total is: 2
// --------------------------------------------
// What would you like to do? (r = roll, h = hold): r
// You chose to reroll!
// --------------------------------------------
// Your score is currently: 75
// The computer's score is currently: 0
// The last roll was a: 2
// The current turn's total is: 4
// --------------------------------------------
// What would you like to do? (r = roll, h = hold): r
// You chose to reroll!
// --------------------------------------------
// Your score is currently: 75
// The computer's score is currently: 0
// The last roll was a: 2
// The current turn's total is: 6
// --------------------------------------------
// What would you like to do? (r = roll, h = hold): r
// You chose to reroll!
// --------------------------------------------
// Your score is currently: 75
// The computer's score is currently: 0
// The last roll was a: 1
// The current turn's total is: 0
// --------------------------------------------
// You rolled a 1! You lose this round's points. The computer goes next.
// --------------------------------------------
// Starting the computer's turn:
// --------------------------------------------
// The computer rolled a 5!
// The computer rolled a 3!
// The computer rolled a 1!
// The computer rolled a 1! It loses this round's points. You go next.
// --------------------------------------------
// Starting your turn:
// --------------------------------------------
// Your score is currently: 75
// The computer's score is currently: 0
// The last roll was a: 3
// The current turn's total is: 3
// --------------------------------------------
// What would you like to do? (r = roll, h = hold): r
// You chose to reroll!
// --------------------------------------------
// Your score is currently: 75
// The computer's score is currently: 0
// The last roll was a: 6
// The current turn's total is: 9
// --------------------------------------------
// What would you like to do? (r = roll, h = hold): r
// You chose to reroll!
// --------------------------------------------
// Your score is currently: 75
// The computer's score is currently: 0
// The last roll was a: 1
// The current turn's total is: 0
// --------------------------------------------
// You rolled a 1! You lose this round's points. The computer goes next.
// --------------------------------------------
// Starting the computer's turn:
// --------------------------------------------
// The computer rolled a 5!
// The computer rolled a 5!
// The computer rolled a 5!
// The computer rolled a 1!
// The computer rolled a 1! It loses this round's points. You go next.
// --------------------------------------------
// Starting your turn:
// --------------------------------------------
// Your score is currently: 75
// The computer's score is currently: 0
// The last roll was a: 6
// The current turn's total is: 6
// --------------------------------------------
// What would you like to do? (r = roll, h = hold): h
// You chose to hold!
// Starting the computer's turn:
// --------------------------------------------
// The computer rolled a 2!
// The computer rolled a 6!
// The computer rolled a 5!
// The computer rolled a 6!
// The computer rolled a 1!
// The computer rolled a 1! It loses this round's points. You go next.
// --------------------------------------------
// Starting your turn:
// --------------------------------------------
// Your score is currently: 81
// The computer's score is currently: 0
// The last roll was a: 1
// The current turn's total is: 0
// --------------------------------------------
// You rolled a 1! You lose this round's points. The computer goes next.
// --------------------------------------------
// Starting the computer's turn:
// --------------------------------------------
// The computer rolled a 2!
// The computer rolled a 2!
// The computer rolled a 1!
// The computer rolled a 1! It loses this round's points. You go next.
// --------------------------------------------
// Starting your turn:
// --------------------------------------------
// Your score is currently: 81
// The computer's score is currently: 0
// The last roll was a: 3
// The current turn's total is: 3
// --------------------------------------------
// What would you like to do? (r = roll, h = hold): r
// You chose to reroll!
// --------------------------------------------
// Your score is currently: 81
// The computer's score is currently: 0
// The last roll was a: 5
// The current turn's total is: 8
// --------------------------------------------
// What would you like to do? (r = roll, h = hold): r
// You chose to reroll!
// --------------------------------------------
// Your score is currently: 81
// The computer's score is currently: 0
// The last roll was a: 2
// The current turn's total is: 10
// --------------------------------------------
// What would you like to do? (r = roll, h = hold): r
// You chose to reroll!
// --------------------------------------------
// Your score is currently: 81
// The computer's score is currently: 0
// The last roll was a: 5
// The current turn's total is: 15
// --------------------------------------------
// What would you like to do? (r = roll, h = hold): r
// You chose to reroll!
// --------------------------------------------
// Your score is currently: 81
// The computer's score is currently: 0
// The last roll was a: 1
// The current turn's total is: 0
// --------------------------------------------
// You rolled a 1! You lose this round's points. The computer goes next.
// --------------------------------------------
// Starting the computer's turn:
// --------------------------------------------
// The computer rolled a 1!
// The computer rolled a 1! It loses this round's points. You go next.
// --------------------------------------------
// Starting your turn:
// --------------------------------------------
// Your score is currently: 81
// The computer's score is currently: 0
// The last roll was a: 2
// The current turn's total is: 2
// --------------------------------------------
// What would you like to do? (r = roll, h = hold): r
// You chose to reroll!
// --------------------------------------------
// Your score is currently: 81
// The computer's score is currently: 0
// The last roll was a: 3
// The current turn's total is: 5
// --------------------------------------------
// What would you like to do? (r = roll, h = hold): r
// You chose to reroll!
// --------------------------------------------
// Your score is currently: 81
// The computer's score is currently: 0
// The last roll was a: 4
// The current turn's total is: 9
// --------------------------------------------
// What would you like to do? (r = roll, h = hold): r
// You chose to reroll!
// --------------------------------------------
// Your score is currently: 81
// The computer's score is currently: 0
// The last roll was a: 3
// The current turn's total is: 12
// --------------------------------------------
// What would you like to do? (r = roll, h = hold): r
// You chose to reroll!
// --------------------------------------------
// Your score is currently: 81
// The computer's score is currently: 0
// The last roll was a: 6
// The current turn's total is: 18
// --------------------------------------------
// What would you like to do? (r = roll, h = hold): r
// You chose to reroll!
// --------------------------------------------
// Your score is currently: 81
// The computer's score is currently: 0
// The last roll was a: 5
// The current turn's total is: 23
// --------------------------------------------
// What would you like to do? (r = roll, h = hold): h
// You chose to hold!
// --------------------------------------------
// Congratulations, you've won!
// Your final score was: 104
// The computer's final score was: 0
// Thanks for playing!
// --------------------------------------------