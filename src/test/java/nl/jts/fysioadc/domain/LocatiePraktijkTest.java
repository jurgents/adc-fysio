package nl.jts.fysioadc.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


@RunWith(SpringRunner.class)
public class LocatiePraktijkTest {

    @Test
    public void testGetLocation() {
        LocatieMetPraktijk praktijk = LocatieMetPraktijk.objectFactory("F1", "W1");
        assertNotNull("praktijk mag niet leeg zijn", praktijk);
    }

}
