public class RandomNumberTester {
    public static void main(String[] args) {
        Histogram testHisto = new Histogram(1.0, 0);
        for (int i = 0; i < 10000; i++) {
            double randNum = Math.random();
            for (int j = 0; j < testHisto.limitArr.length; j++) {
                if (testHisto.limitArr[j] > randNum) {
                    testHisto.add(j);
                    break;
                }
            }
        }
        testHisto.plotFrequency();
        System.out.println(testHisto.dataEntered);
        testHisto.plotCumulative();
    }
}
