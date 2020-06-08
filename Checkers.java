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

        
        Player player1 = new Player(Piece.color.RED);
        Player player2 = new Player(Piece.color.BLACK);

        while (gameboard.getStatus()){
            System.out.println("Insert coords to see possible moves");
            response = scanner.nextLine();
            
            String[] responseList = response.split(" ");
            int[] coords = {Integer.parseInt(responseList[0]), Integer.parseInt(responseList[1])};
            ArrayList<int[]> moves = player1.possibleMoves(gameboard, coords);

            for (int i = 0; i < moves.size(); i++){
                System.out.println("\n");
                for (int j = 0; j < moves.get(i).length; j++){
                    System.out.print(moves.get(i)[j]);
                }
                System.out.println("\n");
            }
        }


        
        
        scanner.close();
    }
}