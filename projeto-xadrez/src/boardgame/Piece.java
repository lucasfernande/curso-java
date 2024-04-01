package boardgame;

public class Piece {
    protected Position position;
    private Board board;

    public Piece() {}

    public Piece(Board board) {
        this.board = board; // o position inicial de uma peça será nula
    }

    protected Board getBoard() {
        return board;
    }
}
