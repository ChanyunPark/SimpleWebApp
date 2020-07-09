package myapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class MyAppControllerTest {

    @Test
    @RequestMapping("/")
    public String index() {
        return "index.html";
    }
}
