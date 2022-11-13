package testSuite.todoist;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CRUDProjectTest extends TestBase {

    @Test
    public void verifyCRUDProject() throws InterruptedException {

        mainPage.sessionButton.click();
        loginSection.emailTxtBox.setText(email);
        loginSection.passwordTxtBox.setText(password);
        loginSection.loginButton.click();

        projectSection.addNewProjectButton.click();
        projectSection.nameProjectTxtBox.setText(nameProject);
        projectSection.addButton.click();
        Assertions.assertEquals(projectSection.editProjectLabel.getAttribute("textContent"),nameProject,"NO SE ENCONTRO EL PROYECTO");


        projectSection.editProjectLabel.click();
        //projectSection.editProjectLabel.waitEventInThePage();
        projectSection.editProjectTxtBox.cleanSetText(newNameProject);
        projectSection.saveProjectButton.click();
        Assertions.assertEquals(projectSection.editProjectLabel.getAttribute("textContent"),newNameProject,"NO SE ACTUALIZO EL PROYECTO");

        projectSection.clickOnMenuProject(newNameProject);
        projectSection.deleteProjectButton.click();
        projectSection.confirmDeleteProjectButton.click();
        Assertions.assertFalse(projectSection.isProjectDisplayedInList(newNameProject));

    }
}
