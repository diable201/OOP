package problem_3;

public abstract class Piece {
    Position pos1;
    private Position position;

    public static boolean isLegalMove(Position pos1, Position pos2) {
        if (pos1.equals(pos2))
            return false;
        else if (!pos1.isOnBorder() || !pos2.isOnBorder())
            return false;
        return true;
    }

    public boolean isLegalMove(Position pos)  {
        return Piece.isLegalMove(position, pos);
    }

}
