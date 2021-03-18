package problem_3;

public class Knight extends Piece {
    public Knight(Position pos1) {
        this.pos1 = pos1;
    }

    public boolean isLegalMove(Position pos2) {
        return Piece.isLegalMove(this.pos1, pos2) && Knight.isLegalMove(this.pos1, pos2);
    }

    public static boolean isLegalMove(Position pos1, Position pos2) {
        if ((Math.abs(pos1.letter - pos2.letter) == 2 &&
                Math.abs(pos1.num - pos2.num) == 1) ||
                (Math.abs(pos1.letter - pos2.letter) == 1 &&
                Math.abs(pos1.num - pos2.num) == 2)) {
            return true;
        } else {
            return false;
        }
    }
}
