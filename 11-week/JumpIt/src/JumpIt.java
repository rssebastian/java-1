import java.util.Arrays;

public class JumpIt {
    public static int jumpIt(int[] board) {
        if (board.length == 1) {
            return board[0];
        } else if (board.length == 2) {
            return board[0] + board[1];
        } else if (board.length == 3) {
            return board[0] + board[2];
        } else {
            int[] adjMove = Arrays.copyOfRange(board, 1, board.length);
            int[] jumpMove = Arrays.copyOfRange(board, 2, board.length);
            if (jumpIt(adjMove) <= jumpIt(jumpMove)) {
                return board[0] + jumpIt(adjMove);
            } else {
                return board[0] + jumpIt(jumpMove);
            }
        }
    }

    public static void main(String[] args) {
        int[] board1 = { 0, 3, 80, 6, 59, 10 };
        System.out.println(jumpIt(board1));
        int[] board2 = { 0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        System.out.println(jumpIt(board2));
        int[] board3 = { 0, 2, 8, 7, 6, 4, 3, 5, 1, 9 };
        System.out.println(jumpIt(board3));
        int[] board4 = { 0, 3, 7, 1, 3, 2, 8, 0, 4 };
        System.out.println(jumpIt(board4));
        int[] board5 = { 0, 1, 4, 7, 4, 5 };
        System.out.println(jumpIt(board5));
    }
}

// TEST CASE OUTPUT
// 19
// 300
// 26
// 10
// 13