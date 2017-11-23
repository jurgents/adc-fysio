package nl.jts.fysioadc.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
public class PraktijkTest {

    @Test
    public void testGetLocation() {
        Praktijk praktijk = Praktijk.objectFactory("F1", "W1", "S1", "12");
        assertEquals("ergens", praktijk.getLocation());
    }

}
