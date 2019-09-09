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
    private CaesarCipher cipher = new CaesarCipher();
    @Test
    public void ignoreEmptyString(){
        assertEquals("", cipher.decrypt("", 3));
    }
    public void ignoreSymbol(){
        assertEquals("-", cipher.decrypt("-", 3));
        String symbols ="1!@#$%^&*(){}/";
        assertEquals(symbols, cipher.decrypt(symbols, 3));

    }

}
