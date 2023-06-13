/*Sudoku Solver
Write a program to solve a Sudoku puzzle by filling the empty cells.

Sudoku rules:

Each of the digits 1-9 must occur exactly once in each row.
Each of the digits 1-9 must occur exactly once in each column.
Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.
The '.' character indicates empty cells.
Input Format
Input consists of 9 rows:

In each row, there are 9 spaced characters representing the number at that position of the board

Output Format
You just have to complete the function, the compiler will print correct if your result is valid else it prints incorrect.

Example 1
Input

. 6 9 1 2 . . 8 3 
. 5 . 3 6 7 2 . 9
3 . 2 5 8 . 6 1 7
1 2 5 9 . 3 8 . 6
. 3 . 8 1 . 9 2 4
4 9 . 2 7 6 3 5 1
. 1 . 6 9 8 7 3 5
9 . . 4 . . 1 6 8
5 8 6 7 3 1 4 9 2
Output

correct
correct
7 6 9 1 2 4 5 8 3 
8 5 1 3 6 7 2 4 9 
3 4 2 5 8 9 6 1 7 
1 2 5 9 4 3 8 7 6 
6 3 7 8 1 5 9 2 4 
4 9 8 2 7 6 3 5 1 
2 1 4 6 9 8 7 3 5 
9 7 3 4 5 2 1 6 8 
5 8 6 7 3 1 4 9 2 */  

import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[][] board = new char[9][9];
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        board[i][j] = sc.next().charAt(0);
      }
    }
    sc.close();
    Solution ob = new Solution();
    if (ob.solveSudoku(board)) {
      System.out.println("correct");
      // printBoard(board);
    } else {
      System.out.println("incorrect");
    }
  }

  public static void printBoard(char[][] board) {
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }
}

class Solution {
  public boolean solveSudoku(char[][] board) {
    return solve(board);
  }

  public boolean solve(char[][] board) {
    for (int row = 0; row < 9; row++) {
      for (int col = 0; col < 9; col++) {
        if (board[row][col] == '.') {
          for (char num = '1'; num <= '9'; num++) {
            if (isValid(board, row, col, num)) {
              board[row][col] = num;
              if (solve(board)) {
                return true;
              } else {
                board[row][col] = '.';
              }
            }
          }
          return false;
        }
      }
    }
    return true;
  }

  public boolean isValid(char[][] board, int row, int col, char num) {
    for (int i = 0; i < 9; i++) {
      if (board[row][i] == num) {
        return false;
      }
      if (board[i][col] == num) {
        return false;
      }
      if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == num) {
        return false;
      }
    }
    return true;
  }
}
