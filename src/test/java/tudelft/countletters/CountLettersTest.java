package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }
    @Test
    public void WordDoesNotMatch() {
        int words = new CountLetters().count("tiger|tax|birds|cat");
        Assertions.assertEquals(4, words);
    }
    @Test
    public void OrdDoesNotMatch() {
        int words = new CountLetters().count("tax");
        Assertions.assertEquals(1, words);
    }

}