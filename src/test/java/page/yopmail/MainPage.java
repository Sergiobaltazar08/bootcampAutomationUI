package page.yopmail;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class MainPage {
    public TextBox emailTxtBox= new TextBox(By.id("login"));
    public Button emailButtonLogin= new Button(By.id("refreshbut"));
    public Button cleanButtonLogin= new Button(By.id("clearbut"));

}
