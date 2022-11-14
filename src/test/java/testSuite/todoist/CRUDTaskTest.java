package testSuite.todoist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.interactions.Actions;
import page.todoist.TaskSection;
import session.Session;

public class CRUDTaskTest extends TestBase {

    @Test
    public void verifyCRUDProject() {

        //login
        mainPage.sessionButton.click();
        loginSection.emailTxtBox.setText(email);
        loginSection.passwordTxtBox.setText(password);
        loginSection.loginButton.click();

        //new project
        projectSection.addNewProjectButton.click();
        projectSection.nameProjectTxtBox.setText(nameProject);
        projectSection.addButton.click();
        Assertions.assertEquals(projectSection.editProjectLabel.getAttribute("textContent"), nameProject, "NO SE ENCONTRO EL PROYECTO");


        //new task
        taskSection.addTaskButton.click();
        taskSection.nameTaskTxtBox.setText(NameTask);
        taskSection.descriptionTaskTxtBox.setText(NameTask + "_Description");
        taskSection.saveTaskButton.click();
        Assertions.assertEquals(taskSection.nameTaskLabel.getAttribute("textContent"), NameTask, "NO SE ENCONTRO LA TAREA");

        //Update
        taskSection.nameTaskLabel.click();
        taskSection.editTaskButton.click();
        taskSection.editTaskInformation(NameTask, "_Modified");
        taskSection.editTaskDescription(NameTask, "_Modified");
        newNameTask = NameTask + "_Modified";
        taskSection.updateTaskButton.click();
        taskSection.closeButtonTask.click();
        Assertions.assertEquals(taskSection.nameTaskLabel.getAttribute("textContent"), newNameTask, "NO SE ENCONTRO LA TAREA");

        //delete task
        taskSection.menuTaskButton.click();
        taskSection.deleteTaskButton.click();
        taskSection.confirmDeleteButton.click();
        Assertions.assertFalse(taskSection.isProjectDisplayedInList(newNameTask));
    }
}
