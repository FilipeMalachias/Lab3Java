public class Knight extends ChessPiece {
    public Knight ()
    {
        super (2);
    }

    @Override
    public void move() {
        System.out.println("like an L");
    }

    @Override
    public String toString() {
        return "Knight {value = 2}";
    }
}
