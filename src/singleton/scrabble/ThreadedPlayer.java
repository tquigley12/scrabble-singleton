package singleton.scrabble;

public class ThreadedPlayer extends Thread {

    public void drawTile() {
        start();
    }

    @Override
    public void run() {
//        ScrabbleLetterBag tileBag = ScrabbleLetterBag.getInstance();
//        ScrabbleLetterBagEarly tileBag = ScrabbleLetterBagEarly.getInstance();
        ScrabbleLetterBagEnum tileBag = ScrabbleLetterBagEnum.INSTANCE;
        String tile = tileBag.drawTile();
        System.out.println("I drew letter: " + tile);
        System.out.println(tileBag.toString());
    }
}
