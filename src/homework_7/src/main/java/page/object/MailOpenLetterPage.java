package homework_7.src.main.java.page.object;

import homework_7.src.main.java.page.object.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import homework_7.src.test.java.data.TestDataConstants;

public class MailOpenLetterPage extends BasePage {

    @FindBy(xpath = "//*[@class='metathread__contain']")
    protected WebElement openLetterToMyselfButton;

    @FindBy(css = "[class=thread__subject]")
    protected WebElement themeFiled;

    @FindBy(css = "[class=letter-contact]")
    protected WebElement addressFiled;

    @FindBy(css = "[class=letter-body]")
    protected WebElement textBodyFiled;

    @FindBy(xpath = "//*[@title='" + TestDataConstants.TITLE_ADDRESS + "']")
    protected WebElement titleAddressFiled;

    @FindBy(css = "span[title=Удалить]")
    protected WebElement deleteButton;

    public String getAddressValue() {
        return webDriverWait.until(ExpectedConditions.elementToBeClickable(addressFiled)).getText();
    }

    public String getThemeValue() {
        return webDriverWait.until(ExpectedConditions.elementToBeClickable(themeFiled)).getText();
    }

    public String getTextBodyValue() {
        return webDriverWait.until(ExpectedConditions.elementToBeClickable(textBodyFiled)).getText();
    }

    public String getTitleValue() {
        return webDriverWait.until(ExpectedConditions.elementToBeClickable(titleAddressFiled)).getText();
    }

    public void openLetterBlock() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(openLetterToMyselfButton)).click();
    }

    public void deleteLetter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(deleteButton)).click();
    }

    public void openLetter() {
        titleAddressFiled.click();
    }

    public MailOpenLetterPage(WebDriver driver) {
        super(driver);
    }

}
