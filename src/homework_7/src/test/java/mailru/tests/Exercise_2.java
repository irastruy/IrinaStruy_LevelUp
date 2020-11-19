package homework_7.src.test.java.mailru.tests;

import homework_7.src.main.java.page.object.FolderWithLetterPage;
import homework_7.src.main.java.page.object.MailAutorizationPage;
import homework_7.src.main.java.page.object.MailCreateLetterPage;
import homework_7.src.main.java.page.object.MailMainPage;
import homework_7.src.test.java.data.TestDataProviders;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Exercise_2 extends BaseTest {

    @Test(dataProvider = "testDataForTestFolderExercise", dataProviderClass = TestDataProviders.class)
    public void exercise_2(String address, String textBody, String theme) {

        MailAutorizationPage authPage = new MailAutorizationPage(driver);
        authPage.open();
        authPage.login();

        MailMainPage mainPage = new MailMainPage(driver);
        Assert.assertEquals(mainPage.getUserNameFiled(), address);

        MailCreateLetterPage createLetterPage = new MailCreateLetterPage(driver);
        createLetterPage.createLetter(address, theme, textBody);
        createLetterPage.sendLetter();

        mainPage.openSentFolder();
        FolderWithLetterPage folderLetterPage = new FolderWithLetterPage(driver);
        Assert.assertEquals(folderLetterPage.getAddressValue(), address);

        mainPage.openTestFolder();
        Assert.assertEquals(folderLetterPage.getAddressValue(), address);
        Assert.assertEquals(folderLetterPage.getTextBodyValue(), textBody);
        Assert.assertEquals(folderLetterPage.getThemeValue(), "Self: " + theme);

        mainPage.logout();

    }
}