package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (1 == board[i][i]) {
                if (checkHorizontal(board, i) || checkVertical(board, i)) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

    public static boolean checkHorizontal(int[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board[row].length; i++) {
            if (1 != board[row][i]) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean checkVertical(int[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (1 != board[i][column]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
