package page.todoist;

import control.Button;
import org.openqa.selenium.By;

public class MainPage {
    public Button sessionButton = new Button(By.xpath("//ul/li/a[@href='/auth/login']"));
}
