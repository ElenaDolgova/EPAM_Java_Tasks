package javase03.t01;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        Locale locale = Locale.ENGLISH;
        ResourceBundle myResources = ResourceBundle.getBundle("MyResources",locale);
        String string = myResources.getString("HelpKey");
        System.out.println("HelpKey: " + string);
    }
}
