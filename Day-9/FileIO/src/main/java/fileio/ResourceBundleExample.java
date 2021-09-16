package fileio;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleExample {
    public static void main(String[] args) {
        Locale locale=new Locale("fr","Fr");
        ResourceBundle labels=ResourceBundle.getBundle("message",locale);
        System.out.println(labels.getString("Login"));

        ResourceBundle label=ResourceBundle.getBundle("application");
        System.out.println(label.getKeys());

    }
}
