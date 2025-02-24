import java.util.Scanner;

public class Logic {
    public void Main(){
        int play = 1;
        do{
            Board board = new Board();
            Player player1 = new Player('O');
            Player player2 = new Player('X');
            
            for(int i = 0; i<9; i++){ // Max Move
                if(i%2 == 0){
                    board.move(player1);
                }
                else{
                    board.move(player2);
                }
                board.printBoard();
                if(board.checkWin() == 1){
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Do you want to play again? 1 for yes, 0 for no");
                    play = scan.nextInt();
                    break;
                }
            }
        } while(play == 1);
    }
}
