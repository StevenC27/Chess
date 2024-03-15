abstract class Piece {
    protected String name;
    protected Square square;
    public Piece(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }

    public void update(){
        square.setText(name);
    }
}
