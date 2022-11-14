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
    public Button saveTaskButton = new Button(By.xpath("//button[@data-testid='task-editor-submit-button']"));
    public Label nameTaskLabel = new Label(By.xpath("//div[@class='markdown_content task_content']"));

    //update task

    public Button editTaskButton = new Button(By.xpath("//div[@data-action-hint='task-detail-view-edit']"));
    public Button updateTaskButton = new Button(By.xpath("//button[@type='submit']"));

    public Button closeButtonTask = new Button(By.xpath("//button[@aria-label='Cerrar ventana']"));

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
}