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
                        board[i][j] = new Tile(new int[] {i, j}, new Piece(Piece.color.RED));
                    }
                    else if (i > 4){
                        board[i][j] = new Tile(new int[] {i, j}, new Piece(Piece.color.BLACK));
                    }
                    else{
                        board[i][j] = new Tile(new int[] {i, j}, null);
                    }
                }
                else{
                    board[i][j] = null;
                }
            }
        }
    }

    public Tile tileAtCoord(int[] coord){
        return board[coord[0]][coord[1]];
    }

    public void movePiece(int[] piece, int[] destination){
        Piece temp = board[piece[0]][piece[1]].getPiece();
        removePiece(piece);
        board[destination[0]][destination[1]].addPiece(temp);;
    }

    public void removePiece(int[] piece){
        board[piece[0]][piece[1]].removePiece();;
    }

    //false is game is over
    public boolean getStatus(){
        Piece aPiece = null;
        for ( int i = 0; i < 8; i ++){
            for (int j = 0; j < 8; j++){
                if (board[i][j] != null && board[i][j].hasPiece()){
                    if (aPiece == null){
                        aPiece = board[i][j].getPiece();
                    }
                    else if (aPiece.getColor() != board[i][j].getPiece().getColor()){
                        return true;
                    }
                }
                
            }
        }
        return false;
    }

    @Override
    public String toString() {
        int count = 0;
        String out = "   0  1  2  3  4  5  6  7";
        for ( int i = 0; i < 8; i ++){
            out += "\n" + Integer.toString(count++);
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