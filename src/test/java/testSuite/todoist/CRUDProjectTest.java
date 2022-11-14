package testSuite.todoist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CRUDProjectTest extends TestBase {

    @Test
    public void verifyCRUDProject() {

        //login Page
        mainPage.sessionButton.click();
        loginSection.emailTxtBox.setText(email);
        loginSection.passwordTxtBox.setText(password);
        loginSection.loginButton.click();

        //Create Project
        projectSection.addNewProjectButton.click();
        projectSection.nameProjectTxtBox.setText(nameProject);
        projectSection.addButton.click();
        Assertions.assertEquals(projectSection.editProjectLabel.getAttribute("textContent"), nameProject, "NO SE ENCONTRO EL PROYECTO");

        //Update Project
        projectSection.editProjectLabel.click();
        projectSection.editProjectTxtBox.cleanSetText(newNameProject);
        projectSection.saveProjectButton.click();
        Assertions.assertEquals(projectSection.editProjectLabel.getAttribute("textContent"), newNameProject, "NO SE ACTUALIZO EL PROYECTO");

        //Delete Project
        projectSection.clickOnMenuProject(newNameProject);
        projectSection.deleteProjectButton.click();
        projectSection.confirmDeleteProjectButton.click();
        Assertions.assertFalse(projectSection.isProjectDisplayedInList(newNameProject));

    }
}
