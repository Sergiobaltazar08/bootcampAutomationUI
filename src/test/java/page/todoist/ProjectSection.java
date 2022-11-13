package page.todoist;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class ProjectSection {


    public Button addNewProjectButton = new Button(By.xpath("//div/button[@class='a8af2163 _98cd5c3f _45ffe137 ef4c88db f9408a0e']"));
    public TextBox nameProjectTxtBox = new TextBox(By.id("edit_project_modal_field_name"));
    public Button addButton = new Button(By.xpath("//button[@type='submit']"));
    public Label editProjectLabel = new Label(By.xpath("//div/h1[@class='editable']"));
    public TextBox editProjectTxtBox = new TextBox(By.xpath("//input[@aria-describedby='rename_header_hint']"));

    public Button editProjectButton = new Button(By.xpath("//input[@aria-describedby='rename_header_hint']"));
    public Button saveProjectButton = new Button(By.xpath("//button[@type='submit']"));
    public Button deleteProjectButton = new Button(By.xpath("//div[text()='Eliminar proyecto']"));
    public Button confirmDeleteProjectButton = new Button(By.xpath("//span[text()='Eliminar']"));

    public void clickOnMenuProject(String nameProject) {
        Button projectCreated = new Button(By.xpath("//a[contains(@aria-label,'" + nameProject + "')]/parent::div/div/button"));
        projectCreated.click();
    }

    public boolean isProjectDisplayedInList(String nameProject) {
        Label projectCreated = new Label(By.xpath("//a/span[text()='" + nameProject + "']"));
        return projectCreated.isControlDisplayed();
    }
}