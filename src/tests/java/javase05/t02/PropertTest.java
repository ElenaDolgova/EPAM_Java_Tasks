package javase05.t02;

import org.junit.Test;

public class PropertTest {
   @Test
    public void properTest(){
    Proper proper=new Proper();
    proper.props();
       System.out.println(proper.getValue("lol"));
   }
}

