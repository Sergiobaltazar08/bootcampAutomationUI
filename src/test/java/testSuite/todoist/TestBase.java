package testSuite.todoist;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import page.todoist.LoginSection;
import page.todoist.MainPage;
import page.todoist.ProjectSection;
import session.Session;
import util.GetProperties;

public class TestBase {

    LoginSection loginSection = new LoginSection();
    MainPage mainPage = new MainPage();
    ProjectSection projectSection = new ProjectSection();

     // todo property file
     String email= GetProperties.getInstance().getEmail();
     String password = GetProperties.getInstance().getPassword();
     String nameProject = GetProperties.getInstance().getNameProject();
     String newNameProject = GetProperties.getInstance().getNewNameProject();



     @BeforeEach
     public void openBrowser(){
          // todo create property file
          Session.getInstance().getBrowser().get(GetProperties.getInstance().getHost());
     }

     @AfterEach
     public void closeBrowser(){
          Session.getInstance().closeSession();
     }

}
