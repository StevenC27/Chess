import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Chess {
    private final JPanel board;
    private final Square[][] squares = new Square[8][8];
    private Player player;
    private final Player w;
    private final Player b;

    public Chess(){
        JFrame window = new JFrame("Chess");
        window.setSize(800,800);
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        board = new JPanel(new GridLayout(8,8,5,5));
        board.setBackground(Color.BLACK);
        board.setSize(845,845);
        window.add(board);

        w = new Player("w", true);
        b = new Player("b", false);
        player = w;

        initializeSquares();
        initializePawns(1);
        initializeSpecialPieces(0);

        swapTurn();
        initializePawns(6);
        initializeSpecialPieces(7);


        window.setVisible(true);
        board.setVisible(true);
    }

    public void swapTurn(){
        if(w.isTurn()){
            w.setTurn(false);
            b.setTurn(true);
            player = b;
        }else{
            b.setTurn(false);
            w.setTurn(true);
            player = w;
        }
    }

    public void initializeSquares(){
        Color light = new Color(232, 235, 239);
        Color dark = new Color(125, 135, 150);
        Color colour;
        for(int i = 7; i >=0; i--){
            for(int j = 0; j <= 7; j++){
                if((i%2 == 0) && (j%2 == 0) || (i%2 == 1) && (j%2 == 1)){
                    colour = light;
                }else{
                    colour = dark;
                }
                squares[i][j] = new Square(i,j,colour);
                Square square = squares[i][j];
                board.add(square);
            }
        }
    }

    public void initializePawns(int row){
        Pawn[] pawns = player.getPawns();
        for(int i = 0; i <= 7; i++){
            pawns[i].setSquare(squares[row][i]);
            pawns[i].update();
        }
    }

    public void initializeSpecialPieces(int row){
        Rook[] rooks = player.getRooks();
        rooks[0].setSquare(squares[row][0]);
        rooks[1].setSquare(squares[row][7]);
        rooks[0].update();
        rooks[1].update();

        Knight[] knights = player.getKnights();
        knights[0].setSquare(squares[row][1]);
        knights[1].setSquare(squares[row][6]);
        knights[0].update();
        knights[1].update();

        Bishop[] bishops = player.getBishops();
        bishops[0].setSquare(squares[row][2]);
        bishops[1].setSquare(squares[row][5]);
        bishops[0].update();
        bishops[1].update();

        player.getQueen().setSquare(squares[row][3]);
        player.getQueen().update();
        player.getKing().setSquare(squares[row][4]);
        player.getKing().update();

    }
}
