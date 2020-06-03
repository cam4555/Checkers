public class Player {
    
    Piece.color type;

    public Player(Piece.color type){
        this.type = type;
    }


    public Piece.color getType(){
        return type;
    }

}