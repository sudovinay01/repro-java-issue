package repro.java.issue;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

class AppMainSourceTest {
    @Test
    void appHasAGreeting() {
        assertEquals(new App().getGreeting(), "Hello World!");
    }
}