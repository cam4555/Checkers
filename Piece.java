public class Piece {
    
    //black and false is AI
    enum color{
        RED,
        BLACK
    }

    color pieceColor;

    public Piece(Piece.color pieceColor){
        this.pieceColor = pieceColor;
    }        

    public Piece.color getColor(){
        return pieceColor;
    }

    @Override
    public String toString() {
        if (pieceColor == color.RED){
            return "R";
        }
        return "B";
    }
}