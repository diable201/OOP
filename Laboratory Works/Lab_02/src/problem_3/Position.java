package problem_3;

public class Position {
    public int letter;
    public int num;

    public Position(int letter, int num) {
        this.letter = letter;
        this.num = num;
    }
    
    public Position(char letter, char num) {
        this.letter = (int) letter - 96;
        this.num = (int) num - 48;
        if (this.letter < 1 || this.letter > 8 || this.num < 1 || this.num > 8) {
            System.out.println("Out of border");
        }
    }

    public boolean isOnBorder() {
        if (letter < 1 || letter > 8) return false;
        else if (num < 1 || num > 8) return false;
        return true;
    }
}
