package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class GoogleTest {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        // Make sure chromedriver.exe is in PATH or set explicitly
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testGoogleSearch() {
        driver.get("https://www.google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("TestNG with Selenium");
        searchBox.submit();

        // ✅ Assertion
        Assert.assertTrue(driver.getTitle().contains("TestNG with Selenium"),
                "Page title does not contain expected text!");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
