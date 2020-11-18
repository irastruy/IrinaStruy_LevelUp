package homework_6.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

public abstract class BaseTest {

    protected WebDriver driver;
    protected WebDriverWait webDriverWait;

    private String login = "istrui";
    private String password = "javacourse2020";
    private String fullLogin = "istrui@mail.ru";

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

    public void loginMail() {
        webDriverWait = new WebDriverWait(driver, 10);

        driver.get("https://mail.ru/");
        driver.findElement(By.xpath("//*[@id='mailbox:login-input']")).sendKeys(login);

        WebElement submitLogin = driver.findElement(By.xpath("//*[@id='mailbox:submit-button']"));
        submitLogin.click();

        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#mailbox [type=password]"))).sendKeys(password);
        WebElement submitPasssword = driver.findElement(By.xpath("//*[@id='mailbox:submit-button']"));
        submitPasssword.click();
    }

    public void createEmail(String textBody, String theme, String address) {
        webDriverWait.until(ExpectedConditions.elementToBeClickable((By.cssSelector(".compose-button")))).click();
        webDriverWait.until(ExpectedConditions.elementToBeClickable((By.cssSelector("[data-name=to] input")))).sendKeys(address);
        webDriverWait.until(ExpectedConditions.elementToBeClickable((By.cssSelector("input[name=Subject]")))).sendKeys(theme);
        webDriverWait.until(ExpectedConditions.elementToBeClickable((By.cssSelector("div[role=textbox] div")))).sendKeys(textBody);
    }

    public void saveAndCloseEmail() {
        driver.findElement(By.cssSelector("span[title=Сохранить]")).click();
        driver.findElement(By.cssSelector("button[title=Закрыть]")).click();
    }

    public void sendLetter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[title=Отправить]"))).click();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[title=Закрыть]"))).click();
    }

    public void logout() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#PH_authMenu_button"))).click();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".x-ph__auth_list__item__logout"))).click();
    }

}
