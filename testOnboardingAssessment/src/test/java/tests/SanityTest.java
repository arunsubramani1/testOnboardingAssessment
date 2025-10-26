package tests;

import org.testng.annotations.Test;

public class SanityTest {
    @Test
    public void testSanity() {
        System.out.println("SanityTest running");
        System.out.println("Browser: " + System.getProperty("browser"));
        System.out.println("Base URL: " + System.getProperty("baseUrl"));
        //email verification
    }
}