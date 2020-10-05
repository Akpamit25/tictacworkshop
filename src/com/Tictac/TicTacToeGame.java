package com.Tictac;
import java.util.*;

public class TicTacToeGame {

	char[][]board = new char [3][3];
	public void display()
	{
		System.out.println("Board Created"); //printing on the console
	}
	
	
public static void main (String args[])
{
	TicTacToeGame tictacobj = new TicTacToeGame();
	tictacobj.display();
}
}
