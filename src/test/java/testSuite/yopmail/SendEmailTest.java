package testSuite.yopmail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

import java.util.Date;

public class SendEmailTest extends TestBase {

    @Test
    public void verifyReceiveEmail() throws InterruptedException {

        //create 1st mail
        subjectEmail = subjectEmail + new Date().getTime();
        mainPage.emailTxtBox.setText(emailReceiver);
        mainPage.emailButtonLogin.click();
        Thread.sleep(1000);
        menuPage.homeButton.click();

        //create 2dn mail
        mainPage.cleanButtonLogin.click();
        mainPage.emailTxtBox.setText(emailSender);
        mainPage.emailButtonLogin.click();
        Thread.sleep(1000);

        //create email
        inboxPage.newEmailButton.click();
        Session.getInstance().getBrowser().switchTo().frame("ifmail");
        Thread.sleep(1000);
        inboxPage.receptorEmailTxtBox.setText(emailReceiver);
        inboxPage.subjectEmailTxtBox.setText(subjectEmail);
        inboxPage.bodyEmailTxtBox.setText(bodyEmail);
        inboxPage.sendButton.click();
        Session.getInstance().getBrowser().switchTo().defaultContent();
        Thread.sleep(1000);

        //verify email
        menuPage.homeButton.click();
        mainPage.cleanButtonLogin.click();
        mainPage.emailTxtBox.setText(emailReceiver);
        mainPage.emailButtonLogin.click();
        Session.getInstance().getBrowser().switchTo().frame("ifinbox");
        Assertions.assertNotNull(inboxPage.searchMail(subjectEmail), "NO SE ENCONTRO EL CORREO");
        Assertions.assertEquals(inboxPage.searchMail(subjectEmail).getAttribute("textContent"), subjectEmail, "NO SE ENCONTRO EL CORREO");

    }
}
