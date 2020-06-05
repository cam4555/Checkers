import java.util.ArrayList;

public class Player {
    
    Piece.color type;

    final int[] UPRIGHT = {1, 1};
    final int[] UPLEFT = {1, -1};
    final int[] DOWNRIGHT = {-1, 1};
    final int[] DOWNLEFT = {-1, -1};


    public Player(Piece.color type){
        this.type = type;
    }


    public Piece.color getType(){
        return type;
    }

    public boolean moveInBounds(int[][] move){
        if (move.length >= 0 && move.length < 8 && move[0].length >= 0 && move[0].length < 8){
            return true;
        }
        return false;

    }

    public ArrayList<int[][]> possibleMoves(Board board, int[][] coords){
        ArrayList<int[][]> moveList = new ArrayList<>();
        //todo
        if (board.tileAtCoord(coords) != null && board.tileAtCoord(coords).getPiece().getColor() != this.type){
            if (moveInBounds(new int[coords.length + UPRIGHT.length][coords[0].length + UPRIGHT[0].length])){
                moveList.add(new int[coords.length + UPRIGHT.length][coords[0].length + UPRIGHT[0].length]);
            }
            else if (moveInBounds(new int[coords.length + UPLEFT.length][coords[0].length + UPLEFT[0].length])){
                moveList.add(new int[coords.length + UPLEFT.length][coords[0].length + UPLEFT[0].length]);
            }
            else if (moveInBounds(new int[coords.length + DOWNRIGHT.length][coords[0].length + DOWNRIGHT[0].length])){
                moveList.add(new int[coords.length + DOWNRIGHT.length][coords[0].length + DOWNRIGHT[0].length]);
            }
            else if (moveInBounds(new int[coords.length + DOWNLEFT.length][coords[0].length + DOWNLEFT[0].length])){
                moveList.add(new int[coords.length + DOWNLEFT.length][coords[0].length + DOWNLEFT[0].length]);
            }
        }
        return moveList;
    }

}