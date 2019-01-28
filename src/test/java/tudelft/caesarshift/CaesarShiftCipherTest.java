package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {

    @Test
    public void testAbcPositive(){
        CaesarShiftCipher caesarShiftCipher = new CaesarShiftCipher();
        String result = caesarShiftCipher.CaesarShiftCipher("abc",3);
        Assertions.assertEquals("def",result);
    }

    @Test
    public void testAbcNegative(){
        CaesarShiftCipher caesarShiftCipher = new CaesarShiftCipher();
        String result = caesarShiftCipher.CaesarShiftCipher("abc",-3);
        Assertions.assertEquals("xyz",result);
    }

    @Test
    public void testLastSymbols(){
        CaesarShiftCipher caesarShiftCipher = new CaesarShiftCipher();
        String result = caesarShiftCipher.CaesarShiftCipher("xyz",3);
        Assertions.assertEquals("abc",result);
    }

}
