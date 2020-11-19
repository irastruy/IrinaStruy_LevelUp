package homework_7.src.main.java.page.object;

import homework_7.src.main.java.page.object.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MailCreateLetterPage extends BasePage {

    @FindBy(css = ".compose-button")
    protected WebElement createLetterButton;

    @FindBy(css = "[data-name=to] input")
    protected WebElement addressField;

    @FindBy(css = "input[name=Subject]")
    protected WebElement themeField;

    @FindBy(css = "div[role=textbox] div")
    protected WebElement textBodyField;

    @FindBy(css = "span[title=Сохранить]")
    protected WebElement saveButton;

    @FindBy(css = "button[title=Закрыть]")
    protected WebElement closeButton;

    @FindBy(css = "[title=Отправить]")
    protected WebElement sendButton;


    public MailCreateLetterPage(WebDriver driver) {
        super(driver);
    }

    public void createLetter(String address, String theme, String textBody) {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(createLetterButton)).click();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(addressField)).sendKeys(address);
        themeField.sendKeys(theme);
        textBodyField.sendKeys(textBody);
    }

    public void saveAndCloseLetter() {
        saveButton.click();
        closeButton.click();
    }

    public void sendLetter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(sendButton)).click();
    }


}
