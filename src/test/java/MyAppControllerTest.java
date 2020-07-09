package myapp;

import org.junit.Test;
import static org.junit.Assert.*;

class MyAppControllerTest {

    @Test
    public void testSum() {
        MyAppController myApp = new MyAppController();
        assertEquals(30, myApp.sum(10, 20));
    }
}
