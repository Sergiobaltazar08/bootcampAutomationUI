package testSuite.todoist;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import page.todoist.LoginSection;
import page.todoist.MainPage;
import page.todoist.ProjectSection;
import page.todoist.TaskSection;
import session.Session;
import util.GetPropertiesTodoist;

public class TestBase {

    LoginSection loginSection = new LoginSection();
    MainPage mainPage = new MainPage();
    ProjectSection projectSection = new ProjectSection();
    TaskSection taskSection = new TaskSection();

    // todo property file
    String email = GetPropertiesTodoist.getInstance().getEmail();
    String password = GetPropertiesTodoist.getInstance().getPassword();
    String nameProject = GetPropertiesTodoist.getInstance().getNameProject();
    String newNameProject = GetPropertiesTodoist.getInstance().getNewNameProject();
    String NameTask = GetPropertiesTodoist.getInstance().getNameTask();
    String newNameTask = GetPropertiesTodoist.getInstance().getNewNameTask();

    @BeforeEach
    public void openBrowser() {
        // todo create property file
        Session.getInstance().getBrowser().get(GetPropertiesTodoist.getInstance().getHost());
    }

    @AfterEach
    public void closeBrowser() {
        Session.getInstance().closeSession();
    }

}
