
package com.Tictac;

import java.util.*;

public class TicTacToeGame {

	private static char[] createBoard() // Createboard-UC1
	{
		char board[] = new char[10];
		for (int i = 0; i < board.length; i++) {
			board[i] = ' ';
		}
		return board;
	}

	private static char[] playerInput() // Createboard-UC2
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose Either X OR O");
		char input = sc.next().charAt(0);
		char userInput = ' ';
		char computerInput = ' ';

		if (input == 'X') {
			userInput = input;
			computerInput = '0';
		} else if (input == 'O') {
			userInput = input;
			computerInput = 'X';
		}

		char[] output = { userInput, computerInput };
		return output;
	}

	private void showBoard(char[] board) {
		System.out.println("Output:");
		for (int i = 0; i < board.length; i++) {
			System.out.println("[" + board[i] + "]");
		}

	}
	
	public static void main(String args[]) {
		char[] board = createBoard();
		TicTacToeGame sample = new TicTacToeGame();
		System.out.println("Enter your mark");
		char[] storing = sample.playerInput();
		sample.showBoard(board);

	}
}
