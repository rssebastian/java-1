import java.util.Scanner;

public class PizzaTester {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        Pizza userPizza = new Pizza();
        System.out.print(
                "Welcome to the Pizza App! What size pizza would you like to order? (small, medium, or large): ");

        userPizza.setSize(keyboard.next());
        System.out.printf("%nCertainly! How much cheese topping would you like on your %s pizza? ",
                userPizza.getSize());
        userPizza.setNumCheese(keyboard.nextInt());
        System.out.printf(
                "%nSounds good, we'll add %d cheese topping(s)! And how much pepperoni topping would you like? ",
                userPizza.getNumCheese());
        userPizza.setNumPepperoni(keyboard.nextInt());
        System.out.printf("%nAwesome, we'll add %d pepperoni topping(s)! Lastly, how much ham topping would you like? ",
                userPizza.getNumPepperoni());
        userPizza.setNumHam(keyboard.nextInt());
        System.out.printf("%nGreat! We'll add %d ham topping(s). Let me print out your final order...",
                userPizza.getNumHam());
        System.out.printf("%nThank you for ordering! %s We hope you enjoy!", userPizza.getDescription());
        keyboard.close();
    }
}

// TEST CASE OUTPUT
// ------------------------------------
// large, 1 cheese, 1 pepperoni, 2 ham
// ------------------------------------
// Welcome to the Pizza App! What size pizza would you like to order? (small,
// medium, or large): large

// Certainly! How much cheese topping would you like on your large pizza? 1

// Sounds good, we'll add 1 cheese topping(s)! And how much pepperoni topping
// would you like? 1

// Awesome, we'll add 1 pepperoni topping(s)! Lastly, how much ham topping would
// you like? 2

// Great! We'll add 2 ham topping(s). Let me print out your final order...
// Thank you for ordering! You ordered a large pizza with 1 cheese topping(s), 1
// pepperoni topping(s), and 2 ham topping(s)! Your total cost is $22.00! We
// hope you enjoy!
// ------------------------------------
// medium, 0 cheese, 2 pepperoni, 3 ham
// ------------------------------------
// Welcome to the Pizza App! What size pizza would you like to order? (small,
// medium, or large): medium

// Certainly! How much cheese topping would you like on your medium pizza? 0

// Sounds good, we'll add 0 cheese topping(s)! And how much pepperoni topping
// would you like? 2

// Awesome, we'll add 2 pepperoni topping(s)! Lastly, how much ham topping would
// you like? 3

// Great! We'll add 3 ham topping(s). Let me print out your final order...
// Thank you for ordering! You ordered a medium pizza with 0 cheese topping(s),
// 2 pepperoni topping(s), and 3 ham topping(s)! Your total cost is $22.00! We
// hope you enjoy!
// ------------------------------------
// small, 3 cheese, 3 pepperoni, 1 ham
// ------------------------------------
// Welcome to the Pizza App! What size pizza would you like to order? (small,
// medium, or large): small

// Certainly! How much cheese topping would you like on your small pizza? 3

// Sounds good, we'll add 3 cheese topping(s)! And how much pepperoni topping
// would you like? 3

// Awesome, we'll add 3 pepperoni topping(s)! Lastly, how much ham topping would
// you like? 1

// Great! We'll add 1 ham topping(s). Let me print out your final order...
// Thank you for ordering! You ordered a small pizza with 3 cheese topping(s), 3
// pepperoni topping(s), and 1 ham topping(s)! Your total cost is $24.00! We
// hope you enjoy!