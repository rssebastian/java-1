public class Counter {
    private int count;

    public void increment() {
        count++;
    }

    public void decrement() {
        if (count > 0) {
            count--;
        }
    }

    public int getCount() {
        return count;
    }

    public void resetCount() {
        count = 0;
    }

    public void printCount() {
        System.out.println(count);
    }

    public String toString() {
        Integer countStr = count;
        return countStr.toString();
    }

    public boolean equals(Counter counter) {
        if (this.count == counter.count) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Counter counter1 = new Counter();
        System.out.println(counter1.count);
        counter1.increment();
        System.out.println(counter1.count);
        counter1.decrement();
        System.out.println(counter1.count);
        counter1.decrement();
        System.out.println(counter1.count);
        counter1.increment();
        counter1.increment();
        System.out.println(counter1.count);
        counter1.resetCount();
        System.out.println("counter1 is set to " + counter1.toString());
        Counter counter2 = new Counter();
        System.out.println(counter1.equals(counter2));
        counter2.increment();
        System.out.println(counter2.count);
        System.out.println(counter1.equals(counter2));
    }
}
