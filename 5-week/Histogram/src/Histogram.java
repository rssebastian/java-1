public class Histogram {
    public static double dataEntered;
    private Counter[] counterArr;
    public double[] limitArr;
    private double[] cumfreqArr;
    double minLimit;

    // A constructor that accepts the number of counters and the maximum and minimum
    // limits of the numbers (.i.e., the range of numbers).
    public Histogram(int numCounters, double maxLimit, double minLimit) {
        this.minLimit = minLimit;
        createHistogram(numCounters, maxLimit);
    }

    // A second constructor that accepts the maximum and minimum limits of the
    // numbers and initializes the Histogram with 10 counters for the specified
    // range.
    public Histogram(double maxLimit, double minLimit) {
        this.minLimit = minLimit;
        createHistogram(10, maxLimit);
    }

    // An add(double x) method that increments the corresponding counter.
    public void add(double x) {
        dataEntered++;

        // Increment the corresponding counter by 1
        for (int i = 0; i < limitArr.length; i++) {
            if (limitArr[i] > x) {
                counterArr[i].increment();
                break;
            }
        }
    }

    // A reset() method that sets all counter frequencies to zero.
    public void reset() {
        for (int i = 0; i < counterArr.length; i++) {
            counterArr[i].resetCount();
        }
    }

    // A plotFrequency() method that plots the counter frequencies
    public void plotFrequency() {
        System.out.println("Printing Counter Frequency...");
        System.out.println("Each # represents 25.0");
        for (int i = 0; i < counterArr.length; i++) {
            String tableHeader;
            if (i == 0) {
                tableHeader = createTableHeading(minLimit, limitArr[i]);
            } else {
                tableHeader = createTableHeading(limitArr[i - 1], limitArr[i]);
            }

            String dataString = createDataString((double) counterArr[i].getCount(), 25.0);
            String dataAmt = counterArr[i].toString();
            System.out.println(tableHeader + dataString + dataAmt);
        }
        System.out.println("");
    }

    // A plotCumulative() method that plots the cumulative frequencies.
    public void plotCumulative() {
        for (int i = 0; i < cumfreqArr.length; i++) {
            if (i == 0) {
                cumfreqArr[i] = roundToTwo((counterArr[i].getCount() / dataEntered) * 100.0);
            } else {
                cumfreqArr[i] = roundToTwo(((counterArr[i].getCount() / dataEntered) * 100.0) + cumfreqArr[i - 1]);
            }
        }
        System.out.println("Printing Cumulative Frequency...");
        System.out.println("Each # represents 1.0%");
        for (int i = 0; i < cumfreqArr.length; i++) {
            String tableHeader = addWhitespace(Double.toString(cumfreqArr[i]) + "%", 7);
            String dataString = "";
            double percent = cumfreqArr[i];
            while (percent > 1.0) {
                dataString += "#";
                percent -= 1.0;
            }
            System.out.println(tableHeader + dataString);
        }
        System.out.println("");
    }

    // Utility Methods
    // Rounds doubles to 2 decimal places
    private double roundToTwo(double input) {
        return Math.round(input * 100.0) / 100.0;
    }

    // Creates the Histogram with the number of counters being flexible between
    // constructors
    private void createHistogram(int numCounters, double maxLimit) {
        double temp = this.minLimit;
        double increment = roundToTwo((maxLimit - this.minLimit) / numCounters);
        counterArr = new Counter[numCounters];
        limitArr = new double[numCounters];
        cumfreqArr = new double[numCounters];

        for (int i = 0; i < counterArr.length; i++) {
            counterArr[i] = new Counter();
            limitArr[i] = roundToTwo((temp + increment));
            temp = limitArr[i];
        }
    }

    // To make table headings look prettier
    private String addWhitespace(String count, int limit) {
        while (count.length() < limit) {
            count += " ";
        }
        return count;
    }

    // Create table headings
    private String createTableHeading(double val1, double val2) {
        return addWhitespace(Double.toString(val1) + " <= x < " + Double.toString(val2), 20);
    }

    // To print representative data strings given a double and how much you want
    // each # to represent
    private String createDataString(double dataAmount, double hashAmt) {
        String data = "";
        while (dataAmount > hashAmt) {
            data += "#";
            dataAmount -= hashAmt;
        }
        return addWhitespace(data, 50);
    }
}
