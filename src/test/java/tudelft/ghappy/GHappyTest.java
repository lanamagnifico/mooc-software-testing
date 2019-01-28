package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    @Test
    public void testHappy(){
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy("xggy");
        Assertions.assertEquals(result, true);
    }

    @Test
    public void testUnhappy(){
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy("xgy");
        Assertions.assertEquals(result, false);
    }

    @Test
    public void testUnhappyCombi(){
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy("xgqyaag");
        Assertions.assertEquals(result, false);
    }

    @Test
    public void testOnlyG(){
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy("gg");
        Assertions.assertEquals(result, true);
    }
}
