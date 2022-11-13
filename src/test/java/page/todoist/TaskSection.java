package page.todoist;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class TaskSection {


    //create task
    public Button addTaskButton = new Button(By.xpath("//button[@class='plus_add_button']"));

    public TextBox nameTaskTxtBox = new TextBox(By.xpath("//span[@data-offset-key]"));
    public TextBox descriptionTaskTxtBox = new TextBox(By.xpath("//textarea[@class='task_editor__description_field no-focus-marker']"));
    public Button actionButton = new Button(By.xpath("//div[@class='task_list_item__actions task_list_item__actions--active']"));
    public Button saveTaskButton = new Button(By.xpath("//button[@data-testid='task-editor-submit-button']"));
    public Label nameTaskLabel = new Label(By.xpath("//div[@class='markdown_content task_content']"));

    //update task

    public Button editTaskButton = new Button(By.xpath("//div[@data-action-hint='task-detail-view-edit']"));
    public Button updateTaskButton = new Button(By.xpath("//button[@type='submit']"));

    public Button closeButtonTask = new Button(By.xpath("//button[@aria-label='Cerrar ventana']"));
    public TextBox newNameTaskTxtBox = new TextBox(By.xpath("//span[contains(text(),'Task_Sergio')]"));
    public TextBox newDescriptionTaskTxtBox = new TextBox(By.xpath("//textarea[@class='task_editor__description_field no-focus-marker']"));

    //Delete Task
    public Button menuTaskButton = new Button(By.xpath("//button[@data-testid='more_menu']"));
    public Button deleteTaskButton = new Button(By.xpath("//div[text()='Eliminar tarea']"));
    public Button confirmDeleteButton = new Button(By.xpath("//button[@type='submit']"));
    public boolean isProjectDisplayedInList(String nameTask) {
        Label taskCreated = new Label(By.xpath("//div[@class='markdown_content task_content' and contains(text(), '"+nameTask+"')]"));
        return taskCreated.isControlDisplayed();
    }
    public void editTaskInformation(String nameTask, String text) {
        TextBox taskCreated = new TextBox(By.xpath("//span[contains(text(),'"+nameTask+"')]"));
        taskCreated.setText(text);
    }
    public void editTaskDescription(String descriptionTask, String text) {
        TextBox descriptionTaskCreated = new TextBox(By.xpath("//textarea[contains(text(),'"+descriptionTask+"')]"));
        descriptionTaskCreated.setText(text);
    }
//    public Button addNewProjectButton = new Button(By.xpath("//div/button[@class='a8af2163 _98cd5c3f _45ffe137 ef4c88db f9408a0e']"));
//    public TextBox nameProjectTxtBox = new TextBox(By.id("edit_project_modal_field_name"));
//    public Button addButton = new Button(By.xpath("//button[@type='submit']"));
//    public Label editProjectLabel = new Label(By.xpath("//div/h1[@class='editable']"));
//    public TextBox editProjectTxtBox = new TextBox(By.xpath("//input[@aria-describedby='rename_header_hint']"));
//
//    public Button editProjectButton = new Button(By.xpath("//input[@aria-describedby='rename_header_hint']"));
//    public Button saveProjectButton = new Button(By.xpath("//button[@type='submit']"));
//    public Button deleteProjectButton = new Button(By.xpath("//div[text()='Eliminar proyecto']"));
//    public Button confirmDeleteProjectButton = new Button(By.xpath("//span[text()='Eliminar']"));
//
//    public void clickOnMenuProject(String nameProject) {
//        Button projectCreated = new Button(By.xpath("//a[contains(@aria-label,'" + nameProject + "')]/parent::div/div/button"));
//        projectCreated.click();
//    }
//
//    public boolean isProjectDisplayedInList(String nameProject) {
//        Label projectCreated = new Label(By.xpath("//a/span[text()='" + nameProject + "']"));
//        return projectCreated.isControlDisplayed();
//    }
}