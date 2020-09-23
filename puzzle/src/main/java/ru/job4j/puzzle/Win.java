package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        int rowCount = 0;
        int cellCount = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1){
                for (int j = 0; j < board.length; j++) {
                    if (board[i][j] == 1) {
                        rowCount++;
                    }
                    if (board[j][i] == 1) {
                        cellCount++;
                    }
                }
            }
        }
        if (rowCount == board.length || cellCount == board.length) {
            rsl = true;
        }
        return rsl;
    }
}
