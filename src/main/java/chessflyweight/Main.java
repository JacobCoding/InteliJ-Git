package chessflyweight;

public class Main {

    public static void main(String[] args) {

        ChessPiece blackQueen = new BlackQueen("Black Queen" );
        ChessPiece whiteQueen = new WhiteQueen("White Queen" );
        WhitePawn whitePawn = new WhitePawn("White Pawn", "2","a", "white");
        BlackPawn blackPawn = new BlackPawn("Black Pawn", "7","a", "blAck");

        System.out.println(blackPawn.getColor() == blackQueen.getColor());
        System.out.println(whitePawn.getColor() == whiteQueen.getColor());


    }




}
