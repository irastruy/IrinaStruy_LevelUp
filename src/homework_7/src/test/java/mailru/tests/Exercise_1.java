package homework_7.src.test.java.mailru.tests;

import homework_7.src.main.java.page.object.FolderWithLetterPage;
import homework_7.src.main.java.page.object.MailAutorizationPage;
import homework_7.src.main.java.page.object.MailCreateLetterPage;
import homework_7.src.main.java.page.object.MailMainPage;
import homework_7.src.test.java.data.TestDataProviders;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Exercise_1 extends BaseTest{

    @Test(dataProvider = "testDataForNoTestFolderExercise", dataProviderClass = TestDataProviders.class)
    public void exercise_1(String address, String textBody, String theme, String fullName) {

        MailAutorizationPage authPage = new MailAutorizationPage(driver);
        authPage.open();
        authPage.login();

        MailMainPage mainPage = new MailMainPage(driver);
        Assert.assertEquals(mainPage.getUserNameFiled(), address);

        MailCreateLetterPage createLetterPage = new MailCreateLetterPage(driver);
        createLetterPage.createLetter(address, theme, textBody);
        createLetterPage.saveAndCloseLetter();

        mainPage.openDraftsFolder();

        FolderWithLetterPage folderLetterPage = new FolderWithLetterPage(driver);
        Assert.assertEquals(folderLetterPage.getThemeValue(), theme);
        Assert.assertEquals(folderLetterPage.getAddressValue(), address);
        Assert.assertEquals(folderLetterPage.getTextBodyValue(), textBody);

        folderLetterPage.clickAddressFiled();

        createLetterPage.sendLetter();

        mainPage.openDraftsFolder();
        String titleInDraftFolder = folderLetterPage.getTitleInFiledWithLetterValue();
        Assert.assertEquals(titleInDraftFolder, "У вас нет незаконченных\nили неотправленных писем");

        mainPage.openSentFolder();
        Assert.assertEquals(folderLetterPage.getAddressValue(), address);

        mainPage.logout();
    }
}
