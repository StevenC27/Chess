public class Player {
    private String name;
    private Square selected;
    private boolean chosen;
    private boolean turn;
    private Pawn[] pawns = new Pawn[8];
    private Piece[] rooks = new Piece[2];
    private Piece[] knights = new Piece[2];
    private Piece[] bishops = new Piece[2];
    private Piece queen;
    private Piece king;
    public Player(String name, boolean turn){
        this.name = name;
        this.turn = turn;

        for(int i = 0; i< pawns.length; i++){
            pawns[i] = new Pawn("<html>"+ name + "<br> Pawn</html>");
        }
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
    public Piece[] getPawns() {
        return pawns;
    }
}
