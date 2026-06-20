import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator c;
    @BeforeEach
    public void func()
    {
         c = new Calculator();
        System.out.println("Calculator initialized");
    }
    @AfterEach
    public void func1()
    {
        c=null;
        System.out.println("Calculator ended");
    }
    @Test
    void testaddi()
    {
        int ans=c.add(2,3);
        assertEquals(5,ans);
    }
    @Test
    void testsub()
    {
        int ans=c.sub(10,3);
        assertEquals(7,ans);
    }
}