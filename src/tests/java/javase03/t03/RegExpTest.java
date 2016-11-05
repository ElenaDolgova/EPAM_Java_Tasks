package javase03.t03;

import org.junit.Test;
public class RegExpTest {
    @Test
    public void testForRegular() {
       String name="D:\\Work\\src\\main\\resources\\Java.SE.03.Information handling_task_attachment.html";
        RegExp regExp=new RegExp();
        regExp.findSentence(name);
        regExp.checkNumber(name);
    }
}
