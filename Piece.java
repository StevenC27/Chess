import javax.swing.*;

abstract class Piece {
    protected Square square;
    private ImageIcon icon;
    public Piece(String playerName, String name){
        icon = new ImageIcon("Images/"+ playerName + "_" + name + ".png");
    }

    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }

    public void update(){
        square.setIcon(icon);
    }
}
