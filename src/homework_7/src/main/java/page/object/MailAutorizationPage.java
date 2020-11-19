package homework_7.src.main.java.page.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.IOException;
import java.util.Properties;

public class MailAutorizationPage extends BasePage {

    protected String MAIL_RU_PAGE = "https://mail.ru/";

    @FindBy(xpath = "//*[@id='mailbox:login-input']")
    private WebElement loginField;

    @FindBy(xpath = "//*[@id='mailbox:submit-button']")
    private WebElement submitButton;

    @FindBy(css = "#mailbox [type=password]")
    private WebElement passwordField;

    public MailAutorizationPage(WebDriver driver) {
        super(driver);
    }

    public MailAutorizationPage open() {
        driver.get("https://mail.ru/");
        return new MailAutorizationPage(driver);
    }

    public void login() {
        Properties userProperties = new Properties();
        try {
            userProperties.load(this.getClass().getResourceAsStream("user.properties"));
        } catch (IOException e) {
            System.err.println("Unable to read user properties file");
            e.printStackTrace();
        }

        String login = userProperties.getProperty("login");
        loginField.sendKeys(login);
        submitButton.click();

        String password = userProperties.getProperty("password");
        webDriverWait.until(ExpectedConditions.elementToBeClickable(passwordField)).sendKeys(password);
        submitButton.click();
    }
}
