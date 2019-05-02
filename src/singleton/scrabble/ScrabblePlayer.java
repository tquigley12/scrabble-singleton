package singleton.scrabble;

public class ScrabblePlayer {

    public void drawTile() {
        ScrabbleLetterBag tileBag = ScrabbleLetterBag.getInstance();
        String tile = tileBag.drawTile();
        System.out.println("I drew letter: " + tile);
        System.out.println(tileBag.toString());
    }
}
