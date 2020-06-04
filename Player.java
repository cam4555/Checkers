import java.util.ArrayList;

public class Player {
    
    Piece.color type;

    public Player(Piece.color type){
        this.type = type;
    }


    public Piece.color getType(){
        return type;
    }

    public ArrayList<int[][]> possibleMoves(Board board, int[][] coords){
        ArrayList<int[][]> moveList = new ArrayList<>();
        //todo
        if (board.tileAtCoord(board, coords))
        return moveList;
    }

}