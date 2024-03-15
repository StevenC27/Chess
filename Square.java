import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Square extends JButton{
    private int row;
    private int column;
    private Piece piece;
    public Square(int row, int column, Color colour){
        setSize(100,100);
        setBackground(colour);
        setFont(getFont().deriveFont(Font.BOLD, 10));

        setVisible(true);
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
        setText(piece.getName());
    }
}
