import cipher.CaesarCipher;
import org.junit.*;
import static org.junit.Assert.*;



public class CaesarCipherTest {
    private CaesarCipher caesar = new CaesarCipher();
    @Test
    public void ignoreEmptyStrings(){
        assertEquals("", caesar.encrypt("", 3));
    }
    public void readSentence(){
        String sentence ="hello world";
        assertEquals(sentence, caesar.encrypt(sentence, 3));

    }


}
