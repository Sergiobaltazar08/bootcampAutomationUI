package testSuite.yopmail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import page.yopmail.InboxPage;
import page.yopmail.MainPage;
import page.yopmail.MenuPage;
import session.Session;
import util.GetProperties;

public class TestBase {

     MainPage mainPage= new MainPage();
     InboxPage inboxPage = new InboxPage();
     MenuPage menuPage = new MenuPage();

     // todo property file
     String emailSender= GetProperties.getInstance().getEmailSender();
     String emailReceiver = GetProperties.getInstance().getEmailReceiver();
     String subjectEmail = GetProperties.getInstance().getSubjectEmail();
     String bodyEmail = GetProperties.getInstance().getBodyEmail();



     @BeforeEach
     public void openBrowser(){
          // todo create property file
          Session.getInstance().getBrowser().get(GetProperties.getInstance().getHost());
     }

     @AfterEach
     public void closeBrowser(){
          Session.getInstance().closeSession();
     }

}
