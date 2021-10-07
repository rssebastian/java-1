public class Histogram {
    public static double dataEntered;
    private static Counter[] counterArr;
    public double[] limitArr;
    private double[] cumfreqArr;
    private double increment;

    public Histogram(int numCounters, double maxLimit, double minLimit) {
        // Each Counter in the counterArr should correspond to its maximum limit in the
        // limitArr, same index
        double temp = minLimit;

        // Round the increment to 2 decimal places
        increment = Math.round((maxLimit - minLimit) / numCounters * 100.0) / 100.0;

        counterArr = new Counter[numCounters];
        limitArr = new double[numCounters];
        cumfreqArr = new double[numCounters];

        for (int i = 0; i < counterArr.length; i++) {
            counterArr[i] = new Counter();
        }

        for (int i = 0; i < limitArr.length; i++) {
            limitArr[i] = Math.round((temp + increment) * 100.0) / 100.0;
            temp = limitArr[i];
        }
    }

    public Histogram(double maxLimit, double minLimit) {
        double temp = minLimit;
        increment = Math.round((maxLimit - minLimit) / 10 * 100.0) / 100.0;
        counterArr = new Counter[10];
        limitArr = new double[10];
        cumfreqArr = new double[10];

        for (int i = 0; i < counterArr.length; i++) {
            counterArr[i] = new Counter();
        }

        for (int i = 0; i < limitArr.length; i++) {
            limitArr[i] = Math.round((temp + increment) * 100.0) / 100.0;
            temp = limitArr[i];
        }
    }

    public void showGram() {
        for (int i = 0; i < limitArr.length; i++) {
            System.out.print(limitArr[i] + " ");
        }
        System.out.println("");
    }

    public static void add(double x) {
        counterArr[(int) x].increment();
        dataEntered++;
    }

    public void reset() {
        for (int i = 0; i < counterArr.length; i++) {
            counterArr[i].resetCount();
        }
    }

    public void plotFrequency() {
        for (int i = 0; i < counterArr.length; i++) {
            System.out.print(counterArr[i].toString() + " ");
        }
        System.out.println("");
    }

    public void plotCumulative() {
        if (dataEntered == 0) {
            System.out.println("You need to create at least 1 data point before running this method");
            System.exit(0);
        }
        for (int i = 0; i < cumfreqArr.length; i++) {
            if (i == 0) {
                cumfreqArr[i] = Math.round((counterArr[i].getCount() / dataEntered) * 100.0 * 100.0) / 100.0;
            } else {
                cumfreqArr[i] = Math.round(
                        (((counterArr[i].getCount() / dataEntered) * 100.0) + cumfreqArr[i - 1]) * 100.0) / 100.0;
            }
        }
        for (int i = 0; i < cumfreqArr.length; i++) {
            System.out.print(cumfreqArr[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {

    }
}
