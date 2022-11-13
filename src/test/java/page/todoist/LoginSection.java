package page.todoist;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginSection {
    public TextBox emailTxtBox = new TextBox(By.xpath("//input[@type='email']"));
    public TextBox passwordTxtBox = new TextBox(By.xpath("//input[@type='password']"));
    public Button loginButton= new Button(By.xpath("//button[@type='submit']"));


    public void login(String user, String pwd){
        emailTxtBox.setText(user);
        passwordTxtBox.setText(pwd);
        loginButton.click();
    }
}
