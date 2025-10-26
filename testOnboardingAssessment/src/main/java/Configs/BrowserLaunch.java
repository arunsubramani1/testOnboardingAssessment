package Configs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BrowserLaunch {

    @Test
    public void testBrowserType() {
        String browser = System.getProperty("browser", "chrome");
        String url = System.getProperty("baseUrl", "https://www.google.com");

        System.out.println("Running tests on browser: " + browser);
        System.out.println("Navigating to URL: " + url);

        WebDriver driver = createDriver(browser);

        if (driver != null) {
            driver.get(url);
            System.out.println("Page title is: " + driver.getTitle());
            driver.quit();
        } else {
            System.out.println("Driver not initialized. Skipping browser actions.");
        }
    }

    private WebDriver createDriver(String browser) {
        switch (browser.toLowerCase()) {
            case "chrome":
                return new ChromeDriver();
            case "firefox":
                return new FirefoxDriver();
            case "edge":
                return new EdgeDriver();
            default:
                System.out.println("Browser not recognized. Defaulting to Chrome.");
                return new ChromeDriver();
        }
    }
}
