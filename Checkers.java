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

        if (response == "2"){
            Player playerR = new Player(Piece.color.RED);
            Player playerB = new Player(Piece.color.BLACK);
        }

        while (gameboard.getStatus()){

        }


        
        
        scanner.close();
    }
}