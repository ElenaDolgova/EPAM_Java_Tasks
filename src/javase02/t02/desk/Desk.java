package javase02.t02.desk;

import javase02.t01.pen.Pen;
import javase02.t02.Notebook.Notebook;

public class Desk {
    Pen pen;
    Notebook notebook;

//наличие этого предмета на столе
    public void CheckTheTable(){
        if (notebook.check&pen.check) {
            System.out.println("There is pen and notebook");

        }
        if(!(notebook.check)&!(pen.check)){
            System.out.println("There is no pen and notebook");
        }
        if (!notebook.check&pen.check){
            System.out.println("There is no notebook");
        }
        if (notebook.check&!pen.check){
            System.out.println("There is no pen");
        }
    }
    public int Price(){

        if(!(notebook.check)&!(pen.check)){
            return 0;
        }
        if (!notebook.check&pen.check){
            return pen.getPrice();
        }
        if (notebook.check&!pen.check){
            return pen.getPrice();
        }
        return pen.getPrice()+notebook.getPrice();
    }
}
