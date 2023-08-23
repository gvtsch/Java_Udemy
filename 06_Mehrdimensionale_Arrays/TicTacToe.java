import java.util.Arrays;

public class TicTacToe {
    public static void main(String[] args) {
        int[][] game = {
            {1, 2, 1},
            {2, 1, 2},
            {1, 1, 2}
        };

        int playerWon = 0;
        for (int x = 0; x < 3; x++) {
            if (game[x][0] != 0 && game[x][0] == game[x][1] && game[x][0] == game[x][2]) {
                playerWon = game[x][0];
            }
        }

        for (int x = 0; x < 3; x++) {
            if (game[x][0] != 0 && game[0][x] == game[1][x] && game[0][x] == game[2][x]) {
                playerWon = game[x][0];
            }
        }

        if (game[0][0] != 0 && game[0][0] == game[1][1] && game[0][0] == game[2][2]) {
            playerWon = game[0][0];
        }

        if (game[0][2] != 0 && game[0][2] == game[1][1] && game[0][2] == game[2][0]) {
            playerWon = game[0][0];
        }

        System.out.println(playerWon);
    }
}
