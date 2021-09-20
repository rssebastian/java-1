// Solve TOO+TOO+TOO+TOO=GOOD with
// T, O, G, D being unique digits 0-9

// Implications:
// Minimum, but invalid GOOD can be 44 if TOO == 011
// GOOD % 4 == 0, so D must be divisible by 2 to be an even number
// GOOD must be at least > 0124

public class Cryptarithmetic {
    public static void main(String[] args) {
        for (int t = 0; t <= 9; t++) {
            for (int o = 0; o <= 9; o++) {
                // Move on if T==O
                if (t != o) {
                    int good = 4 * (t * 100 + o * 10 + o);
                    int d = good % 10;

                    // Confirms D is unique from T && O
                    if (d != t && d != o) {
                        // Checks if GOOD < 1000 so G can be a leading 0
                        int g = (good % 1000 > 9) ? 0 : good % 1000;
                        // Check if G is unique
                        if (g != d && g != t && g != o) {
                            // Check if O in GOOD matches O in TOO
                            int tempFirstO, tempSecondO;
                            if (g == 0) {
                                tempFirstO = good / 100;
                                tempSecondO = good % 100 / 10;
                            } else {
                                tempFirstO = good % 1000 / 100;
                                tempSecondO = good % 100 / 10;
                            }
                            if (tempFirstO == tempSecondO && tempFirstO == o) {
                                // Solution found!
                                System.out.printf("The value of T is %d%n", t);
                                System.out.printf("The value of O is %d%n", o);
                                System.out.printf("The value of D is %d%n", d);
                                System.out.printf("The value of G is %d%n", g);
                                System.out.printf("The value of TOO is %d%d%d%n", t, o, o);
                                System.out.printf("The value of GOOD is %d%n", good);
                            }
                        }
                    }
                }
            }
        }
    }
}

// TEST CASE OUTPUT
// The value of T is 1
// The value of O is 6
// The value of D is 4
// The value of G is 0
// The value of TOO is 166
// The value of GOOD is 664
