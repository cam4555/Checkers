public class Tile {
    
    int[] location;
    Piece piece;

    public Tile(int[] location, Piece piece){
        this.location = location;
        this.piece = piece;
    } 

    public Piece getPiece(){
        return piece;
    }

    public void removePiece(){
        piece = null;
    }

    @Override
    public String toString() {
        if (piece == null){
            return "X";
        }
        return piece.toString();
    }
}