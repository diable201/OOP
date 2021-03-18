package problem_3;

public class Bishop extends Piece {
    public Bishop(Position pos1) {
        this.pos1 = pos1;
    }

    public boolean isLegalMove(Position pos2) {
        return Piece.isLegalMove(this.pos1, pos2) && Bishop.isLegalMove(this.pos1, pos2);
    }

    public static boolean isLegalMove(Position pos1, Position pos2) {
        boolean case1 = (pos1.letter + pos2.letter == pos1.num + pos2.num);
        boolean case2 = (pos1.letter - pos2.letter == pos1.num - pos2.num);
        if (case1 || case2) {
            return true;
        } else {
            return false;
        }
    }
}
