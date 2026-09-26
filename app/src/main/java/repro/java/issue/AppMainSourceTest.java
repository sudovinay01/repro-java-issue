package repro.java.issue;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class AppMainSourceTest {
    @Test
    public void appHasAGreeting() {
        assertEquals(new App().getGreeting(), "Hello World!");
    }
}