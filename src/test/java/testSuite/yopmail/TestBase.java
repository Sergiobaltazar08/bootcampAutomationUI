package testSuite.yopmail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import page.yopmail.InboxPage;
import page.yopmail.MainPage;
import page.yopmail.MenuPage;
import session.Session;
import util.GetPropertiesYopmail;

public class TestBase {

    MainPage mainPage = new MainPage();
    InboxPage inboxPage = new InboxPage();
    MenuPage menuPage = new MenuPage();

    // todo property file
    String emailSender = GetPropertiesYopmail.getInstance().getEmailSender();
    String emailReceiver = GetPropertiesYopmail.getInstance().getEmailReceiver();
    String subjectEmail = GetPropertiesYopmail.getInstance().getSubjectEmail();
    String bodyEmail = GetPropertiesYopmail.getInstance().getBodyEmail();

    @BeforeEach
    public void openBrowser() {
        // todo create property file
        Session.getInstance().getBrowser().get(GetPropertiesYopmail.getInstance().getHost());
    }

    @AfterEach
    public void closeBrowser() {
        Session.getInstance().closeSession();
    }

}
