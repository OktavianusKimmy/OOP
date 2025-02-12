package TicTacToe;
import java.util.*;

public class TicTacToee {

	public void main() {
		int play = 1;
		int flag = 0;
		while(play == 1) {
			char[][] gameBoard = {
				{'-', '-', '-'},
				{'-', '-', '-'},
				{'-', '-', '-'}
			};
			int posX;
			int posY;
			for(int i = 0; i<10; i++) {
				int check = 0;
				do {
					printGameBoard(gameBoard);
					Scanner scan = new Scanner(System.in);
					System.out.print("Enter position: ");
					posX = scan.nextInt();
					posY = scan.nextInt();
					char simbol = '-';
					if(i%2 == 0) {
						simbol = 'O';
					}
					else {
						simbol = 'X';
					}
					check = placePiece(gameBoard, posX, posY, simbol);
					if(check == 0) {
						System.out.println("Please input another coordinate!");
					}
				} while(check == 0);
				if(checkWin(gameBoard) == 1) {
					printGameBoard(gameBoard);
					flag = 1;
					break;
				}
			}
			if(flag == 0) {
				System.out.println("TIE!");
			}
			
			Scanner scan = new Scanner(System.in);
			System.out.print("Do you want to do another game? [ 0 (NO) | 1 (YES) ]: ");
			play = scan.nextInt();
		}
	}
	
	public void printGameBoard(char[][] gameBoard) {
		for(char[] row : gameBoard) {
			for(char c : row) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
	
	public int placePiece(char[][] gameBoard, int posX, int posY, char simbol) {
		if(posX < 0 || posX > 2 || posY < 0 || posY > 2) {
			return 0;
		}
		else if(gameBoard[posX][posY] == '-') {
			gameBoard[posX][posY] = simbol;
			return 1;
		}
		else {
			return 0;
		}
		
	}
	
	public int boardFull(char[][] gameBoard) {
		for(char[] row : gameBoard) {
			for(char c : row) {
				if(!(c == 'O' || c == 'X')) {
					return 0;
				}
			}
		}
		return 1;
	}
	
	public int checkWin(char[][] gameBoard) {
		if(gameBoard[0][0] != '-' && (gameBoard[0][0] == gameBoard[0][1]) && (gameBoard[0][0]== gameBoard[0][2])) {
			String Player;
			if(gameBoard[0][0] == 'X') {
				Player = "Player 2";
			}
			else {
				Player = "Player 1";
			}
			System.out.printf(Player + " Win!");
			System.out.println();
			return 1;
		}
		else if(gameBoard[1][0] != '-' && (gameBoard[1][0] == gameBoard[1][1]) && (gameBoard[1][0]== gameBoard[1][2])) {
			String Player;
			if(gameBoard[1][0] == 'X') {
				Player = "Player 2";
			}
			else {
				Player = "Player 1";
			}
			System.out.printf(Player + " Win!");
			System.out.println();
			return 1;
		}
		else if(gameBoard[2][0] != '-' && (gameBoard[2][0] == gameBoard[2][1]) && (gameBoard[2][0]== gameBoard[2][2])) {
			String Player;
			if(gameBoard[2][0] == 'X') {
				Player = "Player 2";
			}
			else {
				Player = "Player 1";
			}
			System.out.printf(Player + " Win!");
			System.out.println();
			return 1;
		}
		else if(gameBoard[0][0] != '-' && (gameBoard[0][0] == gameBoard[1][1]) && (gameBoard[0][0]== gameBoard[2][2])) {
			String Player;
			if(gameBoard[0][0] == 'X') {
				Player = "Player 2";
			}
			else {
				Player = "Player 1";
			}
			System.out.printf(Player + " Win!");
			System.out.println();
			return 1;
		}
		else if(gameBoard[0][2] != '-' && (gameBoard[0][2] == gameBoard[1][1]) && (gameBoard[0][2]== gameBoard[2][0])) {
			String Player;
			if(gameBoard[0][2] == 'X') {
				Player = "Player 2";
			}
			else {
				Player = "Player 1";
			}
			System.out.printf(Player + " Win!");
			System.out.println();
			return 1;
		}
		else if(gameBoard[0][0] != '-' && (gameBoard[0][0] == gameBoard[1][0]) && (gameBoard[0][0]== gameBoard[2][0])) {
			String Player;
			if(gameBoard[0][0] == 'X') {
				Player = "Player 2";
			}
			else {
				Player = "Player 1";
			}
			System.out.printf(Player + " Win!");
			System.out.println();
			return 1;
		}
		else if(gameBoard[0][1] != '-' && (gameBoard[0][1] == gameBoard[1][1]) && (gameBoard[2][1]== gameBoard[0][1])) {
			String Player;
			if(gameBoard[0][1] == 'X') {
				Player = "Player 2";
			}
			else {
				Player = "Player 1";
			}
			System.out.printf(Player + " Win!");
			System.out.println();
			return 1;
		}
		else if(gameBoard[0][2] != '-' && (gameBoard[0][2] == gameBoard[1][2]) && (gameBoard[0][2]== gameBoard[2][2])) {
			String Player;
			if(gameBoard[0][2] == 'X') {
				Player = "Player 2";
			}
			else {
				Player = "Player 1";
			}
			System.out.printf(Player + " Win!");
			System.out.println();
			return 1;
		}
		else {
			return 0;
		}
	}
}