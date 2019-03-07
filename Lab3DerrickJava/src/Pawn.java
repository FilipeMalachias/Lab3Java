import java.util.Objects;

public class Pawn extends ChessPiece {
    private boolean hasBennPromoted;
    private ChessPiece newPiece;

    public Pawn ()
    {
        super (1);
        this.hasBennPromoted = false;
    }

    @Override
    public void move() {
        System.out.println("forward 1");
    }

    public void promote (ChessPiece newPiece)
    {
        if (hasBennPromoted == true) {
            System.out.println("Already been promoted!");
            return;
        }
        if (newPiece.getValue() == 1000 || newPiece.getValue() == 1) {
            System.out.println("Invalid promotion!");
            System.out.println("You cannot promote to a King or Pawn.");
            return;
        }
        this.newPiece = newPiece;
        hasBennPromoted = true;
        System.out.println("Promoted to " + newPiece + "!");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        if (super.equals(o))
        {
            return false;
        }
        Pawn pawn = (Pawn) o;
        return hasBennPromoted == pawn.hasBennPromoted && Objects.equals(newPiece, pawn.newPiece);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }

    @Override
    public String toString() {
        return "Pawn {" + "has been promoted" + hasBennPromoted + " to new Piece =  " + newPiece + "}";
    }
}
