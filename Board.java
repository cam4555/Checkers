public class Board {
    
    Tile[][] board;

    public Board(){
        board = new Tile[8][8];
        // X is playable space, O is not
        //i row, j col
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                if (( i % 2 != 0 && j % 2 == 0) || (i % 2 == 0 && j % 2 != 0)){

                    if (i < 3){
                        board[i][j] = new Tile(new int[i][j], new Piece(Piece.color.RED));
                    }
                    else if (i > 4){
                        board[i][j] = new Tile(new int[i][j], new Piece(Piece.color.BLACK));
                    }
                    else{
                        board[i][j] = new Tile(new int[i][j], null);
                    }
                }
                else{
                    board[i][j] = null;
                }
            }
        }
    }

    public Tile tileAtCoord(int[][] coord){
        return board[coord.length][coord[0].length];
    }

    public void movePiece(int[][] piece, int[][] destination){
        
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
                else if (aPiece != board[i][j].getPiece()){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String out = "";
        for ( int i = 0; i < 8; i ++){
            out += "\n";
            for (int j = 0; j < 8; j++){
                if (board[i][j] == null)
                    out += "   ";
                else
                    out += "  " + board[i][j].toString();
            }
        }
        return out;
    }

}