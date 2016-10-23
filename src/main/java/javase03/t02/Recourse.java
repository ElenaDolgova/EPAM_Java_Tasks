package javase03.t02;

import java.util.Locale;
import java.util.ResourceBundle;

public class Recourse {
    private ResourceBundle resourceBundle;

    public  Recourse(Locale locale){
        resourceBundle=ResourceBundle.getBundle("MyResources",locale);
    }

    public String getValue(String key){
        return  resourceBundle.getString(key);
    }
}
