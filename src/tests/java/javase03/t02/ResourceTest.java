package javase03.t02;

import org.junit.Test;

import java.util.Locale;

/**
 * Created by Litkovets Alexey on 23.10.2016.
 */
public class ResourceTest {
    @Test
    public void resTest() {
        Recourse res_ru = new Recourse(new Locale("ru"));
        System.out.println(res_ru.getValue("HelpKey"));

        Recourse res_en = new Recourse(new Locale("en"));
        System.out.println(res_en.getValue("HelpKey"));
    }
}
