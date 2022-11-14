package util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetPropertiesYopmail {
    private static GetPropertiesYopmail getProperties = null;
    private String browser;
    private String host;
    private String emailSender;
    private String emailReceiver;
    private String subjectEmail;
    private String bodyEmail;

    protected GetPropertiesYopmail() {
        Properties properties = new Properties();
        String nameFile = "yopmail.properties";
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(nameFile);
        if (inputStream != null) {
            try {
                properties.load(inputStream);
                browser = properties.getProperty("browser");
                host = properties.getProperty("host");
                emailSender = properties.getProperty("emailSender");
                emailReceiver = properties.getProperty("emailReceiver");
                subjectEmail = properties.getProperty("subjectEmail");
                bodyEmail = properties.getProperty("bodyEmail");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static GetPropertiesYopmail getInstance() {
        if (getProperties == null) getProperties = new GetPropertiesYopmail();
        return getProperties;
    }

    public String getBrowser() {
        return browser;
    }

    public String getHost() {
        return host;
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
}
