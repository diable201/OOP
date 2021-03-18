package problem_3;

public class Queen extends Piece {
    public Queen(Position pos1) {
        this.pos1 = pos1;
    }

    public boolean isLegalMove(Position pos2) {
        return Piece.isLegalMove(this.pos1, pos2) && Queen.isLegalMove(this.pos1, pos2);
    }

    public static boolean isLegalMove(Position pos1, Position pos2) {
        if (Rook.isLegalMove(pos1, pos2) || Bishop.isLegalMove(pos1, pos2)) {
            return true;
        } else {
            return false;
        }
    }
}
