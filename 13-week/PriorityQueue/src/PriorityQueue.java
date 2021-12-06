import java.util.ArrayList;

public class PriorityQueue<T> {
    private ArrayList<T> pq;
    private ArrayList<Integer> pqPriority;

    PriorityQueue() {
        pq = new ArrayList<>();
        pqPriority = new ArrayList<>();
    }

    public void add(T item, int priority) {
        pq.add(item);
        pqPriority.add(priority);
    };

    public T remove() {
        if (!pq.isEmpty()) {
            int highestPriority = findMax();
            pqPriority.remove(highestPriority);
            return pq.remove(highestPriority);
        }
        return null;
    };

    public void printQueue() {
        for (T el : pq) {
            System.out.print("Item: " + el + ", Priority: ");
            System.out.println(pqPriority.get(pq.indexOf(el)));
        }
    }

    private int findMax() {
        int max = 0;
        for (int val : pqPriority) {
            if (pqPriority.get(max) < val) {
                max = pqPriority.indexOf(val);
            }
        }
        return max;
    }

    public void runTests() {
        String linebreak = "--------------------";
        System.out.println(linebreak);
        System.out.println(linebreak);
        System.out.println("Initial Queue: ");
        printQueue();
        int queueSize = pq.size();
        for (int i = 0; i < queueSize; i++) {
            System.out.println(linebreak);
            System.out.println("Item to be removed: " + remove());
            System.out.println(linebreak);
            System.out.println("Current queue: ");
            printQueue();
        }
        System.out.println("Testing remove() on empty queue returns: " + remove());
    }

    public static void main(String[] args) {
        PriorityQueue<String> q = new PriorityQueue<>();
        System.out.println("Testing mixed order...");
        q.add("X", 10);
        q.add("Y", 1);
        q.add("Z", 3);
        q.runTests();
        System.out.println("Testing ascending order...");
        q.add("works", 2);
        q.add("test", 4);
        q.add("Ascending", 6);
        q.runTests();
        System.out.println("Testing descending order...");
        q.add("Descending", 10);
        q.add("test", 8);
        q.add("works", 6);
        q.runTests();
    }
}

// TEST CASE OUTPUT
// Testing mixed order...
// --------------------
// --------------------
// Initial Queue:
// Item: X, Priority: 10
// Item: Y, Priority: 1
// Item: Z, Priority: 3
// --------------------
// Item to be removed: X
// --------------------
// Current queue:
// Item: Y, Priority: 1
// Item: Z, Priority: 3
// --------------------
// Item to be removed: Z
// --------------------
// Current queue:
// Item: Y, Priority: 1
// --------------------
// Item to be removed: Y
// --------------------
// Current queue:
// Testing remove() on empty queue returns: null
// Testing ascending order...
// --------------------
// --------------------
// Initial Queue:
// Item: works, Priority: 2
// Item: test, Priority: 4
// Item: Ascending, Priority: 6
// --------------------
// Item to be removed: Ascending
// --------------------
// Current queue:
// Item: works, Priority: 2
// Item: test, Priority: 4
// --------------------
// Item to be removed: test
// --------------------
// Current queue:
// Item: works, Priority: 2
// --------------------
// Item to be removed: works
// --------------------
// Current queue:
// Testing remove() on empty queue returns: null
// Testing descending order...
// --------------------
// --------------------
// Initial Queue:
// Item: Descending, Priority: 10
// Item: test, Priority: 8
// Item: works, Priority: 6
// --------------------
// Item to be removed: Descending
// --------------------
// Current queue:
// Item: test, Priority: 8
// Item: works, Priority: 6
// --------------------
// Item to be removed: test
// --------------------
// Current queue:
// Item: works, Priority: 6
// --------------------
// Item to be removed: works
// --------------------
// Current queue:
// Testing remove() on empty queue returns: null