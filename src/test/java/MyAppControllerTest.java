package myapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyAppControllerTest {

    @Test
    public void testFunc() {
        MyAppController myApp = new MyAppController();
        myApp.index();
    }
}
