import org.junit.*;
import static org.junit.Assert.*;



public class CaesarCipherTest {
    private CaesarCipher caesar = new CaesarCipher();
    @Test
    public void ignoreEmptyStrings(){
        assertEquals("", caesar.encrypt("", 3));
    }
    public void ignoreSymbols(){
        assertEquals("-", caesar.encrypt("-", 3));
        String symbols ="1!@#$%^&*(){}/";
        assertEquals(symbols, caesar.encrypt(symbols, 3));

    }

}
