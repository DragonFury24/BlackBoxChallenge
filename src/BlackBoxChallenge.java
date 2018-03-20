import java.util.Scanner;
import java.util.stream.IntStream;

public class BlackBoxChallenge {

    static Scanner  keyType      = new Scanner(System.in);

    public static void play() {

        boolean  gameFinished = false;
        char[][] board        = new char[10][10];

        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                board[r][c] = '.';
            }
        }

        while (!gameFinished) {
            printBoard(board);

            System.out.println("Choose an option.");
            printOptions();

            switch (NumberInput.noNegIntInput(keyType)) {
                case 1:
                    shootLaser(board);
                    break;
                case 2:
                    guessMirror(board);
                    break;
                case 3:
                    System.out.println("Game over.");
                    gameFinished = true;
                    break;
                default:
                    System.out.println("Not a valid option. Again.");
                    break;
            }

            System.out.println();
        }
    }

    public static void printOptions() {
        System.out.println("(1) Shoot a LASER");
        System.out.println("(2) Guess a mirror location");
        System.out.println("(3) Quit");
    }

    public static void printBoard(char[][] board) {
        System.out.print("*");

        for (int i = 'a'; i <= 'k'; i++) {
            System.out.print(((char) i));
            System.out.print(" ");
        }

        System.out.print("*");
        System.out.println();


        //traverse board and print
        int row = 0;

        for (int i = 'k'; i <= 't'; i++) {
            System.out.print(((char) i));
            System.out.print(" ");

            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col]);
                System.out.print(" ");
            }

            System.out.print(((char) (i - 32)));
            System.out.println();
            row++;
        }

        //print last row of letters
        System.out.print("*");
        System.out.print(" ");
        for (int i = 'A'; i <= 'J'; i++) {
            System.out.print(((char) i));
            System.out.print(" ");
        }


        System.out.print("*");
        System.out.println();
    }

    public static void shootLaser(char[][] board) {

    }

    public static void guessMirror(char[][] board) {

    }

    public static void main(String[] args) {
        play();
    }
}
