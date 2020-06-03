public class Board {
    
    Tile[][] board;

    public Board(){
        board = new Tile[8][8];

        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                if (i < 2){
                    board[i][j] = new Tile(new int[i][j], new Piece(Piece.color.RED));
                }
                else if (i > 5){
                    board[i][j] = new Tile(new int[i][j], new Piece(Piece.color.BLACK));
                }
                else{
                    board[i][j] = new Tile(new int[i][j], null);
                }
            }
        }
    }

    //false is game is over
    public boolean getStatus(){
        Piece aPiece = null;
        for ( int i = 0; i < 8; i ++){
            for (int j = 0; j < 8; j++){
                if (board[i][j].getPiece() != null 
                && aPiece == null){
                    aPiece = board[i][j].getPiece();
                }
                else if (aPiece != board[i][j].getPiece())
            }
        }
    }

    @Override
    public String toString() {
        String out = "";
        for ( int i = 0; i < 8; i ++){
            out += "\n";
            for (int j = 0; j < 8; j++){
                out += "  " + board[i][j].toString();
            }
        }
        return out;
    }

}