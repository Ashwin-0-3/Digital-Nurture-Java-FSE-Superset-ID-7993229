import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestAssertions {
    @Test
    void testAssert()
    {
        assertEquals(5,3+2);
        assertNotEquals(4,1+2);
        assertTrue(5>3);
        assertFalse(3>5);
        assertNull(null);
        assertNotNull(new Object());
    }
}
