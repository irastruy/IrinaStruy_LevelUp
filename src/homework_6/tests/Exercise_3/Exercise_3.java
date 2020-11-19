package homework_6.tests.Exercise_3;

import homework_6.tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Exercise_3 extends BaseTest {

    private String address = "istrui@mail.ru";
    private String subject = "Новая тема письма";
    private String textBody = "новое тело письма";
    private String fullName = "Ирина Струй";

    @Test
    public void exercise_3() {

        /*Войти в почту
        Assert, что вход выполнен успешно
        Создать новое письмо (заполнить адресата (самого себя), тему письма и тело)
        Отправить письмо
        Verify, что письмо появилось в папке Входящие
        Verify контент, адресата и тему письма (должно совпадать с пунктом 3)
        Удалить письмо
        Verify что письмо появилось в папке Корзина
        Выйти из учётной записи
        */

        loginMail();
        String loginWebElement = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='PH_user-email']"))).getText();
        Assert.assertEquals(loginWebElement, address);

        createEmail(textBody, subject, address);
        sendLetter();

        driver.findElement(By.xpath("//a[contains(@href, 'inbox')]/div")).click();

        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='metathread__contain']"))).click();

        WebElement addressWebElement = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@title='Ирина Струй <istrui@mail.ru>']")));
        Assert.assertEquals(addressWebElement.getText(), fullName);

        addressWebElement.click();
        String subjectSendLetter = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class=thread__subject]"))).getText();
        Assert.assertEquals(subjectSendLetter, subject);

        String addressSendLetter = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class=letter-contact]"))).getText();
        Assert.assertEquals(addressSendLetter, fullName);

        String bodySendLetter = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class=letter-body]"))).getText();
        Assert.assertTrue(bodySendLetter.contains(textBody));

        driver.findElement((By.cssSelector("span[title=Удалить]"))).click();
        driver.findElement(By.xpath("//a[contains(@href, 'trash')]/div")).click();
        WebElement addressDeletedLetter = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@title='Ирина Струй <istrui@mail.ru>']")));
        Assert.assertEquals(addressDeletedLetter.getText(), fullName);

        logout();
    }
}
