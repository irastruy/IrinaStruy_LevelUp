package homework_6.tests.Exercise_2;

import homework_6.tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Exercise_2 extends BaseTest {

    private String login = "istrui";

    private String address = "istrui@mail.ru";
    private String theme = "Тест тест";
    private String textBody = "hello, Petersburg Тест";
    private String fullName = "Ирина Струй";

    @Test
    public void exercise_2() {

        /*Войти в почту
        Assert, что вход выполнен успешно
        Создать новое письмо (заполнить адресата (самого себя), тему письма (должно содержать слово Тест) и тело)
        Отправить письмо
        Verify, что письмо появилось в папке отправленные
        Verify, что письмо появилось в папке «Тест»
        Verify контент, адресата и тему письма (должно совпадать с пунктом 3)
        Выйти из учётной записи
        */

        loginMail();
        String loginWebElement = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='PH_user-email']"))).getText();
        Assert.assertEquals(loginWebElement, address);

        createEmail(textBody, theme, address);
        sendLetter();

        driver.findElement(By.xpath("//a[contains(@href, 'sent')]/div")).click();

        String addressSentWebElement = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@title='" + address + "']"))).getText();
        Assert.assertEquals(addressSentWebElement, address);

        //driver.findElement(By.xpath("//div[contains(text(),'Тест')]")).click();

        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@href, '1')]")));
        //driver.findElement(By.xpath("//a[contains(@href, 'tomyself')]/following-sibling::a/div")).click();
        Assert.assertEquals(addressSentWebElement, address);

        String subjectWebElement = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='llc__subject']/span"))).getText();
        Assert.assertEquals(subjectWebElement, "Self: " + theme);

        String textBodyWebElement = driver.findElement(By.xpath("//*[@class='llc__snippet']/span")).getText();
        Assert.assertEquals(textBodyWebElement, textBody);

        logout();


    }
}