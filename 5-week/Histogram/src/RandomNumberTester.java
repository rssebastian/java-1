import java.util.Random;

public class RandomNumberTester {
    public static void main(String[] args) {
        String linebreak = "-----------------";
        System.out.println(linebreak);
        System.out.println("Conducting the first test...");
        System.out.println(linebreak);

        Histogram test1 = new Histogram(1.0, 0);

        // Repeat this 10,000 times
        for (int i = 0; i < 10000; i++) {
            // Generate a random number between 0 and 1
            Random randNum = new Random();
            test1.add(randNum.nextDouble());
        }
        // Print the counter frequencies and the cumulative frequencies
        test1.plotFrequency();
        test1.plotCumulative();

        System.out.println(linebreak);
        System.out.println(linebreak);
        System.out.println("Conducting the second test...");
        System.out.println(linebreak);

        Histogram test2 = new Histogram(10, 0);
        Histogram.dataEntered = 0.0;

        // Repeat this 1,000 times
        for (int i = 0; i < 1000; i++) {

            // Generate 10 random numbers between 0 and 1 and add them up
            double summedNum = 0.0;
            for (int j = 0; j < 10; j++) {
                Random randNum = new Random();
                summedNum += randNum.nextDouble();
            }

            // Increment the corresponding bin by 1
            test2.add(summedNum);
        }
        test2.plotFrequency();
        test2.plotCumulative();
        System.out.println(linebreak);
    }
}

// TEST CASE OUTPUT
// -----------------
// Conducting the first test...
// -----------------
// 969 1798 2161 2013 1533 921 419 150 34 2
// 9.69 27.67 49.28 69.41 84.74 93.95 98.14 99.64 99.98 100.0
// -----------------
// -----------------
// Conducting the second test...
// -----------------
// 0 0 13 120 383 360 109 14 1 0
// 0.0 0.0 1.3 13.3 51.6 87.6 98.5 99.9 100.0 100.0
// -----------------
// -----------------------------------------------------------------
// -----------------
// Conducting the first test...
// -----------------
// 969 1763 2188 1981 1594 867 451 152 33 2
// 9.69 27.32 49.2 69.01 84.95 93.62 98.13 99.65 99.98 100.0
// -----------------
// -----------------
// Conducting the second test...
// -----------------
// 0 1 12 113 372 358 131 13 0 0
// 0.0 0.1 1.3 12.6 49.8 85.6 98.7 100.0 100.0 100.0
// -----------------
// -----------------------------------------------------------------
// -----------------
// Conducting the first test...
// -----------------
// 1015 1795 2120 2056 1497 903 438 152 21 3
// 10.15 28.1 49.3 69.86 84.83 93.86 98.24 99.76 99.97 100.0
// -----------------
// -----------------
// Conducting the second test...
// -----------------
// 0 0 8 105 388 355 121 23 0 0
// 0.0 0.0 0.8 11.3 50.1 85.6 97.7 100.0 100.0 100.0
// -----------------