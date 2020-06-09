import java.util.Scanner;
import java.util.ArrayList;

public class Checkers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Board gameboard;
        //create board
        gameboard = new Board();
        System.out.println(gameboard.toString());

        System.out.println("How many players");
        String response = scanner.nextLine();
        int moveCount = 0;
        
        Player player1 = new Player(Piece.color.RED);
        //AI
        Player player2 = new Player(Piece.color.BLACK);

        while (gameboard.getStatus()){
            
            if (moveCount % 2 == 0){
                System.out.println("Player ones turn");
            }
            else{
                System.out.println("Player twos turn");
            }
            System.out.println("Insert coords to see possible moves");
            response = scanner.nextLine();
            
            String[] responseList = response.split(" ");
            int[] coords = {Integer.parseInt(responseList[0]), Integer.parseInt(responseList[1])};
            ArrayList<int[]> moves = player1.possibleMoves(gameboard, coords);

            moveCount++;
        }


        
        
        scanner.close();
    }
}