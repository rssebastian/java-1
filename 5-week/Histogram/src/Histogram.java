public class Histogram {
    private Counter[] counterArr;
    private double[] limitArr;
    private double increment;

    public Histogram(int numCounters, float maxLimit, float minLimit) {
        double temp = minLimit;
        increment = Math.round((maxLimit - minLimit) / numCounters * 100.0) / 100.0;
        counterArr = new Counter[numCounters];
        limitArr = new double[numCounters];

        for (int i = 0; i < limitArr.length; i++) {
            limitArr[i] = Math.round((temp + increment) * 100.0) / 100.0;
            temp = limitArr[i];
        }
    }

    public Histogram(float maxLimit, float minLimit) {
        double temp = minLimit;
        increment = Math.round((maxLimit - minLimit) / 10 * 100.0) / 100.0;
        counterArr = new Counter[10];
        limitArr = new double[10];

        for (int i = 0; i < limitArr.length; i++) {
            limitArr[i] = Math.round((temp + increment) * 100.0) / 100.0;
            temp = limitArr[i];
        }
    }

    public void showGram() {
        for (int i = 0; i < limitArr.length; i++) {
            System.out.println(limitArr[i] + " ");
        }
    }

    public void add(double x) {
        counterArr[(int) x].increment();
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

    }

    public static void main(String[] args) {
        Histogram testHisto = new Histogram(10, 3, 0);
        Histogram testHisto2 = new Histogram(3, 0);
        testHisto.showGram();
        testHisto2.showGram();
    }
}
