public class Player {
    private String name;
    private Square selected;
    private boolean chosen;
    private boolean turn;
    private Pawn[] pawns = new Pawn[8];
    private Rook[] rooks = new Rook[2];
    private Knight[] knights = new Knight[2];
    private Bishop[] bishops = new Bishop[2];
    private Queen queen;
    private King king;
    public Player(String name, boolean turn){
        this.name = name;
        this.turn = turn;

        createPieces();
    }
    public Square getSelected() {
        return selected;
    }
    public void setSelected(Square square){
        selected = square;
    }
    public boolean isChosen() {
        return chosen;
    }
    public void setChosen(boolean value){
        chosen = value;
    }
    public void setTurn(boolean turn) {
        this.turn = turn;
    }
    public boolean isTurn() {
        return turn;
    }

    public void createPieces(){
        for(int i = 0; i< pawns.length; i++){
            pawns[i] = new Pawn(name, "pawn");
        }
        rooks[0] = new Rook(name, "rook");
        rooks[1] = new Rook(name, "rook");
        knights[0] = new Knight(name, "knight");
        knights[1] = new Knight(name, "knight");
        bishops[0] = new Bishop(name, "bishop");
        bishops[1] = new Bishop(name, "bishop");
        queen = new Queen(name, "queen");
        king = new King(name, "king");
    }

    public Pawn[] getPawns() {
        return pawns;
    }

    public Rook[] getRooks(){
        return rooks;
    }

    public Knight[] getKnights() {
        return knights;
    }

    public Bishop[] getBishops() {
        return bishops;
    }

    public Queen getQueen() {
        return queen;
    }

    public King getKing() {
        return king;
    }
}
