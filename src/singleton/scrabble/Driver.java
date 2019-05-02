package singleton.scrabble;

public class Driver {

    public static void main(String[] args) {
        //System.out.println("Welcome to " + ScrabbleLetterBagEarly.getName());

//        System.out.println("Creating players");
//        ScrabblePlayer player1 = new ScrabblePlayer();
//        ScrabblePlayer player2 = new ScrabblePlayer();
//
//        System.out.println("Players drawing tiles");
//        player1.drawTile();
//        player2.drawTile();
        System.out.println("Creating threaded players");
        ThreadedPlayer player3 = new ThreadedPlayer();
        ThreadedPlayer player4 = new ThreadedPlayer();

        System.out.println("Threaded players drawing tiles");
        player3.drawTile();
        player4.drawTile();

    }
}
