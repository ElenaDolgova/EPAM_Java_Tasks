package javase04.t02;

import org.junit.Test;

public class KeywordsCharacterTest {
    @Test
    public void KeywordsCharacterTest(){
    String name="D:\\Work\\src\\main\\resources\\BaseThing.java";
    String nameOut="D:\\Work\\src\\main\\resources\\KeywordsCharacterTest.txt";
        KeywordsCharacter kC = new KeywordsCharacter();
        kC.writer(nameOut,kC.readFile(name));
    }
}
