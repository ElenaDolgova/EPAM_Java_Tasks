package tests.javase02.t06;

import javase02.t06.NuclearSubmarine;
import org.testng.annotations.Test;

public class TestNuclearSubmarine {

    @Test
    public void Test(){
        //NuclearSubmarine nuclearSubmarine= new NuclearSubmarine();
        NuclearSubmarine.Motor motor= new NuclearSubmarine().new Motor();
        System.out.println(motor.swim());
        motor.toSwim();
        System.out.println(motor.swim());

    }
}
