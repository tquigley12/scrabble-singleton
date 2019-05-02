package singleton.scrabble;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ScrabbleLetterBag {

    private static ScrabbleLetterBag instance = null;

    private List<String> tiles;

    private ScrabbleLetterBag() {
        try {
            // Simulate a long-running constructor, maybe a network or database call?
            Thread.currentThread().sleep(1500);
        } catch (InterruptedException ex) {
        }
        String[] scrabbleLetters = {"a", "a", "a", "a", "a", "a", "a", "a", "a",
            "b", "b", "c", "c", "d", "d", "d", "d", "e", "e", "e", "e", "e",
            "e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h",
            "h", "i", "i", "i", "i", "i", "i", "i", "i", "i", "j", "k", "l",
            "l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "n", "o", "o",
            "o", "o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r", "r",
            "r", "r", "s", "s", "s", "s", "t", "t", "t", "t", "t", "t", "u",
            "u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z"};

        tiles = new ArrayList<>(Arrays.asList(scrabbleLetters));

        Collections.shuffle(tiles);
    }

    public String drawTile() {
        return tiles.remove(0);
    }

    @Override
    public String toString() {
        return "Bag ID " + this.hashCode() + " contains " + tiles.size();
    }

    public static ScrabbleLetterBag getInstance() {
        if (instance == null) {
            instance = new ScrabbleLetterBag();
        }

        return instance;
    }
}
