package homework_7.src.test.java.mailru.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

abstract public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.out.println("Set up Test Method");
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--no-sandbox", "start-maximized", "--headless");
        this.driver = new ChromeDriver(chromeOptions);
    }

    @AfterMethod
    public void tearDownTestSuite() {
        System.out.println("Tear down Test Method");
        this.driver.quit();
    }

}
