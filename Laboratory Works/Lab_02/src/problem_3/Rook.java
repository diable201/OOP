package problem_3;

public class Rook extends Piece {
    public Rook(Position pos1) {
        this.pos1 = pos1;
    }

    public boolean isLegalMove(Position pos2) {
        return Piece.isLegalMove(this.pos1, pos2) && Rook.isLegalMove(this.pos1, pos2);
    }

    public static boolean isLegalMove(Position pos1, Position pos2) {
        if (pos1.letter == pos2.letter || pos1.num == pos2.num) {
            return true;
        } else {
            return false;
        }
    }
}
