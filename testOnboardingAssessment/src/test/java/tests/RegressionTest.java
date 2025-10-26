package tests;

import org.testng.annotations.Test;

public class RegressionTest {
    @Test
    public void testRegression() {
        System.out.println("RegressionTest running");
        System.out.println("Browser: " + System.getProperty("browser"));
        System.out.println("Base URL: " + System.getProperty("baseUrl"));
    }
}