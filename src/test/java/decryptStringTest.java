import cipher.decryptString;
import org.junit.*;
import static org.junit.Assert.*;


public class decryptStringTest {
    private decryptString caesar = new decryptString();
    @Test
    public void ignoreEmptyStrings(){
        assertEquals("", caesar.decrypt("", 3));
    }
    public void readSentence(){
        String sentence ="hello world";
        assertEquals(sentence, caesar.decrypt(sentence, 3));

    }
}
