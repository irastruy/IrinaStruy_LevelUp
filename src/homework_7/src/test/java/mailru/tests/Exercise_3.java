package homework_7.src.test.java.mailru.tests;

import homework_7.src.main.java.page.object.*;
import homework_7.src.test.java.data.TestDataProviders;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Exercise_3 extends BaseTest {

    @Test(dataProvider = "testDataForNoTestFolderExercise", dataProviderClass = TestDataProviders.class)
    public void exercise_3(String address, String textBody, String theme, String fullName) {

        MailAutorizationPage authPage = new MailAutorizationPage(driver);
        authPage.open();
        authPage.login();

        MailMainPage mainPage = new MailMainPage(driver);
        Assert.assertEquals(mainPage.getUserNameFiled(), address);

        MailCreateLetterPage createLetterPage = new MailCreateLetterPage(driver);
        createLetterPage.createLetter(address, theme, textBody);
        createLetterPage.sendLetter();

        mainPage.openInboxFolder();

        MailOpenLetterPage openLetterPage = new MailOpenLetterPage(driver);
        openLetterPage.openLetterBlock();
        Assert.assertEquals(openLetterPage.getTitleValue(), fullName);

        openLetterPage.openLetter();
        FolderWithLetterPage folderLetterPage = new FolderWithLetterPage(driver);
        Assert.assertEquals(folderLetterPage.getThemeValue(), theme);
        Assert.assertEquals(folderLetterPage.getAddressValue(), address);
        Assert.assertEquals(folderLetterPage.getTextBodyValue(), textBody);

        openLetterPage.deleteLetter();
        mainPage.openTrashFolder();
        Assert.assertEquals(openLetterPage.getTitleValue(), fullName);

        mainPage.logout();
    }
}

