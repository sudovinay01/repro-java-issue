package repro.java.issue;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class AppTestChild extends AppTest {
    @Test
    public void childHasAGreeting() {
        assertEquals(new App().getGreeting(), "Hello World!");
    }
}