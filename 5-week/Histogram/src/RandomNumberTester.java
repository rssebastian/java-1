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
// Printing Counter Frequency...
// Each # represents 25.0
// 0.0 <= x < 0.1      #########################################                                                           1043  
// 0.1 <= x < 0.2      ######################################                                                              959   
// 0.2 <= x < 0.3      ########################################                                                            1018  
// 0.3 <= x < 0.4      ########################################                                                            1003  
// 0.4 <= x < 0.5      ######################################                                                              962   
// 0.5 <= x < 0.6      ########################################                                                            1001  
// 0.6 <= x < 0.7      #######################################                                                             1000  
// 0.7 <= x < 0.8      #########################################                                                           1044  
// 0.8 <= x < 0.9      ######################################                                                              958   
// 0.9 <= x < 1.0      ########################################                                                            1012  

// Printing Cumulative Frequency...
// Each # represents 100
// 0.0 <= x < 0.1      ##########                                                                                          1043.0
// 0.1 <= x < 0.2      ####################                                                                                2002.0
// 0.2 <= x < 0.3      ##############################                                                                      3020.0
// 0.3 <= x < 0.4      ########################################                                                            4023.0
// 0.4 <= x < 0.5      #################################################                                                   4985.0
// 0.5 <= x < 0.6      ###########################################################                                         5986.0
// 0.6 <= x < 0.7      #####################################################################                               6986.0
// 0.7 <= x < 0.8      ################################################################################                    8030.0
// 0.8 <= x < 0.9      #########################################################################################           8988.0
// 0.9 <= x < 1.0      ################################################################################################### 10000.0

// -----------------
// -----------------
// Conducting the second test...
// -----------------
// Printing Counter Frequency...
// Each # represents 25.0
// 0.0 <= x < 1.0                                                                                                          0
// 1.0 <= x < 2.0                                                                                                          0
// 2.0 <= x < 3.0                                                                                                          17
// 3.0 <= x < 4.0      ####                                                                                                125
// 4.0 <= x < 5.0      #############                                                                                       346
// 5.0 <= x < 6.0      ###############                                                                                     376
// 6.0 <= x < 7.0      ####                                                                                                124
// 7.0 <= x < 8.0                                                                                                          11
// 8.0 <= x < 9.0                                                                                                          1
// 9.0 <= x < 10.0                                                                                                         0

// Printing Cumulative Frequency...
// Each # represents 100
// 0.0 <= x < 1.0                                                                                                          0.0
// 1.0 <= x < 2.0                                                                                                          0.0
// 2.0 <= x < 3.0                                                                                                          17.0
// 3.0 <= x < 4.0      #                                                                                                   142.0
// 4.0 <= x < 5.0      ####                                                                                                488.0
// 5.0 <= x < 6.0      ########                                                                                            864.0
// 6.0 <= x < 7.0      #########                                                                                           988.0
// 7.0 <= x < 8.0      #########                                                                                           999.0
// 8.0 <= x < 9.0      #########                                                                                           1000.0
// 9.0 <= x < 10.0     #########                                                                                           1000.0

// -----------------
