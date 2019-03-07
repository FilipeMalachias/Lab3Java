import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        ChessPiece pawn = new Pawn();
        ChessPiece knigth = new Knight();
        ChessPiece bishop = new Bishop();
        ChessPiece rook = new Rook();
        ChessPiece queen = new Queen();
        ChessPiece king = new King();

        ArrayList <ChessPiece> pieces = new ArrayList <>();
        pieces.add(pawn);
        pieces.add(knigth);
        pieces.add(bishop);
        pieces.add(rook);
        pieces.add(queen);
        pieces.add(king);

        for (ChessPiece piece : pieces)
        {
            System.out.println(piece + ": ");
            piece.move();
        }

        ((Pawn) pawn).promote(king);

        Pawn newPawn = new Pawn();
        System.out.println(newPawn.equals(pawn));

        ((Pawn) pawn).promote(knigth);
        System.out.println(newPawn.equals(pawn));
    }
}
