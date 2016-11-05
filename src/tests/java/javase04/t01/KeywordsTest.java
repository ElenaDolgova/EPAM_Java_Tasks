package javase04.t01;

import org.junit.Test;

public class KeywordsTest {
    @Test
    public void TestForKeys(){
        String name="D:\\Work\\src\\main\\resources\\BaseThing.java";
        String nameOut="D:\\Work\\src\\main\\resources\\keywords.txt";
        Keywords keywords=new Keywords();
        keywords.out(nameOut,keywords.findKeywords(name));
    }
}
