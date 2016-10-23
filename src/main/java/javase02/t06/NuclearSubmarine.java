package javase02.t06;


import javase02.t07.RightNuclearSubmarine;

@RightNuclearSubmarine(

        speed=500,
        color= "grey"
)
public class NuclearSubmarine {
    int speed;
    String color;

    Motor motor;
    public NuclearSubmarine(){
        motor=new Motor();
    }
    public class Motor{
        boolean flash;

        public Motor(){
            this.flash=false;
        }
        public String swim(){
            if(!flash){
                return "Nuclear Submarine is not swimming.";
            }else{
                return "Nuclear Submarine is swimming.";
            }
        }
        public void toSwim(){
            this.flash=true;
        }
    }
}
