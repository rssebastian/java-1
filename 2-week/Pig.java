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