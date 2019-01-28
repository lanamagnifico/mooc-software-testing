package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MirrorTest {

    @Test
    public void mirrorAbXYZ(){
        Mirror mirror = new Mirror();
        String abXYZba = mirror.mirrorEnds("abXYZba");
        Assertions.assertEquals("ab",abXYZba);
    }

    @Test
    public void testA(){
        Mirror mirror = new Mirror();
        String a = mirror.mirrorEnds("abca");
        Assertions.assertEquals("a",a);
    }
}
