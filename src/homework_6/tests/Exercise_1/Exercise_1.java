package homework_6.tests.Exercise_1;

import homework_6.tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Exercise_1 extends BaseTest {

    private String login = "istrui";

    protected String address = "istrui@mail.ru";
    protected String textBody = "hello, Petersburg";
    protected String theme = "text text";

    @Test
    public void execrise_1() {

      /*  Войти в почту
        Assert, что вход выполнен успешно
        Создать новое письмо (заполнить адресата, тему письма и тело)
        Сохранить его как черновик
        Verify, что письмо сохранено в черновиках
        Verify контент, адресата и тему письма (должно совпадать с пунктом 3)
        Отправить письмо
        Verify, что письмо исчезло из черновиков
        Verify, что письмо появилось в папке отправленные
        Выйти из учётной записи*/

        loginMail();
        String loginWebElement = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='PH_user-email']"))).getText();
        Assert.assertEquals(loginWebElement, address);

        createEmail(textBody, theme, address);
        saveAndCloseEmail();

        WebElement draftsElement = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@href, 'drafts')]/div")));
        draftsElement.click();
        // проверка темы
        String subjectWebElement = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='llc__subject']/span"))).getText();
        Assert.assertEquals(subjectWebElement, theme);
        // проверка адресата
        WebElement addressWebElement = driver.findElement(By.xpath("//*[@class='ll-crpt']"));
        Assert.assertEquals(addressWebElement.getText(), address);

        // проверка тела
        String textBodyWebElement = driver.findElement(By.xpath("//*[@class='llc__snippet']/span")).getText();
        Assert.assertEquals(textBodyWebElement, textBody);

        addressWebElement.click();

        sendLetter();

        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@href, 'drafts')]/div"))).click();
        String textDrafts = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='octopus__title']"))).getText();
        Assert.assertEquals(textDrafts, "У вас нет незаконченных\nили неотправленных писем");

        driver.findElement(By.xpath("//a[contains(@href, 'sent')]/div")).click();

        String addressSentWebElement = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='ll-crpt']"))).getText();
        Assert.assertEquals(addressSentWebElement, address);

        logout();

    }

}
