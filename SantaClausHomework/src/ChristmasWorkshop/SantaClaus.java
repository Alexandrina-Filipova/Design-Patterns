package ChristmasWorkshop;

import ChristmasWorkshop.MagicBoard.Board;

public class SantaClaus {

    private static SantaClaus instance;
    private Board board = new Board();

    private SantaClaus(){}

    public static SantaClaus getInstance(){
        return instance;
    }

    public void writeMagicBoard(String modelToys){
        this.board.placeMagicWords();
    }






}
