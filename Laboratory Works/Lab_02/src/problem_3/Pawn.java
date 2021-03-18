package problem_3;

public class Pawn extends Piece {
    public Pawn(Position pos1) {
        this.pos1 = pos1;
    }

    public boolean isLegalMove(Position pos2) {
        return Piece.isLegalMove(this.pos1, pos2) && Pawn.isLegalMove(this.pos1, pos2);
    }

    public static boolean isLegalMove(Position pos1, Position pos2) {
        if (pos1.letter == pos2.letter) {
            if ((pos2.num - pos1.num == 2 && pos1.num == 2) || (pos2.num - pos1.num == 1)) {
                return true;
            }
        }
        return false;
    }
}
