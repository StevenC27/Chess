import javax.swing.*;
import java.awt.*;

public class Chess {
    private JFrame window;
    private JPanel board;
    private Square[][] squares = new Square[8][8];

    public Chess(){
        window = new JFrame("Chess");
        window.setSize(800,800);
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        board = new JPanel(new GridLayout(8,8,5,5));
        board.setBackground(Color.BLACK);
        board.setSize(845,845);
        window.add(board);

        Color light = new Color(232, 235, 239);
        Color dark = new Color(125, 135, 150);
        for(int i = 7; i >=0; i--){
            for(int j = 0; j <= 7; j++){
                if((i%2 == 0) && (j%2 == 0) || (i%2 == 1) && (j%2 == 1)){
                    squares[i][j] = new Square(light);
                }else{
                    squares[i][j] = new Square(dark);
                }
                board.add(squares[i][j]);
            }
        }

        window.setVisible(true);
        board.setVisible(true);
    }
}
