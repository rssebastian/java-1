public class Handshake {
    public static int handshake(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return (n - 1) + handshake(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(handshake(3));
        System.out.println(handshake(4));
        System.out.println(handshake(5));
        System.out.println(handshake(10));
    }
}

// TEST CASE OUTPUT
// 3
// 6
// 10
// 45