import java.util.Scanner;

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
            int[][] coords = new int[Integer.parseInt(responseList[0])][Integer.parseInt(responseList[1])];
            System.out.println(player1.possibleMoves(gameboard, coords));
        }


        
        
        scanner.close();
    }
}