package homework_7.src.main.java.page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MailMainPage extends BasePage {

    public MailMainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(@href, 'drafts')]/div")
    protected WebElement draftsFolder;

    @FindBy(xpath = "//a[contains(@href, 'sent')]/div")
    protected WebElement sentFolder;

    @FindBy(xpath = "//a[contains(@href, '1')]")
    protected WebElement testFolder;

    @FindBy(xpath = "//a[contains(@href, 'inbox')]")
    protected WebElement inboxFolder;

    @FindBy(xpath = "//a[contains(@href, 'trash')]")
    protected WebElement trashFolder;

    @FindBy(xpath = "//*[@id='PH_user-email']")
    protected WebElement userNameFiled;

    @FindBy(css = "#PH_authMenu_button")
    protected WebElement userMenuButton;

    @FindBy(css = ".x-ph__auth_list__item__logout")
    protected WebElement exitButton;

    public String getUserNameFiled() {
        return webDriverWait.until(ExpectedConditions.elementToBeClickable(userNameFiled)).getText();
    }

    public void openDraftsFolder() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(draftsFolder)).click();
    }

    public void openSentFolder() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(sentFolder)).click();
    }

    public void logout() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(userMenuButton)).click();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(exitButton)).click();
    }

    public void openInboxFolder() {
        inboxFolder.click();
    }

    public void openTestFolder() {
        testFolder.click();
    }

    public void openTrashFolder() {
        trashFolder.click();
    }

    public void openUserMenuFiled() {
        userMenuButton.click();
    }

    public void clickExitButton() {
        exitButton.click();
    }


}