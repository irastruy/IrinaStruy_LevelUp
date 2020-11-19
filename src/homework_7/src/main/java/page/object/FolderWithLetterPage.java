package homework_7.src.main.java.page.object;

import homework_7.src.main.java.page.object.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FolderWithLetterPage extends BasePage {

    @FindBy(xpath = "//*[@class='llc__subject']/span")
    protected WebElement themeField;

    @FindBy(xpath = "//*[@class='ll-crpt']")
    protected WebElement addressField;

    @FindBy(xpath = "//*[@class='llc__snippet']/span")
    protected WebElement textBodyField;

    @FindBy(xpath = "//*[@class='octopus__title']")
    protected WebElement titleInFiledWithLetter;


    public String getTextBodyValue() {
        return webDriverWait.until(ExpectedConditions.elementToBeClickable(textBodyField)).getText();
    }

    public String getThemeValue() {
        return webDriverWait.until(ExpectedConditions.elementToBeClickable(themeField)).getText();
    }

    public String getAddressValue() {
        return webDriverWait.until(ExpectedConditions.elementToBeClickable(addressField)).getText();
    }

    public String getTitleInFiledWithLetterValue() {
        return webDriverWait.until(ExpectedConditions.elementToBeClickable(titleInFiledWithLetter)).getText();
    }

    public void clickAddressFiled() {
        addressField.click();
    }

    public FolderWithLetterPage(WebDriver driver) {
        super(driver);
    }
}
