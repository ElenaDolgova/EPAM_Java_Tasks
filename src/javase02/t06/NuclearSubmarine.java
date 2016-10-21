package javase02.t06;

import javase02.t07.RightNuclearSubmarine;

@RightNuclearSubmarine(
        swim="Ii path",
        speed=500,
        color= "grey"
)
public class NuclearSubmarine {
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
