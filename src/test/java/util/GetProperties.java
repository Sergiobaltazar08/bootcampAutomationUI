package util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetProperties {
     private static GetProperties getProperties= null;
     private String browser;
     private String host;
     private String user;
     private String pwd;

    private String emailSender;
    private String emailReceiver;
    private String subjectEmail;
    private String bodyEmail;

    // Practice 2
    private String email;
    private String password;
    private String nameProject;
    private String newNameProject;


     private GetProperties(){
         Properties properties = new Properties();
         String nameFile="todoly.properties";
         InputStream inputStream = getClass().getClassLoader().getResourceAsStream(nameFile);
         if(inputStream!= null){
             try {
                 properties.load(inputStream);
                 browser=properties.getProperty("browser");
                 host=properties.getProperty("host");
                 user=properties.getProperty("user");
                 pwd=properties.getProperty("pwd");
                 emailSender=properties.getProperty("emailSender");
                 emailReceiver=properties.getProperty("emailReceiver");
                 subjectEmail=properties.getProperty("subjectEmail");
                 bodyEmail=properties.getProperty("bodyEmail");
                 email=properties.getProperty("email");
                 password=properties.getProperty("password");
                 nameProject=properties.getProperty("nameProject");
                 newNameProject=properties.getProperty("newNameProject");

             } catch (IOException e) {
                 throw new RuntimeException(e);
             }
         }
     }

     public static GetProperties getInstance(){
         if (getProperties == null)
             getProperties=new GetProperties();
         return getProperties;
     }

    public String getBrowser() {
        return browser;
    }

    public String getHost() {
        return host;
    }

    public String getUser() {
        return user;
    }

    public String getPwd() {
        return pwd;
    }
    public String getEmailReceiver() {
        return emailReceiver;
    }

    public String getEmailSender() {
        return emailSender;
    }

    public String getBodyEmail() {
        return bodyEmail;
    }

    public String getSubjectEmail() {
        return subjectEmail;
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
}
