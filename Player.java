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

    public boolean moveInBounds(int[] move){
        if (move[0] >= 0 && move[0] < 8 && move[1] >= 0 && move[1] < 8){
            return true;
        }
        return false;

    }

    public ArrayList<int[]> possibleMoves(Board board, int[] coords){
        ArrayList<int[]> moveList = new ArrayList<>();
        //todo
        if (board.tileAtCoord(coords) != null && moveInBounds(coords) && board.tileAtCoord(coords).getPiece().getColor() == this.type){
            if (moveInBounds(new int[] {coords[0] + UPRIGHT[0], coords[1] + UPRIGHT[1]})){
                moveList.add(new int[] {coords[0] + UPRIGHT[0], coords[1] + UPRIGHT[1]});
            }
            else if (moveInBounds(new int[] {coords[0] + UPLEFT[0], coords[1] + UPLEFT[1]})){
                moveList.add(new int[] {coords[0] + UPLEFT[0], coords[1] + UPLEFT[1]});
                System.out.println("possible moes upleft");
            }
            else if (moveInBounds(new int[] {coords[0] + DOWNRIGHT[0], coords[1] + DOWNRIGHT[1]})){
                moveList.add(new int[] {coords[0] + DOWNRIGHT[0], coords[1] + DOWNRIGHT[1]});
            }
            else if (moveInBounds(new int[] {coords[0] + DOWNLEFT[0], coords[1] + DOWNLEFT[1]})){
                moveList.add(new int[] {coords[0] + DOWNLEFT[0], coords[1] + DOWNLEFT[1]});
            }
        }
        return moveList;
    }

}