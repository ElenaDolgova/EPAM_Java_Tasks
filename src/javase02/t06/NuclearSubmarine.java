package javase02.t06;

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
