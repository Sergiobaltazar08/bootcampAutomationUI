package util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetPropertiesTodoist {
    private static GetPropertiesTodoist getProperties = null;
    private String browser;
    private String host;

    // Practice 2
    private String email;
    private String password;
    private String nameProject;
    private String newNameProject;

    //Practice 3
    private String NameTask;
    private String newNameTask;

    protected GetPropertiesTodoist() {
        Properties properties = new Properties();
        String nameFile = "todoist.properties";
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(nameFile);
        if (inputStream != null) {
            try {
                properties.load(inputStream);
                browser = properties.getProperty("browser");
                host = properties.getProperty("host");
                email = properties.getProperty("email");
                password = properties.getProperty("password");
                nameProject = properties.getProperty("nameProject");
                newNameProject = properties.getProperty("newNameProject");
                NameTask = properties.getProperty("NameTask");
                newNameTask = properties.getProperty("newNameTask");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static GetPropertiesTodoist getInstance() {
        if (getProperties == null)
            getProperties = new GetPropertiesTodoist();
        return getProperties;
    }

    public String getBrowser() {
        return browser;
    }

    public String getHost() {
        return host;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getNameProject() {
        return nameProject;
    }

    public String getNewNameProject() {
        return newNameProject;
    }

    public String getNameTask() {
        return NameTask;
    }

    public String getNewNameTask() {
        return newNameTask;
    }
}
