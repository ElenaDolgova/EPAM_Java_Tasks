package javase02.t06;


import org.junit.Test;

public class TestNuclearSubmarine {

    @Test
    public void Test(){
        NuclearSubmarine.Motor motor= new NuclearSubmarine().new Motor();
        System.out.println(motor.swim());
        motor.toSwim();
        System.out.println(motor.swim());

    }
}
