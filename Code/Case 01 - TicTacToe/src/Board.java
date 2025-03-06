import java.util.Scanner;

public class Board {
    public char[][] gameBoard = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };
    

    public void printBoard(){
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.print(gameBoard[i][j]);
            }
            System.out.println();
        }
    }

    public void move(Player player){
        Scanner scan = new Scanner(System.in);
		String who;
		if(player.simbol == 'O') who = "Player 1";
		else who = "Player 2";
        System.out.print(who + " move: ");
        int posX = scan.nextInt();
        int posY = scan.nextInt();
        if(posX < 0 || posX > 2 || posY < 0 || posY > 2) {
            System.out.println("Invalid position");
        }
        else if(gameBoard[posY][posX] == '-') {
            gameBoard[posY][posX] = player.simbol;
        }
        else {
            System.out.println("Position already taken");
        }
    }

    public int checkWin(){
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
