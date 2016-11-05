package javase04.t03;

import org.junit.Test;

public class ChangeCodingTest {
    @Test
    public void ChangeCodingTest(){
        String name="D:\\Work\\src\\main\\resources\\utf8.txt";
        String nameOut="D:\\Work\\src\\main\\resources\\utf16.txt";
        ChangeCoding changeCoding=new ChangeCoding();
        changeCoding.read(name,nameOut);
    }
}
