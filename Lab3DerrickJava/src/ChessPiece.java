import java.util.Objects;

public abstract class ChessPiece {
    private int value;
    /*private static int pawn = 1;
    private static int knight = 2;
    private static int bishop = 3;
    private static int rook = 5;
    private static int queen = 9;
    private static int king = 1000;*/

    public ChessPiece(int value)
    {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public abstract void move();

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

        ChessPiece that = (ChessPiece) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "ChessPiece{value = " + value + "}";
    }
}