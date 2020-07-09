package myapp;

import org.junit.Test;
import static org.junit.Assert.*;

class MyAppControllerTest {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        assertEquals(30, calculator.sum(10, 20));
    }
}
