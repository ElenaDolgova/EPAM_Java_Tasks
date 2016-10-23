package javase03.t01;

import javase03.t01.CrazyLogger;
import org.junit.Test;

public class MainLol {

    @Test
    public static void main(String[] args){
        CrazyLogger crazyLogger=new CrazyLogger();
        crazyLogger.addMessage();
        crazyLogger.addMessage();
        crazyLogger.addMessage();
        crazyLogger.find();

    }
}
