package page.yopmail;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import session.Session;

public class InboxPage {
    public Button newEmailButton= new Button(By.id("newmail"));

    public TextBox receptorEmailTxtBox= new TextBox(By.id("msgto"));
    public TextBox subjectEmailTxtBox= new TextBox(By.id("msgsubject"));
    public TextBox bodyEmailTxtBox= new TextBox(By.id("msgbody"));

    public Button sendButton= new Button(By.id("msgsend"));

    //public Button homeButton= new Button(By.xpath("//a[contains(text(),'Mi correo')]"));

    public WebElement searchMail(String subject){
        return Session.getInstance().getBrowser().findElement(By.xpath("//div[contains(text(),'"+subject+"')]"));
    }


}
